public class Basketbolcu extends Sporcu{

	public int ikilik;
	public int ucluk;
	public int serbestAtis;
	public boolean kartKullanildiMi = true;

	public Basketbolcu(){

	}
	
	public Basketbolcu(String sporcuIsim, String sporcuTakim, int ikilik, int ucluk, int serbestAtis){
		super(sporcuIsim, sporcuTakim);
		this.ikilik = ikilik;
		this.ucluk = ucluk;
		this.serbestAtis = serbestAtis;
	}

	public void sporcuPuaniGoster(){
		
	}

	public void setIkilik(int ikilik){
		this.ikilik=ikilik;
	}
	
	public void setUcluk(int ucluk){
		this.ucluk=ucluk;
	}

	public void setSerbestAtis(int serbestAtis){
		this.serbestAtis=serbestAtis;
	}

	public void setKartKullanildiMi(boolean kartKullanildiMi){
		this.kartKullanildiMi=kartKullanildiMi;
	}

	public int getIkilik(){
		return this.ikilik;
	}
	
	public int getUcluk(){
		return this.ucluk;
	}

	public int getSerbestAtis(){
		return this.serbestAtis;
	}

	public boolean getKartKullanildiMi(){
		return this.kartKullanildiMi;
	}

}