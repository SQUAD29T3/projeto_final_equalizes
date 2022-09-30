package main.equalizes_jsp.models;

public class Escola {

	protected long escola_id;
	protected long cnpj;
	protected String nome;
	protected String turnos;
	protected int qt_alunos;
	protected String diretor_responsavel;
	protected String vice_diretor;
	protected String coordenador;
	protected String secretaria;
	protected String uf;
	protected long cep;
	protected String cidade;
	protected String bairro;
	protected String rua;
	protected int numero;
	protected String complemento;
	protected String email;
	protected long telefone;

	public Escola() {
		super();

	}

	public Escola(final long escola_id) {
		this.escola_id = escola_id;
	}

	public Escola(final long cnpj, final String nome, final String uf, final long cep, final String cidade,
			final String email, final long telefone) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.uf = uf;
		this.cep = cep;
		this.cidade = cidade;
		this.email = email;
		this.telefone = telefone;
	}

	public Escola(final long escola_id, final long cnpj, final String nome, final String turnos, final int qt_alunos,
			final String diretor_responsavel, final String vice_diretor, final String coordenador,
			final String secretaria, final String uf, final long cep, final String cidade, final String bairro,
			final String rua, final int numero, final String complemento, final String email, final long telefone) {
		this.escola_id = escola_id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.turnos = turnos;
		this.qt_alunos = qt_alunos;
		this.diretor_responsavel = diretor_responsavel;
		this.vice_diretor = vice_diretor;
		this.coordenador = coordenador;
		this.secretaria = secretaria;
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

	public Escola(long escola_id, int qt_alunos) {
		this.escola_id = escola_id;
		this.qt_alunos = qt_alunos;
	}

	public long getEscola_id() {
		return escola_id;
	}

	public void setEscola_id(final long escola_id) {
		this.escola_id = escola_id;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(final long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getTurnos() {
		return turnos;
	}

	public void setTurnos(final String turnos) {
		this.turnos = turnos;
	}

	public int getQt_alunos() {
		return qt_alunos;
	}

	public void setQt_alunos(final int qt_alunos) {
		this.qt_alunos = qt_alunos;
	}

	public String getDiretor_responsavel() {
		return diretor_responsavel;
	}

	public void setDiretor_responsavel(final String diretor_responsavel) {
		this.diretor_responsavel = diretor_responsavel;
	}

	public String getVice_diretor() {
		return vice_diretor;
	}

	public void setVice_diretor(final String vice_diretor) {
		this.vice_diretor = vice_diretor;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(final String coordenador) {
		this.coordenador = coordenador;
	}

	public String getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(final String secretaria) {
		this.secretaria = secretaria;
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
