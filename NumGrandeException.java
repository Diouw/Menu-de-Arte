//Jonathan Marques Christofoleti - Ra: 2266415
public class NumGrandeException extends Exception{
	
	Leitura l = new Leitura();

	public void impNumGrande(){
		System.out.println("\nCatch NumGrandeException - Ano deve ser verdadeiro!");
	}

	public Arte acertaAnoGrande(Arte a){
		try{
			a.setAno(Integer.parseInt(l.entDados("\nN. GRANDE - Infome o ano da obra:  ")));
		}
		catch(NumPeqException npe){
			npe.impNumPeq();
			npe.acertaAnoPequeno(a);
		}
		catch(NumGrandeException nge){
			nge.impNumGrande();
			nge.acertaAnoGrande(a);	
		}
		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impNum();
			ne.acertaAno(a);
		}
			
		return a;
	}

	public Teatro acertaAnoGrande(Teatro t){
		try{
			t.setAno(Integer.parseInt(l.entDados("\nN. GRANDE - Infome o ano da obra:  ")));
		}
		catch(NumPeqException npe){
			npe.impNumPeq();
			npe.acertaAnoPequeno(t);
		}
		catch(NumGrandeException nge){
			nge.impNumGrande();
			nge.acertaAnoGrande(t);	
		}
		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impNum();
			ne.acertaAno(t);
		}
		
		return t;	
		
	}

	public ArtesPlasticas acertaAnoGrande(ArtesPlasticas ap){
		try{
			ap.setAno(Integer.parseInt(l.entDados("\nN. GRANDE - Infome o ano da obra:  ")));
		}
		catch(NumPeqException npe){
			npe.impNumPeq();
			npe.acertaAnoPequeno(ap);
		}
		catch(NumGrandeException nge){
			nge.impNumGrande();
			nge.acertaAnoGrande(ap);	
		}
		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impNum();
			ne.acertaAno(ap);
		}
		
		return ap;	
		
	}	
}

