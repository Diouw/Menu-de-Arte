//Jonathan Marques Christofoleti - Ra: 2266415

import java.util.List;
import java.util.ArrayList;

public class MenuTeatro{

	private Teatro t;
	private Leitura l = new Leitura();

	private GerTeatro gerTeatro = new GerTeatro();

	public void geraMenuTeatro(){ 

		boolean programa = true;
		int opcao = 0;

		while(programa){
			System.out.println("==================== Teatro ====================");
			System.out.println("Digite o numero correspondente para a funcao que deseja fazer.");
			System.out.println("[1] - Adicionar uma nova peca de teatro.");
			System.out.println("[2] - Listar todas as pecas de teatro.");
			System.out.println("[3] - Consultar as pecas de teatro pelo seu codigo");
			System.out.println("[4] - Remover uma peca de teatro.");
			System.out.println("[5] - Atualizar dados da peca de teatro pelo codigo");
			System.out.println("[6] - Voltar para o menu principal");
			System.out.println("[7] - Sair.");
			System.out.println("================================================");

			try{
				opcao = Integer.parseInt(l.entDados("\nEscreva a opcao"));
			}
			catch(NumberFormatException nfe){
				l.entDados("\nO valor deve ser um numero. \nPress [Enter] para continuar");
				continue;
			}
			
			switch(opcao){
				case 1:
					System.out.println("Adicionar uma nova peca de teatro.");
					t = new Teatro();
					t = gerTeatro.cadTeatro(t);
					if (t != null){
						l.entDados("\nPeca de teatro cadastrada com sucesso!\nDigite [enter] para continuar.");
					}
					else{
						l.entDados("\nCodigo ja existe - Peca de teatro nao foi cadastrada!\nDigite [enter] para continuar.");
					}
					break;
				case 2:
					System.out.println("Listar todas as pecas de teatro.");
					gerTeatro.imprimeBdTeatro();
					l.entDados("\nDigite [enter] para continuar.");
					break;
				case 3:
					System.out.println("Consultar a peca de arte pelo seu codigo");	
					t = new Teatro();
					try{ 
						t.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					t = gerTeatro.consultaTeatroCodigo(t);
					if(t != null){
						gerTeatro.impUmTeatro(t);
						l.entDados("\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma peca de arte com esse codigo.\nDigite [enter] para continuar.");
					}
					break;
				case 4:
					System.out.println("Remover uma peca de teatro.");
					t = new Teatro();
					try{ 
						t.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					t = gerTeatro.consultaTeatroCodigo(t);
					if(t != null){
						gerTeatro.retiraTeatroCodigo(t);
						l.entDados("peca de teatro retirada com sucesso!\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma peca de teatro com esse codigo.\nPress [Enter] para continuar");
					}
					break;
				case 5:
					System.out.println("Atualizar dados da peca de teatro pelo codigo");
					t = new Teatro();
					try{ 
						t.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					t = gerTeatro.consultaTeatroCodigo(t);
					if(t != null){
						gerTeatro.atualizaTeatroCodigo(t);
						l.entDados("\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma peca de teatro com esse codigo.\nPress [Enter] para continuar");
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
	}//geraMenuTeatro
}//classe

		


		
