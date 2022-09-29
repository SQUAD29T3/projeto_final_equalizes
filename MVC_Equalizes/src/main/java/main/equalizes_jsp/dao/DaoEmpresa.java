package main.equalizes_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import main.equalizes_jsp.models.Empresa;

public class DaoEmpresa implements EmpresaDao {
	private DaoEmpresa() {
	}

	private static class SingletonHelper {
		private static final DaoEmpresa INSTANCE = new DaoEmpresa();
	}

	public static DaoEmpresa getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Optional<Empresa> find(String id) throws SQLException {
		String sql = "SELECT empresa_id,cnpj,nome_fantasia,razao_social,ativ_empresarial,propietario,socios,administrador,uf,cep,cidade,bairro,rua,numero,complemento,email,telefone where empresa_id=?";
		int numero = 0;
		long id_empresa = 0, telefone = 0, cnpj = 0, cep = 0;
		String nome_fantasia = "", razao_social = "", ativ_empresarial = "", propietario = "", socios = "",
				administrador = "", uf = "", cidade = "", bairro = "", rua = "", complemento = "", email = "";
		Connection conn = DataSourceFactory.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, id);
		ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			id_empresa = rs.getLong("id_empresa");
			telefone = rs.getLong("telefone");
			cnpj = rs.getLong("cnpj");
			cep = rs.getLong("cep");
			numero = rs.getInt("numero");
			nome_fantasia = rs.getString("nome_fantasia");
			razao_social = rs.getString("razao_social");
			ativ_empresarial = rs.getString("ativ_empresarial");
			propietario = rs.getString("propietario");
			socios = rs.getString("socios");
			administrador = rs.getString("administrador");
			uf = rs.getString("uf");
			cidade = rs.getString("cidade");
			bairro = rs.getString("bairro");
			rua = rs.getString("rua");
			complemento = rs.getString("complemento");
			email = rs.getString("email");
		}
		return Optional.of(new Empresa(id_empresa, cnpj, nome_fantasia, razao_social, ativ_empresarial, propietario,
				socios, administrador, uf, cep, cidade, bairro, rua, numero, complemento, email, telefone));
	}

	@Override
	public List<Empresa> findAll() throws SQLException {
		List<Empresa> listEmpresas = new ArrayList<>();
		String sql = "SELECT empresa_id,cnpj,nome_fantasia,razao_social,ativ_empresarial,propietario,socios,administrador,uf,cep,cidade,bairro,rua,numero,complemento,email,telefone from empresa";

		Connection conn = DataSourceFactory.getConnection();
		java.sql.Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sql);

		while (rs.next()) {
			long id_empresa = rs.getLong("id_empresa");
			long telefone = rs.getLong("telefone");
			long cnpj = rs.getLong("cnpj");
			long cep = rs.getLong("cep");
			int numero = rs.getInt("numero");
			String nome_fantasia = rs.getString("nome_fantasia");
			String razao_social = rs.getString("razao_social");
			String ativ_empresarial = rs.getString("ativ_empresarial");
			String propietario = rs.getString("propietario");
			String socios = rs.getString("socios");
			String administrador = rs.getString("administrador");
			String uf = rs.getString("uf");
			String cidade = rs.getString("cidade");
			String bairro = rs.getString("bairro");
			String rua = rs.getString("rua");
			String complemento = rs.getString("complemento");
			String email = rs.getString("email");

			Empresa empresa = new Empresa(id_empresa, cnpj, nome_fantasia, razao_social, ativ_empresarial, propietario,
					socios, administrador, uf, cep, cidade, bairro, rua, numero, complemento, email, telefone);
			listEmpresas.add(empresa);
		}
		return listEmpresas;
	}

	@Override
	public boolean update(Empresa empresa) throws SQLException {
		String sql = "UPDATE empresa SET email=?,telefone=? where empresa_id=?";
		boolean rowUpdated = false;
		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, empresa.getEmail());
		statement.setLong(2, empresa.getTelefone());
		rowUpdated = statement.executeUpdate() > 0;
		return rowUpdated;
	}

	@Override
	public boolean save(Empresa empresa) throws SQLException {
		String sql = "INSERT into empresa(razao_social,cnpj,uf,cep,cidade,email,telefone) VALUES (?,?,?,?,?,?,?) where empresa_id=?";
		boolean rowInserted = false;
		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, empresa.getRazao_social());
		statement.setLong(2, empresa.getCnpj());
		statement.setString(3, empresa.getUf());
		statement.setLong(4, empresa.getCep());
		statement.setString(5, empresa.getCidade());
		statement.setString(6, empresa.getEmail());
		statement.setLong(7, empresa.getTelefone());
		statement.setLong(8, empresa.getEmpresa_id());
		rowInserted = statement.executeUpdate() > 0;
		return rowInserted;
	}

	@Override
	public boolean delete(Empresa empresa) throws SQLException {
		String sql = "DELETE from empresa where empresa_id=?";
		boolean rowDeleted = false;

		Connection conn = DataSourceFactory.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, empresa.getEmpresa_id());
		rowDeleted = statement.executeUpdate() > 0;
		return rowDeleted;
	}

}
