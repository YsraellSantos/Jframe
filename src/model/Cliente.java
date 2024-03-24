package model;

public class Cliente {
	protected String Id;
	protected String nome;
	protected String cpfCnpj;
	protected String email;
	protected String telefone;
	protected String endereco;
	
	public Cliente() {
		
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String înt) {
		this.Id = înt;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cliente(String înt, String nome, String cpfCnpj, String email, String telefone, String endereco) {
		super();
		this.Id = înt;
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}	

}

