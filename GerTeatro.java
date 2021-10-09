//Jonathan Marques Christofoleti - Ra: 2266415

import java.util.List;
import java.util.ArrayList;

public class GerTeatro{

	private Teatro t;
	private List<Teatro> bdTeatro = new ArrayList<Teatro>();
	private Leitura l = new Leitura();

	
	public Teatro cadTeatro(Teatro t){
			//ano
			try{
				t.setAno(Integer.parseInt(l.entDados("\nInfome o ano da obra:  ")));
			}
			catch(NumPeqException npe){
				npe.impNumPeq();
				t = npe.acertaAnoPequeno(t);
			}
			catch(NumGrandeException nge){
				nge.impNumGrande();
				t = nge.acertaAnoGrande(t);	
			}
			catch(NumberFormatException nfe){
				NumException ne = new NumException();
				ne.impCodigo();
				ne.acertaCodigo(t);
			}
			
			//codigo
			try{
				t.setCodigo(Integer.parseInt(l.entDados("\nInforme o codigo da obra:  ")));
			}
			catch(NumberFormatException nfe){
				l.entDados("\nO valor deve ser um numero. \nPress [Enter] para continuar");
				//continue; - arrumar
			}

			t.setNomeObra(l.entDados("\nInforme o nome da obra:  "));
			t.setAutor(l.entDados("\nInforme o autor da obra:  "));

			t.getPer().setPeriodo(l.entDados("\nInforme o periodo da obra:  ")); //Reflexividade
			t.getPer().setCaracteristica(l.entDados("\nInforme a caracteristica principal do periodo:  ")); //Reflexividade
			t.setGenero(l.entDados("\nInforme o genero da obra:  "));
			t.setPersonagem(l.entDados("\nInforme o personagem principal da obra:  "));
			t.setRoteiro(l.entDados("\nInforme o roteiro da obra:  "));

			if(consultaTeatroCodigo(t) == null){
				bdTeatro.add(t);
				return t;
			}			
			else{
				return null;
			}
	}//cadTeatro

	public void imprimeBdTeatro(){
		
		for(int i = 0; i < bdTeatro.size(); i++){
			System.out.println("\n\n========TEATRO "+i+"=============");
			System.out.println("\nCodigo......................: "+bdTeatro.get(i).getCodigo());
			System.out.println("\nNome da obra................: "+bdTeatro.get(i).getNomeObra());
			System.out.println("\nNome do autor...............: "+bdTeatro.get(i).getAutor());
			System.out.println("\nAno da obra.................: "+bdTeatro.get(i).getAno());
			System.out.println("\nPeriodo.....................: "+bdTeatro.get(i).getPer().getPeriodo());
			System.out.println("\nCaracteristicas principais..: "+bdTeatro.get(i).getPer().getCaracteristica());
			System.out.println("\nGenero da obra..............: "+bdTeatro.get(i).getGenero());
			System.out.println("\nPersonagem principal........: "+bdTeatro.get(i).getPersonagem());
			System.out.println("\nRoteiro.....................: "+bdTeatro.get(i).getRoteiro());

		}//for			
	}//imprime


	public Teatro consultaTeatroCodigo(Teatro t){
		for(int i = 0; i<bdTeatro.size(); i++){
			if(t.getCodigo() == bdTeatro.get(i).getCodigo()){
				return bdTeatro.get(i);
			}//if
		}//for
		return null;	
	}//consulta

	public void impUmTeatro(Teatro t){
		System.out.println("\nCodigo......................: "+t.getCodigo());
		System.out.println("\nNome da obra................: "+t.getNomeObra());
		System.out.println("\nNome do autor...............: "+t.getAutor());
		System.out.println("\nAno da obra.................: "+t.getAno());
		System.out.println("\nPeriodo.....................: "+t.getPer().getPeriodo());
		System.out.println("\nCaracteristicas principais..: "+t.getPer().getCaracteristica());
		System.out.println("\nGenero da obra..............: "+t.getGenero());
		System.out.println("\nPersonagem principal........: "+t.getPersonagem());
		System.out.println("\nRoteiro.....................: "+t.getRoteiro());
	}
	public void retiraTeatroCodigo(Teatro t){
		bdTeatro.remove(t);
	}
	public void atualizaTeatroCodigo(Teatro t){
		t.setNomeObra(l.entDados("\nInfome um NOVO nome:  "));
		t.setAutor(l.entDados("\nInfome um NOVO autor:  "));
		try{
			t.setAno(Integer.parseInt(l.entDados("\nInfome o ano da obra:  ")));
		}
		catch(NumPeqException npe){
			npe.impNumPeq();
			t = npe.acertaAnoPequeno(t);
		}
		catch(NumGrandeException nge){
			nge.impNumGrande();
			t = nge.acertaAnoGrande(t);	
		}
		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impCodigo();
			ne.acertaCodigo(t);
		}
		t.getPer().setPeriodo(l.entDados("\nInfome um NOVO periodo:  "));
		t.getPer().setCaracteristica(l.entDados("\nInfome uma NOVA caracteristica:  "));
		t.setGenero(l.entDados("\nInforme o NOVO genero da obra:  "));
		t.setPersonagem(l.entDados("\nInforme o NOVO personagem principal da obra:  "));
		t.setRoteiro(l.entDados("\nInforme o NOVO roteiro da obra:  "));

		for(int i = 0; i<bdTeatro.size(); i++){
			if(t.getCodigo() == bdTeatro.get(i).getCodigo()){
				bdTeatro.set(i, t);
			}
		}
	}

		
}//classe

		


		
