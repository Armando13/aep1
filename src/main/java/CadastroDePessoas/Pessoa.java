package CadastroDePessoas;

import java.util.UUID;

public abstract class Pessoa {
	
	protected String nome;
	protected UUID id;
	
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.id = UUID.randomUUID();
	}
	
	public Pessoa(UUID id, String nome) {
		this.nome = nome;
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public UUID getId() {
		return id;
	}
	
	

}
