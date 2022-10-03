package main.equalizes_jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.equalizes_jsp.dao.DaoEmpresa;
import main.equalizes_jsp.models.Empresa;

public class EmpresaController extends HttpServlet {
	private final DaoEmpresa empresaDao = DaoEmpresa.getInstance();
	private static final Logger LOGGER = Logger.getLogger(EmpresaController.class.getName());

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
			case "/cadastro_empresa": {
				insertEmpresa(req, res);
				break;
			}
			case "/atualizar_empresa": {
				updateEmpresa(req, res);
				break;
			}
			case "/delete_empresa": {
				deleteEmpresa(req, res);
				break;
			}

			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "SQL Error", e);
		}
	}

	private void updateEmpresa(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long empresa_id = Long.parseLong(req.getParameter("empresa_id"));
		final String email = req.getParameter("email");
		final long telefone = Long.parseLong("telefone");

		final Empresa empresa = new Empresa(empresa_id, email, telefone);
		empresaDao.update(empresa);
		// TODO redirect????
		// fazer algo
	}

	private void deleteEmpresa(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long empresa_id = Long.parseLong(req.getParameter("empresa_id"));

		final Empresa empresa = new Empresa(empresa_id);
		empresaDao.delete(empresa);
	}

	private void insertEmpresa(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long empresa_id = Long.parseLong(req.getParameter("empresa_id"));
		final long telefone = Long.parseLong(req.getParameter("telefone"));
		final long cnpj = Long.parseLong(req.getParameter("cnpj"));
		final long cep = Long.parseLong(req.getParameter("cep"));
		final String razao_social = req.getParameter("razao_social");
		final String cidade = req.getParameter("cidade");
		final String uf = req.getParameter("uf");
		final String email = req.getParameter("email");

		final Empresa empresa = new Empresa(razao_social, cnpj, uf, cep, cidade, email, telefone);
		empresaDao.save(empresa);
	}

	private void listEmpresa(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/EmpresaList.jsp");

		final List<Empresa> listEmpresa = empresaDao.findAll();
		req.setAttribute("listEmpresa", listEmpresa);

		dispatcher.forward(req, res);
	}
}
