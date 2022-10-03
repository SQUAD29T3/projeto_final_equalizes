package main.equalizes_jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.equalizes_jsp.dao.DaoProjeto;
import main.equalizes_jsp.models.Projeto;

public class ProjetoController extends HttpServlet {
	private final DaoProjeto projetoDao = DaoProjeto.getInstance();
	private static final Logger LOGGER = Logger.getLogger(ProjetoController.class.getName());

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
			case "/cadastro_projeto": {
				insertProjeto(req, res);
				break;
			}
			case "/atualizar_projeto": {
				updateProjeto(req, res);
				break;
			}
			case "/delete_projeto": {
				deleteProjeto(req, res);
				break;
			}

			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "SQL Error", e);
		}
	}

	private void updateProjeto(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		// TODO nome certo dos campos
		final long projeto_id = Long.parseLong(req.getParameter("projeto_id"));
		final String estado = req.getParameter("estado");

		final Projeto projeto = new Projeto(projeto_id, estado);
		projetoDao.update(projeto);
		// TODO redirect????
		// fazer algo
	}

	private void deleteProjeto(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long projeto_id = Long.parseLong(req.getParameter("projeto_id"));

		final Projeto projeto = new Projeto(projeto_id);
		projetoDao.delete(projeto);
	}

	private void insertProjeto(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		String estado = req.getParameter("estado");
		long id_perfil_escola = Long.parseLong(req.getParameter("id_perfil_escola"));
		long id_perfil_empresa = Long.parseLong(req.getParameter("id_perfil_empresa"));
		long id_interese = Long.parseLong(req.getParameter("id_interese"));
		final Projeto projeto = new Projeto(id_interese, id_perfil_escola, id_perfil_empresa, estado);
		projetoDao.save(projeto);
	}

}
