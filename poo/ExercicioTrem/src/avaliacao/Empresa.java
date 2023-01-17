package avaliacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Empresa {
	
	private String nome;
	private Linha[] listaLinhas;
	
	public Empresa(String nome, Linha[] listaLinhas) {
		super();
		this.nome = nome;
		this.listaLinhas = listaLinhas;
	}

	public Empresa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Linha[] getListaLinhas() {
		return listaLinhas;
	}

	public void setListaLinhas(Linha[] listaLinhas) {
		this.listaLinhas = listaLinhas;
	}
	
	public double calcularFaturamento() {
		double faturamento = 0;
		
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			faturamento += this.getListaLinhas()[i].calcularFaturamentoLinha();
		}
		return faturamento;
	}

	public void identificarTremMaisAntigo() {
		LocalDate dtTremMaisAntigo = LocalDate.now();
		Trem tremMaisAntigo = null;
		
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			if(this.getListaLinhas()[i].getTrem().getDataFabricacao().isBefore(dtTremMaisAntigo)) {
				dtTremMaisAntigo = this.getListaLinhas()[i].getTrem().getDataFabricacao();
				tremMaisAntigo = this.getListaLinhas()[i].getTrem();
			}
		}
		System.out.println("Trem mais antigo: " + tremMaisAntigo.toString());
	}
	
	public void identificarMaquinistaMaisNovo() {
		LocalDate dtMaquinistaMaisNovo = LocalDate.of(1000, 1, 1);
		Maquinista maquinistaMaisNovo = null;
		
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			
			
			if(this.getListaLinhas()[i].getTrem().getMaquinista().getDataNascimento().isAfter(dtMaquinistaMaisNovo)) {
				dtMaquinistaMaisNovo = this.getListaLinhas()[i].getTrem().getMaquinista().getDataNascimento();
				maquinistaMaisNovo = this.getListaLinhas()[i].getTrem().getMaquinista();
			}
		}
		System.out.println("Maquinista mais novo: " + maquinistaMaisNovo.toString());
	}
	
	public Period identificarDiferecaIdadePassageiroMaisNovoMaisIdoso() {
		LocalDate dtPassageiroMaisNovo = LocalDate.of(1000, 1, 1);
		LocalDate dtPassageiroMaisVelho = LocalDate.now();
		
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			
			if(this.getListaLinhas()[i].identificarPassageiroMaisNovo().getDataNascimento().isAfter(dtPassageiroMaisNovo)) {
				dtPassageiroMaisNovo = this.getListaLinhas()[i].identificarPassageiroMaisNovo().getDataNascimento();
			}
			
			if(this.getListaLinhas()[i].identificarPassageiroMaisVelho().getDataNascimento().isBefore(dtPassageiroMaisVelho)) {
				dtPassageiroMaisVelho = this.getListaLinhas()[i].identificarPassageiroMaisVelho().getDataNascimento();
			}

		}
		Period diferencaIdade = Period.between(dtPassageiroMaisVelho, dtPassageiroMaisNovo);
		return diferencaIdade;
	}
	
	public void calcularPercentualPassageirosHomensMulheres() {

		int homens = 0;
		int mulheres = 0;
		
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			
			for(int j = 0; j < this.getListaLinhas()[i].getListaPassagem().length;j++) {
				if (this.getListaLinhas()[i].getListaPassagem()[j].getPassageiro().getSexo() == 'M') {
					homens++;
				}else {
					mulheres++;
				}
			}
		}
		
		int total = mulheres + homens;
		System.out.println("total = " + total + ", mulheres = " + mulheres  + ", homens = " + homens);
	}
	
	public void listarContatoPassageiro(String nomePassageiro) {
		Contato contato = null;
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			for(int j = 0; j < this.getListaLinhas()[i].getListaPassagem().length;j++) {
				if(nomePassageiro == this.getListaLinhas()[i].getListaPassagem()[j].getPassageiro().getNome())
					contato = this.getListaLinhas()[i].getListaPassagem()[j].getPassageiro().getContato();
			}
		}
		System.out.println(contato.toString()); 
	}
	
	
	public void listarPassageirosPorTrechoLinha(String trechoLinha) {
		
		for(int i = 0; i < this.getListaLinhas().length; i++) {
				if(trechoLinha == this.getListaLinhas()[i].getTrecho()) {
					for(int j = 0; j < this.getListaLinhas()[i].getListaPassagem().length;j++) {
					System.out.println( this.getListaLinhas()[i].getListaPassagem()[j].getPassageiro().getNome());
				}
			}
		}
	}
	
	public void identificarPassageiroPorPassaporte(String passaporte) {
		Passageiro passageiro = null;
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			for(int j = 0; j < this.getListaLinhas()[i].getListaPassagem().length;j++) {
				if(passaporte == this.getListaLinhas()[i].getListaPassagem()[j].getPassageiro().getDocumento().getPassaporte())
					passageiro = this.getListaLinhas()[i].getListaPassagem()[j].getPassageiro();
				}
			}
		System.out.println(passageiro.getNome()); 
	}
	
	
	public LocalDateTime mostrarHorarioTremPorTrechoLinha(String trechoLinha) {
		LocalDateTime horarioTrem = null;
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			if(trechoLinha == this.getListaLinhas()[i].getTrecho()) {
				for(int j = 0; j < this.getListaLinhas()[i].getListaPassagem().length;j++) {
					horarioTrem = this.getListaLinhas()[i].getListaPassagem()[j].getDataHorario();
				}
			}
		}
		return horarioTrem;
	}
	
	public double informarPrecoPassagemPorNumeroTrem(int numeroTrem) {
		double valorPassagem = 0;
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			if(numeroTrem == this.getListaLinhas()[i].getTrem().getNumeroLocomotiva()) {
				for(int j = 0; j < this.getListaLinhas()[i].getListaPassagem().length;j++) {
					valorPassagem = this.getListaLinhas()[i].getListaPassagem()[j].getValorPassagem();
				}
			}
		}
		return valorPassagem;
	}
	
	
}
	
	





