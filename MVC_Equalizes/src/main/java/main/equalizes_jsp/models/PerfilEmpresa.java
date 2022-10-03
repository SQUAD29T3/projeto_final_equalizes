package main.equalizes_jsp.models;

public class PerfilEmpresa {

	public void setId_projeto(long id_projeto) {
		this.id_projeto = id_projeto;
	}

	protected long perfil_empresa_id;
	protected String email;
	protected String senha;
	protected boolean ativo;
	protected long data_criado;
	protected long data_mod;
	protected long id_projeto;
	protected long id_empresa;

	public PerfilEmpresa(long perfil_empresa_id) {
		this.perfil_empresa_id = perfil_empresa_id;
	}

	public PerfilEmpresa(final long perfil_empresa_id, final long id_projeto) {
		this.perfil_empresa_id = perfil_empresa_id;
		this.id_projeto = id_projeto;
	}

	public PerfilEmpresa(final long perfil_empresa_id, final boolean ativo) {
		this.perfil_empresa_id = perfil_empresa_id;
		this.ativo = ativo;
	}

	public PerfilEmpresa(long perfil_empresa_id, String email, String senha, boolean ativo, long id_projeto,
			long id_empresa) {
		this.perfil_empresa_id = perfil_empresa_id;
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
		this.id_projeto = id_projeto;
		this.id_empresa = id_empresa;
	}

	public PerfilEmpresa(final String senha, final long perfil_empresa_id) {
		this.senha = senha;
		this.perfil_empresa_id = perfil_empresa_id;
	}

	public PerfilEmpresa(final long perfil_empresa_id, final String email, final String senha, final boolean ativo,
			final long id_empresa) {
		this.perfil_empresa_id = perfil_empresa_id;
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
		this.id_empresa = id_empresa;
	}

	public PerfilEmpresa(String email, String senha, boolean ativo, long id_empresa) {
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
		this.id_empresa = id_empresa;
	}

	public long getPerfil_empresa_id() {
		return perfil_empresa_id;
	}

	public void setPerfil_empresa_id(final long perfil_empresa_id) {
		this.perfil_empresa_id = perfil_empresa_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(final String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(final boolean ativo) {
		this.ativo = ativo;
	}

	public long getData_criado() {
		return data_criado;
	}

	public void setData_criado(final long data_criado) {
		this.data_criado = data_criado;
	}

	public long getData_mod() {
		return data_mod;
	}

	public void setData_mod(final long data_mod) {
		this.data_mod = data_mod;
	}

	public long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(final long id_empresa) {
		this.id_empresa = id_empresa;
	}

}
