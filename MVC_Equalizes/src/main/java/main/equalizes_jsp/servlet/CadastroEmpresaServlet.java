package main.equalizes_jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.equalizes_jsp.dao.DaoEmpresa;
import main.equalizes_jsp.models.Empresa;

public class CadastroEmpresaServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String razao_social = null;
		// parse to long
		String tcnpj = null;
		String cidade = null;
		String estado = null;
		// to long
		String tcep = null;
		String ttelefone = null;
		String email = null;
		long cnpj = 0;
		long cep = 0;
		long telefone = 0;

		res.setContentType("text/html");

		razao_social = req.getParameter("razao_social");
		tcnpj = req.getParameter("cnpj");
		cnpj = Long.parseLong(tcnpj);
		cidade = req.getParameter("cidade");
		estado = req.getParameter("estado");
		tcep = req.getParameter("cep");
		cep = Long.parseLong(tcep);
		ttelefone = req.getParameter("telefone");
		telefone = Long.parseLong(ttelefone);
		email = req.getParameter("email");

		Empresa empresa = new Empresa(razao_social, cnpj, ttelefone, cep, cidade, email, telefone);
		final DaoEmpresa daoEmpresa = DaoEmpresa.getInstance();

		try {
			daoEmpresa.save(empresa);
		} catch (SQLException e) {
			printSQLException(e);

		}
	}

	public void printSQLException(final SQLException ex) {
		for (final Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
