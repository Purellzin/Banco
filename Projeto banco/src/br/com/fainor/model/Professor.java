package br.com.fainor.model;

public class Professor extends Pessoa {
	private String matricula;
	

	
	
	public String getMatricula() {
		return matricula;
	}

	public Professor(Long id, String nome, String cpf, String matricula) {
		super(id, nome, cpf);
		this.matricula = matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



}
