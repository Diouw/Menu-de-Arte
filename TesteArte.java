//Jonathan Marques Christofoleti - Ra: 2266415

import java.util.List;
import java.util.ArrayList;

public class TesteArte{

	private static MenuArte menuArte = new MenuArte();
	private static MenuTeatro menuTeatro = new MenuTeatro();
	private static MenuArtesPlasticas menuArtesPlasticas = new MenuArtesPlasticas();
	private static Leitura l = new Leitura();

	public static void main(String arg[]){ //class loader
		System.out.println("\n\nPrograma computacional em java que lista, armazena e imprime o acervo de arte.\n");

		boolean programa = true;
		int opcao = 0;

		while(programa){
			System.out.println("******************** Menu do programa ********************");
			System.out.println("Digite o numero correspondente para a funcao que deseja fazer.");
			System.out.println("[1] - Ir para o cadastro de artes.");
			System.out.println("[2] - Ir para o cadastro de teatro.");
			System.out.println("[3] - Ir para o cadastro de artes plasticas");
			System.out.println("[4] - Sair.");
			System.out.println("**********************************************************");

			try{
				opcao = Integer.parseInt(l.entDados("\nEscreva a opcao"));
			}
			catch(NumberFormatException nfe){
				l.entDados("\nO valor deve ser um numero. \nPress [Enter] para continuar");
				continue;
			}
			switch(opcao){
				case 1:
					menuArte.geraMenuArte();
					break;
				case 2:
					menuTeatro.geraMenuTeatro();
					break;
				case 3:
					menuArtesPlasticas.geraMenuArtesPlasticas();
					break;
				case 4:
					String resposta = l.entDados("\nDeseja realmente sair do programa? [S/N]");
					if(resposta.equalsIgnoreCase("s")){
						System.exit(0);
					}
					break;
				default:
					l.entDados("A opcao deve estar entre 1 e 4\nPress [Enter] para continuar");
					break;
			}//switch
		}//while
	}//main		
}//classe

		


		
