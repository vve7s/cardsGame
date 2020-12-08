public class Sporcu{

	public String sporcuIsim;
	public String sporcuTakim;
	public boolean kartKullanildiMi;

	public Sporcu(){

	}
	
	public Sporcu(String sporcuIsim,String sporcuTakim){
		this.sporcuIsim = sporcuIsim;
		this.sporcuTakim = sporcuTakim;
	}

	public void sporcuPuaniGoster(){
		
	}

	public String getSporcuIsim(){
		return sporcuIsim;
	}

	public String getSporcuTakim(){
		return sporcuTakim;
	}

	public void setSporcuIsim(String sporcuIsim){
		this.sporcuIsim = sporcuIsim;
	}

	public void setSporcuTakim(String sporcuTakim){
		this.sporcuTakim = sporcuTakim;
	}

}