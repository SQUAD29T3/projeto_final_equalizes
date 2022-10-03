package main.equalizes_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

import main.equalizes_jsp.models.Interese;

public class DaoInterese implements IntereseDao {

	public DaoInterese() {
	}

	private static class SingletonHelper {
		private static final DaoInterese INSTANCE = new DaoInterese();
	}

	public static DaoInterese getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Optional<Interese> find(final String id) throws SQLException {

		// TODO refazer sql
		final String sql = "SELECT interese_id,id_perfil,texto,imagem  where interese_id = ?";
		// perfil sera sempre de escola
		long id_perfil_escola = 0, interese_id = 0;
		String texto = "", imagem = "";

		final Connection conn = DataSourceFactory.getConnection();

		final PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, id);
		final java.sql.ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			interese_id = rs.getLong("interese_id");
			id_perfil_escola = rs.getLong("perfil_escola_id");
			texto = rs.getString("texto");
			imagem = rs.getString("imagem");

		}
		return Optional.of(new Interese(interese_id, id_perfil_escola, texto, imagem));
	}

	@Override
	public boolean update(final Interese interese) throws SQLException {
		final String sql = "UPDATE interese SET texto=? where interese_id=?";
		boolean rowUpdate = false;

		final Connection conn = DataSourceFactory.getConnection();
		final PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, interese.getTexto());
		statement.setLong(2, interese.getInterese_id());
		rowUpdate = statement.executeUpdate() > 0;
		return rowUpdate;
	}

	@Override
	public boolean save(final Interese interese) throws SQLException {
		final String sql = "INSERT into interese(id_perfil,texto) VALUES(?,?)";
		boolean rowInserted = false;

		final Connection conn = DataSourceFactory.getConnection();
		final PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, interese.getId_perfil());
		statement.setString(4, interese.getTexto());

		rowInserted = statement.executeUpdate() > 0;
		return rowInserted;
	}

	@Override
	public boolean delete(final Interese interese) throws SQLException {
		final String sql = "DELETE from interese where interese_id = ?";
		boolean rowDeleted = false;

		final Connection conn = DataSourceFactory.getConnection();
		final PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, interese.getInterese_id());
		rowDeleted = statement.executeUpdate() > 0;
		return rowDeleted;
	}
}
