package main.equalizes_jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.equalizes_jsp.dao.DaoEscola;
import main.equalizes_jsp.models.Escola;

public class EscolaController extends HttpServlet {
	private final DaoEscola escolaDao = DaoEscola.getInstance();
	private static final Logger LOGGER = Logger.getLogger(EscolaController.class.getName());

	@Override
	protected void doPost(final HttpServletRequest req, final HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse res)
			throws ServletException, IOException {
		final String action = req.getServletPath();
		try {
			switch (action) {
			case "/cadastro_escola": {
				insertEscola(req, res);
				break;
			}
			case "/atualizar_escola": {
				updateEscola(req, res);
				break;
			}
			case "/delete_escola": {
				deleteEscola(req, res);
				break;
			}

			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "SQL Error", e);
		}
	}

	private void updateEscola(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long escola_id = Long.parseLong(req.getParameter("escola_id"));
		final int qt_alunos = Integer.parseInt("qt_alunos");

		final Escola escola = new Escola(escola_id, qt_alunos);
		escolaDao.update(escola);
	}

	private void deleteEscola(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long escola_id = Long.parseLong(req.getParameter("escola_id"));

		final Escola escola = new Escola(escola_id);
		escolaDao.delete(escola);
	}

	private void insertEscola(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long telefone = Long.parseLong(req.getParameter("telefone"));
		final long cnpj = Long.parseLong(req.getParameter("cnpj"));
		final long cep = Long.parseLong(req.getParameter("cep"));
		final String nome = req.getParameter("nome");
		final String cidade = req.getParameter("cidade");
		final String uf = req.getParameter("uf");
		final String email = req.getParameter("email");

		final Escola escola = new Escola(cnpj, nome, uf, cep, cidade, email, telefone);
		escolaDao.save(escola);
	}

	private void listEscola(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/EscolaList.jsp");

		final List<Escola> listEscola = escolaDao.findAll();
		req.setAttribute("listEscola", listEscola);

		dispatcher.forward(req, res);
	}
}
