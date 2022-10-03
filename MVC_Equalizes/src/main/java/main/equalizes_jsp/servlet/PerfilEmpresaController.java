package main.equalizes_jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.equalizes_jsp.dao.DaoPerfilEmpresa;
import main.equalizes_jsp.models.PerfilEmpresa;

public class PerfilEmpresaController extends HttpServlet {
	private final DaoPerfilEmpresa perfilEmpresaDao = DaoPerfilEmpresa.getInstance();
	private static final Logger LOGGER = Logger.getLogger(PerfilEmpresaController.class.getName());

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
			case "/cadastro_perfil_empresa": {
				insertPerfilEmpresa(req, res);
				break;
			}
			case "/atualizar_perfil_empresa": {
				updatePerfilEmpresa(req, res);
				break;
			}
			case "/delete_perfil_empresa": {
				deletePerfilEmpresa(req, res);
				break;
			}

			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "SQL Error", e);
		}
	}

	private void updatePerfilEmpresa(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		// TODO nome certo dos campos
		final long perfilEmpresa_id = Long.parseLong(req.getParameter("perfilEmpresa_id"));
		final String senha = req.getParameter("senha");

		final PerfilEmpresa perfilEmpresa = new PerfilEmpresa(senha, perfilEmpresa_id);
		perfilEmpresaDao.update(perfilEmpresa);
		// TODO redirect????
		// fazer algo
	}

	private void deletePerfilEmpresa(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long perfilEmpresa_id = Long.parseLong(req.getParameter("perfil_id"));

		final PerfilEmpresa perfilEmpresa = new PerfilEmpresa(perfilEmpresa_id);
		perfilEmpresaDao.delete(perfilEmpresa);
	}

	private void insertPerfilEmpresa(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		boolean ativo = Boolean.parseBoolean(req.getParameter("ativo"));
		long empresa_id = Long.parseLong(req.getParameter("empresa_id"));
		final PerfilEmpresa perfilEmpresa = new PerfilEmpresa(email, senha, ativo, empresa_id);
		perfilEmpresaDao.save(perfilEmpresa);
	}

}
