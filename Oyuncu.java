import java.util.ArrayList;

public class Oyuncu{

	public int oyuncuID;
	public String oyuncuAdi;
	public int skor;
	public ArrayList<Sporcu> kartListesi;

	public Oyuncu(){

	}

	public Oyuncu(int oyuncuID, String oyuncuAdi, int skor){
		this.oyuncuID = oyuncuID;
		this.oyuncuAdi = oyuncuAdi;
		this.skor = skor;
	}

	public void setSkor(int skor){
		this.skor = skor;
	}

	public int getSkor(){
		return this.skor;
	}

	public int skorGoster(){
		return this.skor;
	}

	public void kartSec(){
		
	}



}