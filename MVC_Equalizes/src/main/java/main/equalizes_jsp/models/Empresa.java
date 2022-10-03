package main.equalizes_jsp.models;

//para cadastro empresa
public class Empresa {

	protected long empresa_id;
	protected long cnpj;
	protected String nome_fantasia;
	protected String razao_social;
	protected String ativ_empresarial;
	protected String propietario;
	protected String socios;
	protected String administrador;
	protected String uf;
	protected long cep;
	protected String cidade;
	protected String bairro;
	protected String rua;
	protected int numero;
	protected String complemento;
	protected String email;
	protected long telefone;

	public Empresa(final String razao_social, final long cnpj, final String uf, final long cep, final String cidade,
			final String email, final long telefone) {
		this.razao_social = razao_social;
		this.cnpj = cnpj;
		this.uf = uf;
		this.cep = cep;
		this.cidade = cidade;
		this.email = email;
		this.telefone = telefone;
	}

	public Empresa(final long empresa_id) {
		this.empresa_id = empresa_id;
	}

	// Update email/telefone
	public Empresa(final long empresa_id, final String email, final long telefone) {
		this.empresa_id = empresa_id;
		this.email = email;
		this.telefone = telefone;
	}

	public Empresa(final long empresa_id, final long cnpj, final String nome_fantasia, final String razao_social,
			final String ativ_empresarial, final String propietario, final String socios, final String administrador,
			final String uf, final long cep, final String cidade, final String bairro, final String rua,
			final int numero, final String complemento, final String email, final long telefone) {
		this.empresa_id = empresa_id;
		this.cnpj = cnpj;
		this.nome_fantasia = nome_fantasia;
		this.razao_social = razao_social;
		this.ativ_empresarial = ativ_empresarial;
		this.propietario = propietario;
		this.socios = socios;
		this.administrador = administrador;
		this.uf = uf;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.email = email;
		this.telefone = telefone;
	}

	public long getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(final long empresa_id) {
		this.empresa_id = empresa_id;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(final long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(final String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(final String razao_social) {
		this.razao_social = razao_social;
	}

	public String getAtiv_empresarial() {
		return ativ_empresarial;
	}

	public void setAtiv_empresarial(final String ativ_empresarial) {
		this.ativ_empresarial = ativ_empresarial;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(final String propietario) {
		this.propietario = propietario;
	}

	public String getSocios() {
		return socios;
	}

	public void setSocios(final String socios) {
		this.socios = socios;
	}

	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(final String administrador) {
		this.administrador = administrador;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(final String uf) {
		this.uf = uf;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(final long cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(final String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(final String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(final String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(final int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(final String complemento) {
		this.complemento = complemento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(final long telefone) {
		this.telefone = telefone;
	}

}
