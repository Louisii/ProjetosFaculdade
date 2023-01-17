package avaliacao;

import java.time.LocalDate;

public class Linha {
	
	private String trecho;
	private Trem trem;
	private Passagem[] listaPassagem;
	
	public Linha(String trecho, Trem trem, Passagem[] listaPassagem) {
		super();
		this.trecho = trecho;
		this.trem = trem;
		this.listaPassagem = listaPassagem;
	}

	public Linha() {
		super();
	}

	public String getTrecho() {
		return trecho;
	}

	public void setTrecho(String trecho) {
		this.trecho = trecho;
	}

	public Trem getTrem() {
		return trem;
	}

	public void setTrem(Trem trem) {
		this.trem = trem;
	}

	public Passagem[] getListaPassagem() {
		return listaPassagem;
	}

	public void setListaPassagem(Passagem[] listaPassagem) {
		this.listaPassagem = listaPassagem;
	}
	
	public double calcularFaturamentoLinha() {
		
		double faturamento = 0;
		
		for(int i = 0; i < this.getListaPassagem().length; i++) {
			faturamento += this.getListaPassagem()[i].getValorPassagem();
		}
		
		return faturamento;
	}
	
	public Passageiro identificarPassageiroMaisNovo() {
		LocalDate dtPassageiroMaisNovo = LocalDate.of(1000, 1, 1);
		Passageiro passageiroMaisNovo = null;
		
		for(int i = 0; i < this.getListaPassagem().length; i++) {

			if(this.getListaPassagem()[i].getPassageiro().getDataNascimento().isAfter(dtPassageiroMaisNovo)) {
				dtPassageiroMaisNovo = this.getListaPassagem()[i].getPassageiro().getDataNascimento();
				passageiroMaisNovo = this.getListaPassagem()[i].getPassageiro();
			}
		}
		return passageiroMaisNovo;
	}
	
	public Passageiro identificarPassageiroMaisVelho() {
		LocalDate dtPassageiroMaisVelho = LocalDate.now();
		Passageiro passageiroMaisVelho = null;
		
		for(int i = 0; i < this.getListaPassagem().length; i++) {

			if(this.getListaPassagem()[i].getPassageiro().getDataNascimento().isBefore(dtPassageiroMaisVelho)) {
				dtPassageiroMaisVelho = this.getListaPassagem()[i].getPassageiro().getDataNascimento();
				passageiroMaisVelho = this.getListaPassagem()[i].getPassageiro();
			}
		}
		return passageiroMaisVelho;
	}
	
	public int[] calcularPercentualPassageirosHomensMulheres() {
		int homens = 0;
		int mulheres = 0;
		for(int i = 0; i < this.getListaPassagem().length; i++) {
			if(this.getListaPassagem()[i].getPassageiro().getSexo() == 'M') {
				homens++;
			}else {
				mulheres++;
			}
		}
		int[] nHomensMulheres = {homens, mulheres};
		return nHomensMulheres;
	}
	

}

