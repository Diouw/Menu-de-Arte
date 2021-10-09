//Jonathan Marques Christofoleti - Ra: 2266415

import java.util.List;
import java.util.ArrayList;

public class GerArte{

	private Arte a;
	private List<Arte> bdArte = new ArrayList<Arte>();
	private Leitura l = new Leitura();

	
	public Arte cadArte(Arte a){
			//ano
			try{
				a.setAno(Integer.parseInt(l.entDados("\nInfome o ano da obra:  ")));
			}
			catch(NumPeqException npe){
				npe.impNumPeq();
				a = npe.acertaAnoPequeno(a);
			}
			catch(NumGrandeException nge){
				nge.impNumGrande();
				a = nge.acertaAnoGrande(a);	
			}
			catch(NumberFormatException nfe){
				NumException ne = new NumException();
				ne.impNum();
				ne.acertaAno(a);
			}
			
			//codigo
			try{
				a.setCodigo(Integer.parseInt(l.entDados("\nInforme o codigo da obra:  ")));
			}
			catch(NumberFormatException nfe){
				NumException ne = new NumException();
				ne.impCodigo();
				ne.acertaCodigo(a);
			}

			a.setNomeObra(l.entDados("\nInforme o nome da obra:  "));
			a.setAutor(l.entDados("\nInforme o autor da obra:  "));

			a.getPer().setPeriodo(l.entDados("\nInforme o periodo da obra:  ")); //Reflexividade
			a.getPer().setCaracteristica(l.entDados("\nInforme a caracteristica principal do periodo:  ")); //Reflexividade

			if(consultaArteCodigo(a) == null){
				bdArte.add(a);
				return a;
			}			
			else{
				return null;
			}
	}//cadArte

	public void imprimeBdArte(){
		
		for(int i = 0; i < bdArte.size(); i++){
			System.out.println("\n\n========ARTE "+i+"=============");
			System.out.println("\nCodigo......................: "+bdArte.get(i).getCodigo());
			System.out.println("\nNome da obra................: "+bdArte.get(i).getNomeObra());
			System.out.println("\nNome do autor...............: "+bdArte.get(i).getAutor());
			System.out.println("\nAno da obra.................: "+bdArte.get(i).getAno());
			System.out.println("\nPeriodo.....................: "+bdArte.get(i).getPer().getPeriodo());
			System.out.println("\nCaracteristicas principais..: "+bdArte.get(i).getPer().getCaracteristica());

		}//for			
	}//imprime


	public Arte consultaArteCodigo(Arte a){
		for(int i = 0; i<bdArte.size(); i++){
			if(a.getCodigo() == bdArte.get(i).getCodigo()){
				return bdArte.get(i);
			}//if
		}//for
		return null;	
	}//consulta

	public void impUmaArte(Arte a){
		System.out.println("\nCodigo......................: "+a.getCodigo());
		System.out.println("\nNome da obra................: "+a.getNomeObra());
		System.out.println("\nNome do autor...............: "+a.getAutor());
		System.out.println("\nAno da obra.................: "+a.getAno());
		System.out.println("\nPeriodo.....................: "+a.getPer().getPeriodo());
		System.out.println("\nCaracteristicas principais..: "+a.getPer().getCaracteristica());
	}
	public void retiraArteCodigo(Arte a){
		bdArte.remove(a);
	}
	public void atualizaArteCodigo(Arte a){
		a.setNomeObra(l.entDados("\nInfome um NOVO nome:  "));
		a.setAutor(l.entDados("\nInfome um NOVO autor:  "));
		try{
			a.setAno(Integer.parseInt(l.entDados("\nInfome o ano da obra:  ")));
		}
		catch(NumPeqException npe){
			npe.impNumPeq();
			a = npe.acertaAnoPequeno(a);
		}
		catch(NumGrandeException nge){
			nge.impNumGrande();
			a = nge.acertaAnoGrande(a);	
		}
		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impCodigo();
			ne.acertaCodigo(a);
		}
		a.getPer().setPeriodo(l.entDados("\nInfome um NOVO periodo:  "));
		a.getPer().setCaracteristica(l.entDados("\nInfome uma NOVA caracteristica:  "));

		for(int i = 0; i<bdArte.size(); i++){
			if(a.getCodigo() == bdArte.get(i).getCodigo()){
				bdArte.set(i, a);
			}
		}
	}

		
}//classe

		


		
