package main.equalizes_jsp.models;

public class Projeto {

	protected long projeto_id;
	protected long id_perfil;
	protected long id_interese;
	protected long data_criado;
	protected long data_mod;
	protected String estado;

	// atualizar estado
	public Projeto(long projeto_id, String estado) {
		this.projeto_id = projeto_id;
		this.estado = estado;
	}

	public Projeto(long projeto_id, long id_perfil, long id_interese, String estado) {
		this.projeto_id = projeto_id;
		this.id_perfil = id_perfil;
		this.id_interese = id_interese;
		this.estado = estado;
	}

	public Projeto() {
	}

	public long getProjeto_id() {
		return projeto_id;
	}

	public void setProjeto_id(long projeto_id) {
		this.projeto_id = projeto_id;
	}

	public long getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(long id_perfil) {
		this.id_perfil = id_perfil;
	}

	public long getId_interese() {
		return id_interese;
	}

	public void setId_interese(long id_interese) {
		this.id_interese = id_interese;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
