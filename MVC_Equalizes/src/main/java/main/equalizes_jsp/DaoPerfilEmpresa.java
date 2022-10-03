package main.equalizes_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

import main.equalizes_jsp.models.PerfilEmpresa;

public class DaoPerfilEmpresa implements PerfilEmpresaDao {

	public DaoPerfilEmpresa() {
	}

	private static class SingletonHelper {
		private static final DaoPerfilEmpresa INSTANCE = new DaoPerfilEmpresa();
	}

	public static DaoPerfilEmpresa getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Optional<PerfilEmpresa> find(String id) throws SQLException {
		String sql = "SELECT perfil_id,email,senha,ativo,id_projeto,id_empresa where perfil_id = ?";
		long perfil_empresa_id = 0, id_projeto = 0, id_empresa = 0;
		String email = "", senha = "";
		boolean ativo = false;

		Connection conn = DataSourceFactory.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, id);
		java.sql.ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			perfil_empresa_id = rs.getLong("perfil_id");
			id_projeto = rs.getLong("id_projeto");
			id_empresa = rs.getLong("id_empresa");
			email = rs.getString("email");
			senha = rs.getString("senha");
			ativo = rs.getBoolean("ativo");
		}
		return Optional.of(new PerfilEmpresa(perfil_empresa_id, email, senha, ativo, id_projeto, id_empresa));
	}

	@Override
	public boolean update(PerfilEmpresa perfilEmpresa) throws SQLException {
		String sql = "UPDATE perfil SET senha=? where perfil_id=?";
		boolean rowUpdate = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, perfilEmpresa.getSenha());
		statement.setLong(2, perfilEmpresa.getPerfil_empresa_id());
		rowUpdate = statement.executeUpdate() > 0;
		return rowUpdate;
	}

	@Override
	public boolean save(PerfilEmpresa perfilEmpresa) throws SQLException {
		String sql = "INSERT into perfil(email,senha,ativo,id_empresa) VALUES(?,?,?,?)";
		boolean rowInserted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, perfilEmpresa.getEmail());
		statement.setString(2, perfilEmpresa.getSenha());
		statement.setBoolean(3, perfilEmpresa.isAtivo());
		statement.setLong(4, perfilEmpresa.getId_empresa());
		rowInserted = statement.executeUpdate() > 0;
		return rowInserted;
	}

	@Override
	public boolean delete(PerfilEmpresa perfilEmpresa) throws SQLException {
		String sql = "DELETE from perfil where perfil_id = ?";
		boolean rowDeleted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, perfilEmpresa.getPerfil_empresa_id());
		rowDeleted = statement.executeUpdate() > 0;
		return rowDeleted;

	}
}
