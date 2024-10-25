package consumidor;

import manufacture.aparelhos.Iphone;

public class Usuario {
	
	public static void main(String[] args) {
	
		Iphone celular = new Iphone();

		celular.selecionarMusica();

		celular.tocar();

		celular.exibirPagina();

		celular.atualizarPagina();

		celular.adicionarNovaAba();

		celular.ligar();
		
		celular.iniciarCorreioVoz();

		celular.atender();
	}

}
