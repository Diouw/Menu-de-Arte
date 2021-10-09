//Jonathan Marques Christofoleti - Ra: 2266415
public class Periodo{

	private String periodo;
	private String caracteristica;


	public Periodo(){
		//System.out.println("METODO CONSTRUTOR DO PERIODO");
		periodo = "";
		caracteristica = "";

	}
	
	//getters
	public String getPeriodo(){
		return periodo;
	}
	public String getCaracteristica(){
		return caracteristica;
	}

	//setters
	public void setPeriodo(String periodo){
		this.periodo = periodo;
	}
	public void setCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
	}
}

