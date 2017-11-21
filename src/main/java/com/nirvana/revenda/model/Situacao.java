package com.nirvana.revenda.model;

public enum Situacao {
	
	VENDIDO("Vendido"), RESERVADO("Reservado"), ESTOQUE("Em Estoque");
	
	private String mascara;
	
	
	Situacao(String mascara_exibida_Em_Tela){
		this.mascara = mascara_exibida_Em_Tela;
	}
	
	public String getMascara() {
		return mascara;
	}

}
