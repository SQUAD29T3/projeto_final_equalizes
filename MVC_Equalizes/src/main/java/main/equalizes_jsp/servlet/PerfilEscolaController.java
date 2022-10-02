package main.equalizes_jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.equalizes_jsp.dao.DaoPerfilEscola;
import main.equalizes_jsp.models.PerfilEscola;

public class PerfilEscolaController extends HttpServlet {
	private final DaoPerfilEscola perfilEscolaDao = DaoPerfilEscola.getInstance();
	private static final Logger LOGGER = Logger.getLogger(PerfilEscolaController.class.getName());

	@Override
	protected void doPost(final HttpServletRequest req, final HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse res)
			throws ServletException, IOException {
		final String action = req.getServletPath();
		// TODO implementar funcionalidade no site
	}

	private void updatePerfilEscola(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		// TODO nome certo dos campos
		final long perfilEscola_id = Long.parseLong(req.getParameter("perfilEscola_id"));
		final String senha = req.getParameter("senha");

		final PerfilEscola perfilEscola = new PerfilEscola(perfilEscola_id, senha);
		perfilEscolaDao.update(perfilEscola);
		// TODO redirect????
		// fazer algo
	}

	private void deletePerfilEscola(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long perfilEscola_id = Long.parseLong(req.getParameter("perfil_id"));

		final PerfilEscola perfilEscola = new PerfilEscola(perfilEscola_id);
		perfilEscolaDao.delete(perfilEscola);
	}

	private void insertPerfilEscola(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		boolean ativo = Boolean.parseBoolean(req.getParameter("ativo"));
		long escola_id = Long.parseLong(req.getParameter("escola_id"));
		final PerfilEscola perfilEscola = new PerfilEscola(email, senha, ativo, escola_id);
		perfilEscolaDao.save(perfilEscola);
	}

}
