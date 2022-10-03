package main.equalizes_jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.equalizes_jsp.dao.DaoInterese;
import main.equalizes_jsp.models.Interese;

public class IntereseController extends HttpServlet {
	private final DaoInterese intereseDao = DaoInterese.getInstance();
	private static final Logger LOGGER = Logger.getLogger(IntereseController.class.getName());

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
			case "/cadastro_interese": {
				insertInterese(req, res);
				break;
			}
			case "/atualizar_interese": {
				updateInterese(req, res);
				break;
			}
			case "/delete_interese": {
				deleteInterese(req, res);
				break;
			}

			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "SQL Error", e);
		}
	}

	private void updateInterese(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		// TODO nome certo dos campos
		final long interese_id = Long.parseLong(req.getParameter("interese_id"));
		final String texto = req.getParameter("texto");

		final Interese interese = new Interese(texto, interese_id);
		intereseDao.update(interese);
		// TODO redirect????
		// fazer algo
	}

	private void deleteInterese(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final long interese_id = Long.parseLong(req.getParameter("interese_id"));

		final Interese interese = new Interese(interese_id);
		intereseDao.delete(interese);
	}

	private void insertInterese(final HttpServletRequest req, final HttpServletResponse res)
			throws SQLException, IOException, ServletException {
		final String texto = req.getParameter("texto");
		String imagem = req.getParameter("imagem ");
		long perfil_id = Long.parseLong(req.getParameter("perfil_id"));
		final Interese interese = new Interese(perfil_id, texto, imagem)
		intereseDao.save(interese);
	}

}
