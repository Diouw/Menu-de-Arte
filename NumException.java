//Jonathan Marques Christofoleti - Ra: 2266415
public class NumException extends Exception{
	
	Leitura l = new Leitura();	
	
	public void impNum(){
		System.out.println("\nCatch NumException - Ano deve ser um numero!");
	}

	public void impCodigo(){
		System.out.println("\nCatch NumException - Codigo deve ser um numero!");
	}

	public Arte acertaAno(Arte a){
		try{
			a.setAno(Integer.parseInt(l.entDados("\nN. LETRA - Infome o ano da obra:  ")));
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

	public Teatro acertaAno(Teatro t){
		try{
			t.setAno(Integer.parseInt(l.entDados("\nN. LETRA - Infome o ano da obra:  ")));
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

	public ArtesPlasticas acertaAno(ArtesPlasticas ap){
		try{
			ap.setAno(Integer.parseInt(l.entDados("\nN. LETRA - Infome o ano da obra:  ")));
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

	//====================================================================================

	//codigo	
	public Arte acertaCodigo(Arte a){
		try{
			a.setCodigo(Integer.parseInt(l.entDados("\nLETRA - Infome o codigo da obra:  ")));
		}
		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impCodigo();
			ne.acertaCodigo(a);
		}
		
		return a;	
		
	}

	public Teatro acertaCodigo(Teatro t){
		try{
			t.setCodigo(Integer.parseInt(l.entDados("\nLETRA - Infome o codigo da obra:  ")));
		}

		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impCodigo();
			ne.acertaCodigo(t);
		}
		
		return t;	
		
	}

	public ArtesPlasticas acertaCodigo(ArtesPlasticas ap){
		try{
			ap.setCodigo(Integer.parseInt(l.entDados("\nLETRA - Infome o codigo da obra:  ")));
		}
		catch(NumberFormatException nfe){
			NumException ne = new NumException();
			ne.impCodigo();
			ne.acertaCodigo(ap);
		}
		
		return ap;	
		
	}
}

