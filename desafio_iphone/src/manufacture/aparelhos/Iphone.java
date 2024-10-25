package manufacture.aparelhos;

import manufacture.interfaces.*;

import java.util.Scanner;




public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	Scanner scanner = new Scanner(System.in);

	String musica;

	String url;

	String numero;



	// métodos AparelhoTelefonico

	public void ligar() {

		System.out.print("Digite o número:");

		numero = scanner.next();
		
		System.out.println("Ligando para o número " + numero);
		
		
	}

	public void atender() {
		
		System.out.println("Atender ligação");
		
	}
	public void iniciarCorreioVoz() {
		
		System.out.println("Ouvir recados");
		
	}
	

	// Métodos NavegadorIntenet 

	public void exibirPagina() {

		url = scanner.next();
		
		System.out.println("A página atual é " + url);
		
		
	}
	public void adicionarNovaAba() {
		
		System.out.println("Abrindo nova aba ");
	}
	public void atualizarPagina() {
		
		System.out.println("Atualizando ");
		
	}

	// Métodos ReprodutorMusical
	
	public void tocar() {
		
		if(musica == null) {

			System.out.println("Selecione uma música");

			selecionarMusica();

		}
			
		
		System.out.println("Tocando a Música " + musica );
		
		
	}
	
	
	
	public void pausar() {
		
		System.out.println("Música pausada");
		
	}
	
	
	public void selecionarMusica() {

		System.out.print("Digite o nome da música:");
		musica = scanner.next();
		
	}

	
}
