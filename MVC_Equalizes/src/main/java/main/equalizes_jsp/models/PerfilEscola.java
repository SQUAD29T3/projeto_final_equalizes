package main.equalizes_jsp.models;

import java.util.List;

public class PerfilEscola {
	protected long perfil_escola_id;
	protected String email;
	protected String senha;
	protected boolean ativo;
	protected long data_criado;
	protected long data_mod;
	protected Long id_projeto;
	protected long id_escola;

	public PerfilEscola() {
	}

	// ativa/desativa
	public PerfilEscola(long perfil_escola_id, boolean ativo) {
		this.perfil_escola_id = perfil_escola_id;
		this.ativo = ativo;
	}

	// projetos
	public PerfilEscola(long perfil_escola_id, long id_projeto) {
		this.perfil_escola_id = perfil_escola_id;
		this.id_projeto = id_projeto;
	}

	public PerfilEscola(long perfil_escola_id) {
		this.perfil_escola_id = perfil_escola_id;
	}

	// Atualiza senha
	public PerfilEscola(long perfil_escola_id, String senha) {
		this.perfil_escola_id = perfil_escola_id;
		this.senha = senha;
	}

	public PerfilEscola(long perfil_escola_id, String email, String senha, boolean ativo, long id_projeto,
			long id_escola) {
		this.perfil_escola_id = perfil_escola_id;
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
		this.id_projeto = id_projeto;
		this.id_escola = id_escola;
	}

	// cria perfil
	public PerfilEscola(String email, String senha, boolean ativo, long id_escola) {
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
		this.id_escola = id_escola;
	}

	public long getPerfil_id() {
		return perfil_escola_id;
	}

	public void setPerfil_id(final long perfil_escola_id) {
		this.perfil_escola_id = perfil_escola_id;
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

	public long getId_escola() {
		return id_escola;
	}

	public void setId_escola(final long id_escola) {
		this.id_escola = id_escola;
	}

}
