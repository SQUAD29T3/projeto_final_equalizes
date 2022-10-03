package main.equalizes_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

import main.equalizes_jsp.models.Projeto;

public class DaoProjeto implements ProjetoDao {

	public DaoProjeto() {
	}

	private static class SingletonHelper {
		private static final DaoProjeto INSTANCE = new DaoProjeto();
	}

	public static DaoProjeto getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Optional<Projeto> find(String id) throws SQLException {
		// TODO refazer sql
		String sql = "SELECT id_perfil_escola,senha,ativo,id_projeto,id_escola where projeto_id = ?";
		long id_perfil_escola = 0, projeto_id = 0, id_perfil_empresa = 0, id_interese = 0;
		String estado = "";

		Connection conn = DataSourceFactory.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, id);
		java.sql.ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			projeto_id = rs.getLong("projeto_id");
			id_perfil_escola = rs.getLong("perfil_escola_id");
			id_perfil_empresa = rs.getLong("perfil_emprsa_id");
			id_interese = rs.getLong("id_interese");
			estado = rs.getString("estado");

		}
		return Optional.of(new Projeto(projeto_id, id_perfil_escola, id_perfil_empresa, id_interese, estado));
	}

	@Override
	public boolean update(Projeto projeto) throws SQLException {
		String sql = "UPDATE perfil SET estado=? where projeto_id=?";
		boolean rowUpdate = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, projeto.getEstado());
		statement.setLong(2, projeto.getProjeto_id());
		rowUpdate = statement.executeUpdate() > 0;
		return rowUpdate;
	}

	@Override
	public boolean save(Projeto projeto) throws SQLException {
		String sql = "INSERT into projeto(id_perfil_escola,id_perfil_empresa,id_interese,estado) VALUES(?,?,?,?)";
		boolean rowInserted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, projeto.getId_perfil_escola());
		statement.setLong(2, projeto.getId_perfil_empresa());
		statement.setLong(3, projeto.getId_interese());
		statement.setString(4, projeto.getEstado());

		rowInserted = statement.executeUpdate() > 0;
		return rowInserted;
	}

	@Override
	public boolean delete(Projeto projeto) throws SQLException {
		String sql = "DELETE from projeto where projeto_id = ?";
		boolean rowDeleted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, projeto.getProjeto_id());
		rowDeleted = statement.executeUpdate() > 0;
		return rowDeleted;
	}
}
