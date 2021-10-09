//Jonathan Marques Christofoleti - Ra: 2266415
public class ArtesPlasticas extends Arte{

	private String material; 
	private String tecnica;
	private String movArtistico;


	public void impDados(){
		System.out.println("\nMetodo void impDados() da classe filha arte plastica!");
	}

	public ArtesPlasticas(){
		material = "";
		tecnica ="";
		movArtistico = "";
	}

	public String getMaterial(){
		return material;
	}

	public String getTecnica(){
		return tecnica;
	}

	public String getMovArtistico(){
		return movArtistico;
	}	

	public void setMaterial(String material){
		this.material = material;
	}

	public void setTecnica(String tecnica){
		this.tecnica = tecnica;
	}

	public void setMovArtistico(String movArtistico){
		this.movArtistico = movArtistico;
	}
	

}

