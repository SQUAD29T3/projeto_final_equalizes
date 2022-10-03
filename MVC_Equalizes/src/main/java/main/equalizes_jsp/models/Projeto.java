package main.equalizes_jsp.models;

public class Projeto {

	protected long projeto_id;
	protected long id_perfil_escola;
	protected long id_perfil_empresa;
	protected long id_interese;
	protected long data_criado;
	protected long data_mod;
	protected String estado;

	public Projeto(long projeto_id) {
		this.projeto_id = projeto_id;
	}

	public Projeto() {
	}

	public Projeto(long projeto_id, String estado) {
		this.projeto_id = projeto_id;
		this.estado = estado;
	}

	public Projeto(long projeto_id, long id_perfil_escola, long id_perfil_empresa, long id_interese, String estado) {
		this.projeto_id = projeto_id;
		this.id_perfil_escola = id_perfil_escola;
		this.id_perfil_empresa = id_perfil_empresa;
		this.id_interese = id_interese;
		this.estado = estado;
	}

	public Projeto(long id_interese, long id_perfil_escola, long id_perfil_empresa, String estado) {
		this.id_interese = id_interese;
		this.id_perfil_escola = id_perfil_escola;
		this.id_perfil_empresa = id_perfil_empresa;
		this.estado = estado;
	}

	public long getId_perfil_escola() {
		return id_perfil_escola;
	}

	public void setId_perfil_escola(long id_perfil_escola) {
		this.id_perfil_escola = id_perfil_escola;
	}

	public long getId_perfil_empresa() {
		return id_perfil_empresa;
	}

	public void setId_perfil_empresa(long id_perfil_empresa) {
		this.id_perfil_empresa = id_perfil_empresa;
	}

	public long getData_criado() {
		return data_criado;
	}

	public void setData_criado(long data_criado) {
		this.data_criado = data_criado;
	}

	public long getData_mod() {
		return data_mod;
	}

	public void setData_mod(long data_mod) {
		this.data_mod = data_mod;
	}

	public long getProjeto_id() {
		return projeto_id;
	}

	public void setProjeto_id(long projeto_id) {
		this.projeto_id = projeto_id;
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
