package main.equalizes_jsp.models;

public class Interese {
	protected long interese_id;
	protected long id_perfil;
	protected String texto;
	protected String imagem;
	protected long data_criado;
	protected long data_mod;

	public Interese() {
	}

	// alteracoes
	public Interese(long interese_id, String texto, String imagem, long data_mod) {
		this.interese_id = interese_id;
		this.texto = texto;
		this.imagem = imagem;
		this.data_mod = data_mod;
	}

	public Interese(long interese_id, long id_perfil, String texto) {
		this.interese_id = interese_id;
		this.id_perfil = id_perfil;
		this.texto = texto;
	}

	// criacao
	public Interese(long interese_id, long id_perfil, String texto, String imagem) {
		this.interese_id = interese_id;
		this.id_perfil = id_perfil;
		this.texto = texto;
		this.imagem = imagem;
	}

	public long getInterese_id() {
		return interese_id;
	}

	public void setInterese_id(long interese_id) {
		this.interese_id = interese_id;
	}

	public long getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(long id_perfil) {
		this.id_perfil = id_perfil;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
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

}
