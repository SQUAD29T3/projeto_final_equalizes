package main.equalizes_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import main.equalizes_jsp.models.Escola;

public class DaoEscola implements EscolaDao {

	public DaoEscola() {
	}

	private static class SingletonHelper {
		private static final DaoEscola INSTANCE = new DaoEscola();
	}

	public static DaoEscola getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Optional<Escola> find(String id) throws SQLException {
		String sql = "SELECT escola_id,cnpj,nome,turnos,qt_alunos,diretor_responsavel,vice_diretor,coordenador,secretaria,uf,cep,cidade,bairro,rua,numero,complemento,email,telefone where empresa_id=?";
		int numero = 0, qt_alunos = 0;
		long escola_id = 0, telefone = 0, cnpj = 0, cep = 0;
		String nome = "", uf = "", cidade = "", bairro = "", rua = "", complemento = "", email = "", turnos = "",
				diretor_responsavel = "", vice_diretor = "", coordenador = "", secretaria = "";

		Connection conn = DataSourceFactory.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, id);
		ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			escola_id = rs.getLong("id_empresa");
			telefone = rs.getLong("telefone");
			cnpj = rs.getLong("cnpj");
			cep = rs.getLong("cep");
			numero = rs.getInt("numero");
			nome = rs.getString("nome_fantasia");
			// TODO html uf esta como estado??
			uf = rs.getString("estado");
			cidade = rs.getString("cidade");
			bairro = rs.getString("bairro");
			rua = rs.getString("rua");
			complemento = rs.getString("complemento");
			email = rs.getString("email");
			turnos = rs.getString("turnos");
			qt_alunos = rs.getInt("qt_alunos");
			complemento = rs.getString("complemento");
			diretor_responsavel = rs.getString("diretor_responsavel");
			vice_diretor = rs.getString("vice_diretor");
			coordenador = rs.getString("coordenador");
			secretaria = rs.getString("secretaria");
		}
		return Optional.of(new Escola(escola_id, cnpj, nome, turnos, qt_alunos, diretor_responsavel, vice_diretor,
				coordenador, secretaria, uf, cep, cidade, bairro, rua, numero, complemento, email, telefone));
	}

	// @Override
	// public List<Escola> findAll() throws SQLException {
	// List<Escola> listEscolas = new ArrayList<>();
	// String sql = "SELECT
	// escola_id,cnpj,nome,turnos,qt_alunos,diretor_responsavel,vice_diretor,coordenador,secretaria,uf,cep,cidade,bairro,rua,numero,complemento,email,telefone
	// from empresa";

	// Connection conn = DataSourceFactory.getConnection();
	// Statement statement = conn.createStatement();
	// ResultSet rs = statement.executeQuery(sql);

	// while (rs.next()) {
	// long escola_id = rs.getLong("escola_id");
	// long telefone = rs.getLong("telefone");
	// long cnpj = rs.getLong("cnpj");
	// long cep = rs.getLong("cep");
	// int numero = rs.getInt("numero");
	// int qt_alunos = rs.getInt("qt_alunos");
	// String nome = rs.getString("nome");
	// String uf = rs.getString("uf");
	// String cidade = rs.getString("cidade");
	// String bairro = rs.getString("bairro");
	// String rua = rs.getString("rua");
	// String complemento = rs.getString("complemento");
	// String email = rs.getString("email");
	// String diretor_responsavel = rs.getString("diretor_responsavel");
	// String vice_diretor = rs.getString("vice_diretor");
	// String coordenador = rs.getString("coordenador");
	// String secretaria = rs.getString("secretaria");

	// Escola escola = new Escola(escola_id, cnpj, nome, nome, qt_alunos,
	// diretor_responsavel, vice_diretor,
	// coordenador, secretaria, uf, cep, cidade, bairro, rua, numero, complemento,
	// email, telefone);
	// listEscolas.add(escola);
	// }
	// return listEscolas;
	// }

	// TODO update qt_alunos
	@Override
	public boolean update(Escola escola) throws SQLException {
		String sql = "Update escola SET qt_alunos=? where escola_id=?";
		boolean rowUpdated = false;
		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, escola.getQt_alunos());
		statement.setLong(2, escola.getEscola_id());
		rowUpdated = statement.executeUpdate() > 0;
		return rowUpdated;
	}

	@Override
	public boolean save(Escola escola) throws SQLException {
		String sql = "INSERT into escola(nome,cnpj,uf,cep,cidade,email,telefone) VALUES(?,?,?,?,?,?,?)";
		boolean rowInserted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, escola.getNome());
		statement.setLong(2, escola.getCnpj());
		statement.setString(3, escola.getUf());
		statement.setLong(4, escola.getCep());
		statement.setString(5, escola.getCidade());
		statement.setString(6, escola.getEmail());
		statement.setLong(7, escola.getTelefone());
		rowInserted = statement.executeUpdate() > 0;
		return rowInserted;
	}

	@Override
	public boolean delete(Escola escola) throws SQLException {
		String sql = "DELETE from escola where escola_id=?";
		boolean rowDeleted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, escola.getEscola_id());
		rowDeleted = statement.executeUpdate() > 0;
		return rowDeleted;
	}
}
