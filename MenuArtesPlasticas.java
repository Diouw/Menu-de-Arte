//Jonathan Marques Christofoleti - Ra: 2266415

import java.util.List;
import java.util.ArrayList;

public class MenuArtesPlasticas{

	private ArtesPlasticas ap;
	private Leitura l = new Leitura();

	private GerArtesPlasticas gerArtesPlasticas = new GerArtesPlasticas();

	public void geraMenuArtesPlasticas(){ 

		boolean programa = true;
		int opcao = 0;

		while(programa){
			System.out.println("================ Artes Plasticas ================");
			System.out.println("Digite o numero correspondente para a funcao que deseja fazer.");
			System.out.println("[1] - Adicionar uma nova arte plastica.");
			System.out.println("[2] - Listar todas as artes plasticas.");
			System.out.println("[3] - Consultar a arte plastica pelo seu codigo");
			System.out.println("[4] - Remover uma arte plastica.");
			System.out.println("[5] - Atualizar dados da arte plastica pelo codigo");
			System.out.println("[6] - Voltar para o menu principal");
			System.out.println("[7] - Sair.");
			System.out.println("=================================================");

			try{
				opcao = Integer.parseInt(l.entDados("\nEscreva a opcao"));
			}
			catch(NumberFormatException nfe){
				l.entDados("\nO valor deve ser um numero. \nPress [Enter] para continuar");
				continue;
			}
			
			switch(opcao){
				case 1:
					System.out.println("Adicionar uma nova arte plastica.");
					ap = new ArtesPlasticas();
					ap = gerArtesPlasticas.cadArtesPlasticas(ap);
					if (ap != null){
						l.entDados("\nArte Plastica cadastrada com sucesso!\nDigite [enter] para continuar.");
					}
					else{
						l.entDados("\nCodigo de arte plastica ja existe - Arte nao foi cadastrada!\nDigite [enter] para continuar.");
					}
					break;
				case 2:
					System.out.println("Listar todas as artes plasticas.");
					gerArtesPlasticas.imprimeBdArtesPlasticas();
					l.entDados("\nDigite [enter] para continuar.");
					break;
				case 3:
					System.out.println("Consultar a arte plastica pelo seu codigo");	
					ap = new ArtesPlasticas();
					try{ 
						ap.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					ap = gerArtesPlasticas.consultaArtesPlasticasCodigo(ap);
					if(ap != null){
						gerArtesPlasticas.impUmaArtesPlasticas(ap);
						l.entDados("\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma arte com esse codigo.\nDigite [enter] para continuar.");
					}
					break;
				case 4:
					System.out.println("Remover uma arte plastica.");
					ap = new ArtesPlasticas();
					try{ 
						ap.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					ap = gerArtesPlasticas.consultaArtesPlasticasCodigo(ap);
					if(ap != null){
						gerArtesPlasticas.retiraArtesPlasticasCodigo(ap);
						l.entDados("Arte plastica retirada com sucesso!\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma arte plastica com esse codigo.\nPress [Enter] para continuar");
					}
					break;
				case 5:
					System.out.println("Atualizar dados da arte plastica pelo codigo");
					ap = new ArtesPlasticas();
					try{ 
						ap.setCodigo(Integer.parseInt(l.entDados("\nEscreva o codigo")));
					}
					catch(NumberFormatException nfe){
						l.entDados("\nO valor deve ser um numero. \nPress [Enter] para voltar ao menu");
						continue;
					}
					ap = gerArtesPlasticas.consultaArtesPlasticasCodigo(ap);
					if(ap != null){
						gerArtesPlasticas.atualizaArtesPlasticasCodigo(ap);
						l.entDados("\nPress [Enter] para continuar");
					}
					else{
						l.entDados("\nNao existe nenhuma arte plastica com esse codigo.\nPress [Enter] para continuar");
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

		


		
