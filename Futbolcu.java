public class Futbolcu extends Sporcu{
	
	public int penalti;
	public int serbestAtis;
	public int kaleciKarsiKarsiya;
	public boolean kartKullanildiMi = true;

	public Futbolcu(){

	}
	
	public Futbolcu(String sporcuIsim, String sporcuTakim,int penalti, int serbestAtis, int kaleciKarsiKarsiya){
		super(sporcuIsim, sporcuTakim);
		this.penalti = penalti;
		this.serbestAtis = serbestAtis;
		this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
	}

	public void sporcuPuaniGoster(){

	}

	public void setPenalti(int penalti){
		this.penalti=penalti;
	}

	public void setSerbestAtis(int serbestAtis){
		this.serbestAtis=serbestAtis;
	}

	public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya){
		this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
	}

	public void setKartKullanildiMi(boolean kartKullanildiMi){
		this.kartKullanildiMi=kartKullanildiMi;
	}

	public int getPenalti(){
		return this.penalti;
	}

	public int getSerbestAtis(){
		return this.serbestAtis;
	}

	public int getKaleciKarsiKarsiya(){
		return this.kaleciKarsiKarsiya;
	}

	public boolean getKartKullanildiMi(){
		return this.kartKullanildiMi;
	}

	
}