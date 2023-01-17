package avaliacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Passageiro extends Pessoa{

	public Passageiro(String nome, LocalDate dataNascimento, char sexo, Documento documento, Contato contato) {
		super(nome, dataNascimento, sexo, documento, contato);
	}
	
	public Passageiro() {
		super();
	}

	@Override
	public String toString() {
		return "Passageiro [Nome(= " + getNome() + ", Data Nascimento= " + getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", Sexo= "
				+ getSexo() + ", Documento= " + getDocumento() + ", Contato= " + getContato() + "]";
	}

}
