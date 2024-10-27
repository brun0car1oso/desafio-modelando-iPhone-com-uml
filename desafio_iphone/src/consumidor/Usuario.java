package consumidor;

import manufacture.aparelhos.Iphone;

public class Usuario {
	
	public static void main(String[] args) {
	
		Iphone celular = new Iphone();

		celular.selecionarMusica();
		
		System.out.print("\n");

		celular.tocar();
		
		System.out.print("\n");
		
		celular.exibirPagina();
		
		System.out.print("\n");

		celular.atualizarPagina();
		
		System.out.print("\n");

		celular.adicionarNovaAba();
		
		System.out.print("\n");

		celular.ligar();
		
		System.out.print("\n");
		
		celular.iniciarCorreioVoz();
		
		System.out.print("\n");

		celular.atender();
	}

}
