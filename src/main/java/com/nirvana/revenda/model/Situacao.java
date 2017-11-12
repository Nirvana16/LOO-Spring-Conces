package com.nirvana.revenda.model;

public enum Situacao {
	
	VENDIDO("Vendido"), BAIXADO("Baixado"), EM_ESTOQUE("Em Estoque");
	
	private String mascara;
	
	
	Situacao (String mascara_exibida_Em_Tela){
		this.mascara = mascara_exibida_Em_Tela;
	}
	
	
	@SuppressWarnings("unused")
	private String getMascara() {
		return mascara;
	}

}
