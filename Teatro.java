//Jonathan Marques Christofoleti - Ra: 2266415
public class Teatro extends Arte{

	private String genero; 
	private String personagem;
	private String roteiro;


	public void impDados(){
		System.out.println("\nMetodo void impDados() da classe filha teatro!");
		
	}

	public Teatro(){
		genero = "";
		personagem = "";
		roteiro = "";
	}

	public String getGenero(){
		return genero;
	}

	public String getPersonagem(){
		return personagem;
	}

	public String getRoteiro(){
		return roteiro;
	}	

	public void setGenero(String genero){
		this.genero = genero;
	}

	public void setPersonagem(String personagem){
		this.personagem = personagem;
	}

	public void setRoteiro(String roteiro){
		this.roteiro = roteiro;
	}
	

}

