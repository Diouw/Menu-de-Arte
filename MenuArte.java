//Jonathan Marques Christofoleti - Ra: 2266415

import java.util.List;
import java.util.ArrayList;

public class MenuArte{

	private Arte a;
	private Leitura l = new Leitura();

	private GerArte gerArte = new GerArte();

	public void geraMenuArte(){ 

		boolean programa = true;
		int opcao = 0;

		while(programa){
			System.out.println("==================== Arte ====================");
			System.out.println("Digite o numero correspondente para a funcao que deseja fazer.");
			System.out.println("[1] - Adicionar uma nova arte.");
			System.out.println("[2] - Listar todas as artes.");
			System.out.println("[3] - Consultar a arte pelo seu codigo");
			System.out.println("[4] - Remover uma arte.");
			System.out.println("[5] - Atualizar dados da arte pelo codigo");
			System.out.println("[6] - Voltar para o menu principal");
			System.out.println("[7] - Sair.");
			System.out.println("==============================================");

			try{
				opcao = Integer.parseInt(l.entDados("\nEscreva a opcao"));
			}
			catch(NumberFormatException nfe){
				l.entDados("\nO valor deve ser um numero. \nPress [Enter] para continuar");
				continue;
			}
			
			switch(opcao){
				case 1:
					System.out.println("Adicionar uma nova arte.");
					a = new Arte();
					a = gerArte.cadArte(a);
					if (a != null){
						l.entDados("\nArte cadastrada com sucesso!\nDigite [enter] para continuar.");
					}
					else{
						l.entDados("\nCodigo de arte ja existe - Arte nao foi cadastrada!\nDigite [enter] para continuar.");
					}
					break;
				case 2:
					System.out.println("Listar todas as artes.");
					gerArte.imprimeBdArte();
					l.entDados("\nDigite [enter] para continuar.");
					break;
				case 3:
					System.out.println("Consultar a arte pelo seu codigo");	
					a = new Arte();
					try{ 
						a.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					a = gerArte.consultaArteCodigo(a);
					if(a != null){
						gerArte.impUmaArte(a);
						l.entDados("\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma arte com esse codigo.\nDigite [enter] para continuar.");
					}
					break;
				case 4:
					System.out.println("Remover uma arte.");
					a = new Arte();
					try{ 
						a.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					a = gerArte.consultaArteCodigo(a);
					if(a != null){
						gerArte.retiraArteCodigo(a);
						l.entDados("Arte retirada com sucesso!\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma arte com esse codigo.\nPress [Enter] para continuar");
					}
					break;
				case 5:
					System.out.println("Atualizar dados da arte pelo codigo");
					a = new Arte();
					try{ 
						a.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					a = gerArte.consultaArteCodigo(a);
					if(a != null){
						gerArte.atualizaArteCodigo(a);
						l.entDados("\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma arte com esse codigo.\nPress [Enter] para continuar");
					}
					break;

				case 6:
					programa = false;
					break;
				case 7:
					String resposta = l.entDados("\nDeseja realmente sair do programa? [S/N]");
					if(resposta.equalsIgnoreCase("s")){
						System.exit(0);
					}
					break;
				default:
					l.entDados("A opcao deve estar entre 1 e 7\nPress [Enter] para continuar");
					break;
			}//switch
		}//while
	}//geraMenuArte
}//classe

		


		
