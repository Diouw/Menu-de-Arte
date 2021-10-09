//Jonathan Marques Christofoleti - Ra: 2266415
public class Arte{

	private String nomeObra; 
	private String autor;
	private Periodo per;
	private int ano;
	private int codigo;
	
	//public abstract void impDados();	
	//qnd for deixar a classe arte abstrata
 
	public Arte(){ //inicialização dos atributos
		codigo = 0;
		nomeObra = "";
		autor = "";
		per = new Periodo();
		ano = 0;
	}
	
	//polimorfismo sobrecarga
	public Arte(String nomeObra, String autor, int ano){
	
		this.nomeObra = nomeObra;
		this.autor = autor;
		this.ano = ano;	
	}

	//periodo
	public Periodo getPer(){
		return per;
	}
	public void setPer(Periodo per){
		this.per = per;
	}


	//getters
	public String getNomeObra(){
		return nomeObra;
	}
	public String getAutor(){
		return autor;
	}
	public int getAno(){
		return ano;
	}
	public int getCodigo(){
		return codigo;
	}
	
	//setters
	public void setNomeObra(String nomeObra){
		this.nomeObra = nomeObra;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public void setAno(int ano) throws NumPeqException, NumGrandeException{
		if(ano > 0){
			if(ano < 2022){
				this.ano = ano;
			}
			else{
				throw new NumGrandeException();
			}
		}
		if(ano < 0){
			throw new NumPeqException();
		}
	}
	

}

