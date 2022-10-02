package main.equalizes_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

import main.equalizes_jsp.models.PerfilEscola;

public class DaoPerfilEscola implements PerfilEscolaDao {

	public DaoPerfilEscola() {
	}

	private static class SingletonHelper {
		private static final DaoPerfilEscola INSTANCE = new DaoPerfilEscola();
	}

	public static DaoPerfilEscola getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Optional<PerfilEscola> find(String id) throws SQLException {
		String sql = "SELECT perfil_id,email,senha,ativo,id_projeto,id_escola where perfil_id = ?";
		long perfil_escola_id = 0, id_projeto = 0, id_escola = 0;
		String email = "", senha = "";
		boolean ativo = false;

		Connection conn = DataSourceFactory.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, id);
		java.sql.ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			perfil_escola_id = rs.getLong("perfil_id");
			id_projeto = rs.getLong("id_projeto");
			id_escola = rs.getLong("id_escola");
			email = rs.getString("email");
			senha = rs.getString("senha");
			ativo = rs.getBoolean("ativo");
		}
		return Optional.of(new PerfilEscola(perfil_escola_id, email, senha, ativo, id_projeto, id_escola));
	}

	@Override
	public boolean update(PerfilEscola perfilEscola) throws SQLException {
		String sql = "UPDATE perfil SET senha=? where perfil_id=?";
		boolean rowUpdate = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, perfilEscola.getSenha());
		statement.setLong(2, perfilEscola.getPerfil_id());
		rowUpdate = statement.executeUpdate() > 0;
		return rowUpdate;
	}

	@Override
	public boolean save(PerfilEscola perfilEscola) throws SQLException {
		String sql = "INSERT into perfil(email,senha,ativo,id_escola) VALUES(?,?,?,?)";
		boolean rowInserted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, perfilEscola.getEmail());
		statement.setString(2, perfilEscola.getSenha());
		statement.setBoolean(3, perfilEscola.isAtivo());
		statement.setLong(4, perfilEscola.getId_escola());
		rowInserted = statement.executeUpdate() > 0;
		return rowInserted;
	}

	@Override
	public boolean delete(PerfilEscola perfilEscola) throws SQLExcpetion {
		String sql = "DELETE from perfil where perfil_id = ?";
		boolean rowDeleted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, perfilEscola.getPerfil_id());
		rowDeleted = statement.executeUpdate() > 0;
		return rowDeleted;
	}
}
