package avaliacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Maquinista extends Pessoa{
	
	private double salario;

	public Maquinista(String nome, LocalDate dataNascimento, char sexo, Documento documento, Contato contato,
			double salario) {
		super(nome, dataNascimento, sexo, documento, contato);
		this.salario = salario;
	}

	public Maquinista() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Maquinista [ nome= " + this.getNome() + ", dataNascimento= " + this.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", sexo= " + this.getSexo() + ", documento= " + 
				 this.getDocumento().toString() + ", contato= " + this.getContato().toString() + "salario=" + this.getSalario() + "]";
	}

	
}
