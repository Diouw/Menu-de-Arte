//Jonathan Marques Christofoleti - Ra: 2266415

import java.util.List;
import java.util.ArrayList;

public class GerArtesPlasticas{

	private ArtesPlasticas ap;
	private List<ArtesPlasticas> bdArtesPlasticas = new ArrayList<ArtesPlasticas>();
	private Leitura l = new Leitura();

	
	public ArtesPlasticas cadArtesPlasticas(ArtesPlasticas ap){
			//ano
			try{
				ap.setAno(Integer.parseInt(l.entDados("\nInfome o ano da obra:  ")));
			}
			catch(NumPeqException npe){
				npe.impNumPeq();
				ap = npe.acertaAnoPequeno(ap);
			}
			catch(NumGrandeException nge){
				nge.impNumGrande();
				ap = nge.acertaAnoGrande(ap);	
			}
			catch(NumberFormatException nfe){
				NumException ne = new NumException();
				ne.impNum();
				ne.acertaAno(ap);
				
			}
			
			//codigo
			try{
				ap.setCodigo(Integer.parseInt(l.entDados("\nInforme o codigo da obra:  ")));
			}
			catch(NumberFormatException nfe){
				NumException ne = new NumException();
				ne.impCodigo();
				ne.acertaCodigo(ap);
			}

			ap.setNomeObra(l.entDados("\nInforme o nome da obra:  "));
			ap.setAutor(l.entDados("\nInforme o autor da obra:  "));

			ap.getPer().setPeriodo(l.entDados("\nInforme o periodo da obra:  ")); //Reflexividade
			ap.getPer().setCaracteristica(l.entDados("\nInforme a caracteristica principal do periodo:  ")); //Reflexividade
			ap.setMaterial(l.entDados("\nInforme o material utilizado na obra:  "));
			ap.setTecnica(l.entDados("\nInforme a tecnica usada na obra:  "));
			ap.setMovArtistico(l.entDados("\nInforme o movimento artistico obra:  "));

			if(consultaArtesPlasticasCodigo(ap) == null){
				bdArtesPlasticas.add(ap);
				return ap;
			}			
			else{
				return null;
			}
	}//cadArtesPlasticas

	public void imprimeBdArtesPlasticas(){
		
		for(int i = 0; i < bdArtesPlasticas.size(); i++){
			System.out.println("\n\n========ARTE PLASTICA "+i+"=============");
			System.out.println("\nCodigo......................: "+bdArtesPlasticas.get(i).getCodigo());
			System.out.println("\nNome da obra................: "+bdArtesPlasticas.get(i).getNomeObra());
			System.out.println("\nNome do autor...............: "+bdArtesPlasticas.get(i).getAutor());
			System.out.println("\nAno da obra.................: "+bdArtesPlasticas.get(i).getAno());
			System.out.println("\nPeriodo.....................: "+bdArtesPlasticas.get(i).getPer().getPeriodo());
			System.out.println("\nCaracteristicas principais..: "+bdArtesPlasticas.get(i).getPer().getCaracteristica());
			System.out.println("\nMaterial....................: "+bdArtesPlasticas.get(i).getMaterial());
			System.out.println("\nTecnica.....................: "+bdArtesPlasticas.get(i).getTecnica());
			System.out.println("\nMovimento Artistico.........: "+bdArtesPlasticas.get(i).getMovArtistico());

		}//for			
	}//imprime


	public ArtesPlasticas consultaArtesPlasticasCodigo(ArtesPlasticas ap){
		for(int i = 0; i<bdArtesPlasticas.size(); i++){
			if(ap.getCodigo() == bdArtesPlasticas.get(i).getCodigo()){
				return bdArtesPlasticas.get(i);
			}//if
		}//for
		return null;	
	}//consulta

	public void impUmaArtesPlasticas(ArtesPlasticas ap){
		System.out.println("\nCodigo......................: "+ap.getCodigo());
		System.out.println("\nNome da obra................: "+ap.getNomeObra());
		System.out.println("\nNome do autor...............: "+ap.getAutor());
		System.out.println("\nAno da obra.................: "+ap.getAno());
		System.out.println("\nPeriodo.....................: "+ap.getPer().getPeriodo());
		System.out.println("\nCaracteristicas principais..: "+ap.getPer().getCaracteristica());
		System.out.println("\nMaterial....................: "+ap.getMaterial());
		System.out.println("\nTecnica.....................: "+ap.getTecnica());
		System.out.println("\nMovimento Artistico.........: "+ap.getMovArtistico());
	}
	public void retiraArtesPlasticasCodigo(ArtesPlasticas ap){
		bdArtesPlasticas.remove(ap);
	}
	public void atualizaArtesPlasticasCodigo(ArtesPlasticas ap){
		ap.setNomeObra(l.entDados("\nInfome um NOVO nome:  "));
		ap.setAutor(l.entDados("\nInfome um NOVO autor:  "));
		try{
			ap.setAno(Integer.parseInt(l.entDados("\nInfome o ano da obra:  ")));
		}
		catch(NumPeqException npe){
			npe.impNumPeq();
			ap = npe.acertaAnoPequeno(ap);
		}
		catch(NumGrandeException nge){
			nge.impNumGrande();
			ap = nge.acertaAnoGrande(ap);	
		}
		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impNum();
			ne.acertaAno(ap);
		}
		ap.getPer().setPeriodo(l.entDados("\nInfome um NOVO periodo:  "));
		ap.getPer().setCaracteristica(l.entDados("\nInfome uma NOVA caracteristica:  "));
		ap.setMaterial(l.entDados("\nInfome um NOVO material:  "));
		ap.setTecnica(l.entDados("\nInfome uma NOVA tecnica:  "));
		ap.setMovArtistico(l.entDados("\nInfome um NOVO movimento artistico:  "));

		for(int i = 0; i<bdArtesPlasticas.size(); i++){
			if(ap.getCodigo() == bdArtesPlasticas.get(i).getCodigo()){
				bdArtesPlasticas.set(i, ap);
			}
		}
	}

		
}//classe

		


		
