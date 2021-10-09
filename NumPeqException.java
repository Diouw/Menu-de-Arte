//Jonathan Marques Christofoleti - Ra: 2266415
public class NumPeqException extends Exception{
	
	Leitura l = new Leitura();	
	
	public void impNumPeq(){
		System.out.println("\nCatch NumPeqException - Ano deve ser positivo!");
	}

	public Arte acertaAnoPequeno(Arte a){
		try{
			a.setAno(Integer.parseInt(l.entDados("\nN. PEQUENO - Infome o ano da obra:  ")));
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

	public Teatro acertaAnoPequeno(Teatro t){
		try{
			t.setAno(Integer.parseInt(l.entDados("\nN. PEQUENO - Infome o ano da obra:  ")));
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

	public ArtesPlasticas acertaAnoPequeno(ArtesPlasticas ap){
		try{
			ap.setAno(Integer.parseInt(l.entDados("\nN. PEQUENO - Infome o ano da obra:  ")));
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

