import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Test{

	public static Futbolcu fut1;
	public static Futbolcu fut2;
	public static Futbolcu fut3;
	public static Futbolcu fut4;
	public static Futbolcu fut5;
	public static Futbolcu fut6;
	public static Futbolcu fut7;
	public static Futbolcu fut8;
	public static Basketbolcu bas1;
	public static Basketbolcu bas2;
	public static Basketbolcu bas3;
	public static Basketbolcu bas4;
	public static Basketbolcu bas5;
	public static Basketbolcu bas6;
	public static Basketbolcu bas7;
	public static Basketbolcu bas8;
	public static ArrayList<Sporcu> randomListe;
	public static ArrayList<Futbolcu> futbolcuListe;
	public static ArrayList<Basketbolcu> basketbolcuListe;
	public static JButton button1;
	public static JButton button2;
	public static JButton button3;
	public static JButton button4;
	public static JButton button5;
	public static JButton button6;
	public static JButton button7;
	public static JButton button8;
	public static JLabel oyunAlaniSol;
	public static JLabel oyunAlaniOrta;
	public static JLabel oyunAlaniSag;
	public static JButton yenidenBaslat;



	public static void main(String[] args){

		randomListe = new ArrayList<>();
		futbolcuListe = new ArrayList<>();
		basketbolcuListe = new ArrayList<>();


		fut1 = new Futbolcu("Dida","Milan",90,50,90);
		fut2 = new Futbolcu("Maldini","Milan",55,55,100);
		fut3 = new Futbolcu("Pirlo","Milan",90,100,55);
		fut4 = new Futbolcu("Kaka","Milan",80,95,90);
		fut5 = new Futbolcu("Inzaghi","Milan",65,65,100);
		fut6 = new Futbolcu("Seedorf","Milan",80,70,80);
		fut7 = new Futbolcu("Cafu","Milan",76,75,75);
		fut8 = new Futbolcu("Gattuso","Milan",70,65,70);
		futbolcuListe.add(fut1);
		futbolcuListe.add(fut2);
		futbolcuListe.add(fut3);
		futbolcuListe.add(fut4);
		futbolcuListe.add(fut5);
		futbolcuListe.add(fut6);
		futbolcuListe.add(fut7);
		futbolcuListe.add(fut8);

		bas1 = new Basketbolcu("Kerem Tunceri","Türkiye",100,80,85);
		bas2 = new Basketbolcu("Hidayet Turkoglu","Türkiye",95,85,80);
		bas3 = new Basketbolcu("Ibrahim Kutluay","Türkiye",90,80,85);
		bas4 = new Basketbolcu("Mehmet Okur","Türkiye",85,90,80);
		bas5 = new Basketbolcu("Semih Erden","Türkiye",80,85,90);
		bas6 = new Basketbolcu("Cedi Osman","Türkiye",80,95,75);
		bas7 = new Basketbolcu("Sinan Güler","Türkiye",90,80,80);
		bas8 = new Basketbolcu("Can Bartu","Türkiye",100,100,100);
		basketbolcuListe.add(bas1);
		basketbolcuListe.add(bas2);
		basketbolcuListe.add(bas3);
		basketbolcuListe.add(bas4);
		basketbolcuListe.add(bas5);
		basketbolcuListe.add(bas6);
		basketbolcuListe.add(bas7);
		basketbolcuListe.add(bas8);

		//Oyuncu olusturuluyor
		Oyuncu insan = new Oyuncu(52,"Osasuna",0);//id,takimadi,skor
		insan.kartListesi = new ArrayList<>();

		//Bilgisayar olusturuluyor
		Bilgisayar makine = new Bilgisayar(81,"DeepBlue",0);//id,takimadi,skor
		makine.kartListesi = new ArrayList<>();


		//insan icin random futbolcu ve basketbolcu seciyor
		new Test().randomFutbolcuSec(insan.kartListesi);
		new Test().randomFutbolcuSec(insan.kartListesi);
		new Test().randomFutbolcuSec(insan.kartListesi);
		new Test().randomFutbolcuSec(insan.kartListesi);
		new Test().randomBasketbolcuSec(insan.kartListesi);
		new Test().randomBasketbolcuSec(insan.kartListesi);
		new Test().randomBasketbolcuSec(insan.kartListesi);
		new Test().randomBasketbolcuSec(insan.kartListesi);

		//Bilgisayar icin random futbolcu ve basketbolcu seciyor
		new Test().randomFutbolcuSec(makine.kartListesi);
		new Test().randomFutbolcuSec(makine.kartListesi);
		new Test().randomFutbolcuSec(makine.kartListesi);
		new Test().randomFutbolcuSec(makine.kartListesi);
		new Test().randomBasketbolcuSec(makine.kartListesi);
		new Test().randomBasketbolcuSec(makine.kartListesi);
		new Test().randomBasketbolcuSec(makine.kartListesi);
		new Test().randomBasketbolcuSec(makine.kartListesi);

		
		//System.out.println(insan.kartListesi.get(0).getSporcuIsim());
		System.out.println("Insan icin secilen kartlar");
		new Test().insanKartlariniGoster(insan.kartListesi);
		System.out.println();
		System.out.println("Makine icin secilen kartlar");
		new Test().insanKartlariniGoster(makine.kartListesi);



		new Test().start(insan, makine);

	}

	public void randomFutbolcuSec(ArrayList<Sporcu> kartListesi){
		Random rnd = new Random();
		int tempDeger = 0;

		while(true){
			tempDeger = rnd.nextInt(8)+1;

			if(tempDeger == 1 && fut1.getKartKullanildiMi()){
				randomListe.add(fut1);
				kartListesi.add(fut1);
				fut1.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 2 && fut2.getKartKullanildiMi()){
				randomListe.add(fut2);
				kartListesi.add(fut2);
				fut2.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 3 && fut3.getKartKullanildiMi()){
				randomListe.add(fut3);
				kartListesi.add(fut3);
				fut3.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 4 && fut4.getKartKullanildiMi()){
				randomListe.add(fut4);
				kartListesi.add(fut4);
				fut4.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 5 && fut5.getKartKullanildiMi()){
				randomListe.add(fut5);
				kartListesi.add(fut5);
				fut5.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 6 && fut6.getKartKullanildiMi()){
				randomListe.add(fut6);
				kartListesi.add(fut6);
				fut6.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 7 && fut7.getKartKullanildiMi()){
				randomListe.add(fut7);
				kartListesi.add(fut7);
				fut7.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 8 && fut8.getKartKullanildiMi()){
				randomListe.add(fut8);
				kartListesi.add(fut8);
				fut8.setKartKullanildiMi(false);
				break;
			}

			if(!futbolcuSecilmeyenKaldiMi())
				break;
		}
	}

	public void randomBasketbolcuSec(ArrayList<Sporcu> kartListesi){
		Random rnd = new Random();
		int tempDeger = 0;

		while(true){
			tempDeger = rnd.nextInt(8)+1;

			if(tempDeger == 1 && bas1.getKartKullanildiMi()){
				randomListe.add(bas1);
				kartListesi.add(bas1);
				bas1.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 2 && bas2.getKartKullanildiMi()){
				randomListe.add(bas2);
				kartListesi.add(bas2);
				bas2.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 3 && bas3.getKartKullanildiMi()){
				randomListe.add(bas3);
				kartListesi.add(bas3);
				bas3.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 4 && bas4.getKartKullanildiMi()){
				randomListe.add(bas4);
				kartListesi.add(bas4);
				bas4.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 5 && bas5.getKartKullanildiMi()){
				randomListe.add(bas5);
				kartListesi.add(bas5);
				bas5.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 6 && bas6.getKartKullanildiMi()){
				randomListe.add(bas6);
				kartListesi.add(bas6);
				bas6.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 7 && bas7.getKartKullanildiMi()){
				randomListe.add(bas7);
				kartListesi.add(bas7);
				bas7.setKartKullanildiMi(false);
				break;
			}
			else if(tempDeger == 8 && bas8.getKartKullanildiMi()){
				randomListe.add(bas8);
				kartListesi.add(bas8);
				bas8.setKartKullanildiMi(false);
				break;
			}

			if(!basketbolcuSecilmeyenKaldiMi())
				break;
		}
	}

	public void insanKartlariniGoster(ArrayList<Sporcu> kartListesi){
		for(Sporcu birey: kartListesi)
			System.out.println(birey.getSporcuIsim());
	}

	public void makineKartlariniGoster(ArrayList<Sporcu> kartListesi){
		for(Sporcu birey: kartListesi)
			System.out.println(birey.getSporcuIsim());
	}

	public boolean futbolcuSecilmeyenKaldiMi(){
		for(Futbolcu birey: futbolcuListe) {
			if(!birey.kartKullanildiMi)
				return true;
		}
		return false;
	}

	public boolean basketbolcuSecilmeyenKaldiMi(){
		for(Basketbolcu birey: basketbolcuListe) {
			if(!birey.kartKullanildiMi)
				return true;
		}
		return false;
	}


	public void start(Oyuncu insan, Bilgisayar makine){

		JFrame frame = new JFrame("Game");

		JPanel head = new JPanel();
		head.setBackground(Color.black);

		JPanel body = new JPanel();
		body.setBackground(Color.white);

		JPanel footer = new JPanel();
		footer.setBackground(Color.black);

		//Bilgisayar tuslari
		button1 = new JButton();
		button1.setBackground(Color.black);
		button1.setForeground(Color.white);  
		button1.setMargin(new Insets(0, 0, 0, 0));
		button1.setFont(new Font("Arial", Font.PLAIN, 10));
		//button1.setText(makine.kartListesi.get(0).getSporcuIsim());

        button2 = new JButton();
		button2.setBackground(Color.black);
		button2.setForeground(Color.white);  
		button2.setMargin(new Insets(0, 0, 0, 0));
		button2.setFont(new Font("Arial", Font.PLAIN, 10));
		//button2.setText(makine.kartListesi.get(1).getSporcuIsim());

        button3 = new JButton();
		button3.setBackground(Color.black);
		button3.setForeground(Color.white);  
		button3.setMargin(new Insets(0, 0, 0, 0));
		button3.setFont(new Font("Arial", Font.PLAIN, 10));
		//button3.setText(makine.kartListesi.get(2).getSporcuIsim());

        button4 = new JButton();
		button4.setBackground(Color.black);
		button4.setForeground(Color.white);  
		button4.setMargin(new Insets(0, 0, 0, 0));
		button4.setFont(new Font("Arial", Font.PLAIN, 10));
		//button4.setText(makine.kartListesi.get(3).getSporcuIsim());

        button5 = new JButton();
		button5.setBackground(Color.black);
		button5.setForeground(Color.white);  
		button5.setMargin(new Insets(0, 0, 0, 0));
		button5.setFont(new Font("Arial", Font.PLAIN, 10));
		//button5.setText(makine.kartListesi.get(4).getSporcuIsim());

        button6 = new JButton();
		button6.setBackground(Color.black);
		button6.setForeground(Color.white);  
		button6.setMargin(new Insets(0, 0, 0, 0));
		button6.setFont(new Font("Arial", Font.PLAIN, 10));
		//button6.setText(makine.kartListesi.get(5).getSporcuIsim());

        button7 = new JButton();
		button7.setBackground(Color.black);
		button7.setForeground(Color.white);  
		button7.setMargin(new Insets(0, 0, 0, 0));
		button7.setFont(new Font("Arial", Font.PLAIN, 10));
		//button7.setText(makine.kartListesi.get(6).getSporcuIsim());

        button8 = new JButton();
		button8.setBackground(Color.black);
		button8.setForeground(Color.white);  
		button8.setMargin(new Insets(0, 0, 0, 0));
		button8.setFont(new Font("Arial", Font.PLAIN, 10));
		//button8.setText(makine.kartListesi.get(7).getSporcuIsim());



        head.setLayout(new GridLayout(1,8));
		head.add(button1);
		head.add(button2);
		head.add(button3);
		head.add(button4);
		head.add(button5);
		head.add(button6);
		head.add(button7);
		head.add(button8);





		//Oyun Alani/Skorlarin gosterildigi alan
		JPanel sol = new JPanel();
		sol.setBackground(Color.gray);
		sol.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel orta = new JPanel();
		orta.setBackground(Color.gray);
		orta.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel sag = new JPanel();
		sag.setBackground(Color.gray);
		sag.setBorder(BorderFactory.createLineBorder(Color.black));

		oyunAlaniSol = new JLabel();
		oyunAlaniOrta = new JLabel();
		oyunAlaniSag = new JLabel();

		oyunAlaniSol.setText("");
		oyunAlaniSol.setFont(new Font("Arial", Font.BOLD, 17));
		oyunAlaniSol.setForeground(Color.black);
		oyunAlaniOrta.setText("");
		oyunAlaniOrta.setFont(new Font("Arial", Font.BOLD, 15));
		oyunAlaniOrta.setForeground(Color.black);
		oyunAlaniSag.setText("");
		oyunAlaniSag.setFont(new Font("Arial", Font.BOLD, 17));
		oyunAlaniSag.setForeground(Color.black);
		
		sol.setLayout(new GridBagLayout());
		orta.setLayout(new GridBagLayout());
		sag.setLayout(new GridBagLayout());

		sol.add(oyunAlaniSol);
		yenidenBaslat = new JButton();
		yenidenBaslat.setBackground(Color.black);
		yenidenBaslat.setForeground(Color.white);
		yenidenBaslat.setMargin(new Insets(0, 0, 0, 0));
		yenidenBaslat.setFont(new Font("Arial", Font.PLAIN, 10));
		yenidenBaslat.setText("Yeniden Baslat");
		yenidenBaslat.setPreferredSize(new Dimension(100, 40));
		yenidenBaslat.setVisible(false);
		orta.add(oyunAlaniOrta);
		orta.add(yenidenBaslat);
		sag.add(oyunAlaniSag);

		body.setLayout(new GridLayout(0,3));
		body.add(sol);
		body.add(orta);
		body.add(sag);





		//Oyuncu tuslari
		JButton button9 = new JButton();
		button9.setBackground(Color.black);
		button9.setForeground(Color.white);
		button9.setMargin(new Insets(0, 0, 0, 0));
		button9.setFont(new Font("Arial", Font.PLAIN, 10));
		button9.setText(insan.kartListesi.get(0).getSporcuIsim());
		butonResimKoy(button9);
	    button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	butonaTikla(button9,insan,0,makine);
            }
        });
		
        JButton button10 = new JButton();
		button10.setBackground(Color.black);
		button10.setForeground(Color.white);
		button10.setMargin(new Insets(0, 0, 0, 0));  
		button10.setFont(new Font("Arial", Font.PLAIN, 10));
		button10.setText(insan.kartListesi.get(1).getSporcuIsim());
		butonResimKoy(button10);
		button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	butonaTikla(button10,insan,1,makine);
            }
        });
		
        JButton button11 = new JButton();
		button11.setBackground(Color.black);
		button11.setForeground(Color.white);
		button11.setMargin(new Insets(0, 0, 0, 0));
		button11.setFont(new Font("Arial", Font.PLAIN, 10));
		button11.setText(insan.kartListesi.get(2).getSporcuIsim());
		butonResimKoy(button11);
		button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	butonaTikla(button11,insan,2,makine);
            }
        });
		
        JButton button12 = new JButton();
		button12.setBackground(Color.black);
		button12.setForeground(Color.white);
		button12.setMargin(new Insets(0, 0, 0, 0));
		button12.setFont(new Font("Arial", Font.PLAIN, 10));
		button12.setText(insan.kartListesi.get(3).getSporcuIsim());
		butonResimKoy(button12);
		button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	butonaTikla(button12,insan,3,makine);
            }
        });
		
        JButton button13 = new JButton();
		button13.setBackground(Color.black);
		button13.setForeground(Color.white);
		button13.setMargin(new Insets(0, 0, 0, 0));
		button13.setFont(new Font("Arial", Font.PLAIN, 10));
		button13.setText(insan.kartListesi.get(4).getSporcuIsim());
		butonResimKoy(button13);
		button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	butonaTikla(button13,insan,4,makine);
            }
        });
		
        JButton button14 = new JButton();
		button14.setBackground(Color.black);
		button14.setForeground(Color.white);
		button14.setMargin(new Insets(0, 0, 0, 0));
		button14.setFont(new Font("Arial", Font.PLAIN, 10));
		button14.setText(insan.kartListesi.get(5).getSporcuIsim());
		butonResimKoy(button14);
		button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	butonaTikla(button14,insan,5,makine);
            }
        });
		
        JButton button15 = new JButton();
		button15.setBackground(Color.black);
		button15.setForeground(Color.white);
		button15.setMargin(new Insets(0, 0, 0, 0));
		button15.setFont(new Font("Arial", Font.PLAIN, 10));
		button15.setText(insan.kartListesi.get(6).getSporcuIsim());
		butonResimKoy(button15);
		button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	butonaTikla(button15,insan,6,makine);
            }
        });
		
        JButton button16 = new JButton();
		button16.setBackground(Color.black);
		button16.setForeground(Color.white);
		button16.setMargin(new Insets(0, 0, 0, 0));
		button16.setFont(new Font("Arial", Font.PLAIN, 10));
		button16.setText(insan.kartListesi.get(7).getSporcuIsim());
		butonResimKoy(button16);
		button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	butonaTikla(button16,insan,7,makine);
            }
        });
		
		footer.setLayout(new GridLayout(1,8));
		footer.add(button9);
		footer.add(button10);
		footer.add(button11);
		footer.add(button12);
		footer.add(button13);
		footer.add(button14);
		footer.add(button15);
		footer.add(button16);



        frame.add(head);
        frame.add(body);
        frame.add(footer);
		frame.setLayout(new GridLayout(3,1));

        frame.setSize(850, 800);
		//frame.setLocation(50,50);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
/*
		JButton butoon = new JButton("click");
		butoon.setBounds(130,100,100, 40); 
		frame.add(butoon);
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
*/

	}

	public void butonResimKoy(JButton button){

		if(button.getText().equals("Pirlo")){
			ImageIcon icon = new ImageIcon("img/pirlo.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Inzaghi")){
			ImageIcon icon = new ImageIcon("img/inzaghi.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Gattuso")){
			ImageIcon icon = new ImageIcon("img/gattuso.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Seedorf")){
			ImageIcon icon = new ImageIcon("img/seedorf.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Kaka")){
			ImageIcon icon = new ImageIcon("img/kaka.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Dida")){
			ImageIcon icon = new ImageIcon("img/dida.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Maldini")){
			ImageIcon icon = new ImageIcon("img/maldini.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Cafu")){
			ImageIcon icon = new ImageIcon("img/cafu.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Kerem Tunceri")){
			ImageIcon icon = new ImageIcon("img/keremtunceri.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Mehmet Okur")){
			ImageIcon icon = new ImageIcon("img/mehmetokur.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Hidayet Turkoglu")){
			ImageIcon icon = new ImageIcon("img/hidayetturkoglu.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Ibrahim Kutluay")){
			ImageIcon icon = new ImageIcon("img/ibrahimkutluay.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Semih Erden")){
			ImageIcon icon = new ImageIcon("img/semiherden.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Cedi Osman")){
			ImageIcon icon = new ImageIcon("img/cediosman.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Can Bartu")){
			ImageIcon icon = new ImageIcon("img/canbartu.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}else if(button.getText().equals("Sinan Güler")){
			ImageIcon icon = new ImageIcon("img/sinanguler.jpg");
			Image image = icon.getImage();
			image = getScaledImage(image ,202 ,233);
			icon.setImage(image);
			button.setIcon(icon);
			button.setVerticalTextPosition(SwingConstants.BOTTOM);
			button.setHorizontalTextPosition(SwingConstants.CENTER);
		}

	}

	private Image getScaledImage(Image srcImg, int w, int h){
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	    Graphics2D g2 = resizedImg.createGraphics();
	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();
	    return resizedImg;
	}

	public void butonaTikla(JButton button, Oyuncu insan, int index, Bilgisayar makine){
		
		System.out.println(index);
        try{
        	if(futMubasMu(insan.kartListesi.get(index)).equals("Futbolcu")){
        		Futbolcu f = (Futbolcu)insan.kartListesi.get(index);
        		f.setKartKullanildiMi(true);
        		computerOyna(insan.kartListesi.get(index),makine, f, insan);

        	}
    		if(futMubasMu(insan.kartListesi.get(index)).equals("Basketbolcu")){
        		Basketbolcu b = (Basketbolcu)insan.kartListesi.get(index);
        		b.setKartKullanildiMi(true);
        		computerOyna(insan.kartListesi.get(index),makine, b, insan);
        	}
    	}catch(Exception x){
			System.out.println("Futbolcu mu? Basketbolcu mu?");
			System.out.println(x);

    	}

		button.setEnabled(false);
	}

	public void computerOyna(Sporcu spor, Bilgisayar makine, Sporcu insaninSectigi, Oyuncu insan){
		Random rnd = new Random();
		int tempDeger;
		if(futMubasMu(spor).equals("Futbolcu")){
			while(true){
				tempDeger = rnd.nextInt(4);
				if(tempDeger == 0 && button1.isEnabled())
					break;
				if(tempDeger == 1 && button2.isEnabled())
					break;
				if(tempDeger == 2 && button3.isEnabled())
					break;
				if(tempDeger == 3 && button4.isEnabled())
					break;
			}
			Futbolcu makineninSectigi = (Futbolcu)makine.kartListesi.get(tempDeger);
			if(tempDeger == 0) {
				button1.setText(makineninSectigi.getSporcuIsim());
				butonResimKoy(button1);
				String pozisyon = rasgelePozisyonSec("Futbolcu");
				makineninSectigi.setKartKullanildiMi(true);
				pozisyonuOynat(insaninSectigi, makineninSectigi, pozisyon, insan, makine);
				button1.setEnabled(false);
			}else if(tempDeger == 1){
				button2.setText(makineninSectigi.getSporcuIsim());
				butonResimKoy(button2);
				String pozisyon = rasgelePozisyonSec("Futbolcu");
				makineninSectigi.setKartKullanildiMi(true);
				pozisyonuOynat(insaninSectigi, makineninSectigi, pozisyon, insan, makine);
				button2.setEnabled(false);
			}else if(tempDeger == 2){
				button3.setText(makineninSectigi.getSporcuIsim());
				butonResimKoy(button3);
				String pozisyon = rasgelePozisyonSec("Futbolcu");
				makineninSectigi.setKartKullanildiMi(true);
				pozisyonuOynat(insaninSectigi, makineninSectigi, pozisyon, insan, makine);
				button3.setEnabled(false);
			}else if(tempDeger == 3){
				button4.setText(makineninSectigi.getSporcuIsim());
				butonResimKoy(button4);
				String pozisyon = rasgelePozisyonSec("Futbolcu");
				makineninSectigi.setKartKullanildiMi(true);
				pozisyonuOynat(insaninSectigi, makineninSectigi, pozisyon, insan, makine);
				button4.setEnabled(false);
			}

		}
		if(futMubasMu(spor).equals("Basketbolcu")){
			while(true){
				tempDeger = rnd.nextInt(4)+4;
				if(tempDeger == 4 && button5.isEnabled())
					break;
				if(tempDeger == 5 && button6.isEnabled())
					break;
				if(tempDeger == 6 && button7.isEnabled())
					break;
				if(tempDeger == 7 && button8.isEnabled())
					break;
			}
			Basketbolcu makineninSectigi = (Basketbolcu)makine.kartListesi.get(tempDeger);
			if(tempDeger == 4) {
				button5.setText(makineninSectigi.getSporcuIsim());
				butonResimKoy(button5);
				String pozisyon = rasgelePozisyonSec("Basketbolcu");
				makineninSectigi.setKartKullanildiMi(true);
				pozisyonuOynat(insaninSectigi, makineninSectigi, pozisyon, insan, makine);
				button5.setEnabled(false);
			}else if(tempDeger == 5){
				button6.setText(makineninSectigi.getSporcuIsim());
				butonResimKoy(button6);
				String pozisyon = rasgelePozisyonSec("Basketbolcu");
				makineninSectigi.setKartKullanildiMi(true);
				pozisyonuOynat(insaninSectigi, makineninSectigi, pozisyon, insan, makine);
				button6.setEnabled(false);
			}else if(tempDeger == 6){
				button7.setText(makineninSectigi.getSporcuIsim());
				butonResimKoy(button7);
				String pozisyon = rasgelePozisyonSec("Basketbolcu");
				makineninSectigi.setKartKullanildiMi(true);
				pozisyonuOynat(insaninSectigi, makineninSectigi, pozisyon, insan, makine);
				button7.setEnabled(false);
			}else if(tempDeger == 7){
				button8.setText(makineninSectigi.getSporcuIsim());
				butonResimKoy(button8);
				String pozisyon = rasgelePozisyonSec("Basketbolcu");
				makineninSectigi.setKartKullanildiMi(true);
				pozisyonuOynat(insaninSectigi, makineninSectigi, pozisyon, insan, makine);
				button8.setEnabled(false);
			}
			
		}
	}

	public void pozisyonuOynat(Sporcu insaninSectigi, Sporcu makineninSectigi, String pozisyon, Oyuncu insan, Bilgisayar makine){
		String futBas = futMubasMu(insaninSectigi);
		if(futBas.equals("Futbolcu")){
			Futbolcu insanf = (Futbolcu)insaninSectigi;
			Futbolcu makinef = (Futbolcu)makineninSectigi;

			if(pozisyon.equals("penalti")){

				int i1 = insanf.getPenalti();
				int m1 = makinef.getPenalti();
				oyunAlaniOrta.setText("<html><center>Pozisyon: PENALTI<br/><br/>");
				oyunAlaniSol.setText("<html><center>Penalti: " + i1);
				oyunAlaniSag.setText("<html><center>Penalti: " + m1);
				if(i1 > m1){
					insan.setSkor(insan.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kazandin</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.GREEN);
					oyunAlaniSag.setForeground(Color.RED);
				}else if(i1 < m1){
					makine.setSkor(makine.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kaybettin</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.RED);
					oyunAlaniSag.setForeground(Color.GREEN);
				}else{
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raund Berabere</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.BLACK);
					oyunAlaniSag.setForeground(Color.BLACK);
				}
			}else if(pozisyon.equals("serbestAtis")){

				int i1 = insanf.getSerbestAtis();
				int m1 = makinef.getSerbestAtis();
				oyunAlaniOrta.setText("<html><center>Pozisyon: SERBEST ATIS<br/><br/>");
				oyunAlaniSol.setText("<html><center>Serbest Atis: " + i1);
				oyunAlaniSag.setText("<html><center>Serbest Atis: " + m1);
				if(i1 > m1){
					insan.setSkor(insan.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kazandin</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.GREEN);
					oyunAlaniSag.setForeground(Color.RED);
				}else if(i1 < m1){
					makine.setSkor(makine.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kaybettin</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.RED);
					oyunAlaniSag.setForeground(Color.GREEN);
				}else{
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raund Berabere</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.BLACK);
					oyunAlaniSag.setForeground(Color.BLACK);
				}
			}else if(pozisyon.equals("kaleciKarsiKarsiya")){

				int i1 = insanf.getKaleciKarsiKarsiya();
				int m1 = makinef.getKaleciKarsiKarsiya();
				oyunAlaniOrta.setText("<html><center>Pozisyon: KALECI KARSI KARSIYA<br/><br/>");
				oyunAlaniSol.setText("<html><center>Kaleci Karsi Karsiya: " + i1);
				oyunAlaniSag.setText("<html><center>Kaleci Karsi Karsiya: " + m1);
				if(i1 > m1){
					insan.setSkor(insan.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kazandin</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.GREEN);
					oyunAlaniSag.setForeground(Color.RED);
				}else if(i1 < m1){
					makine.setSkor(makine.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kaybettin</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.RED);
					oyunAlaniSag.setForeground(Color.GREEN);
				}else{
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raund Berabere</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.BLACK);
					oyunAlaniSag.setForeground(Color.BLACK);
				}
			}

		}else if(futBas.equals("Basketbolcu")){

			Basketbolcu insanb = (Basketbolcu)insaninSectigi;
			Basketbolcu makineb = (Basketbolcu)makineninSectigi;

			if(pozisyon.equals("ikilik")){

				int i1 = insanb.getIkilik();
				int m1 = makineb.getIkilik();
				oyunAlaniOrta.setText("<html><center>Pozisyon: IKILIK<br/><br/>");
				oyunAlaniSol.setText("<html><center>Ikilik: " + i1);
				oyunAlaniSag.setText("<html><center>Ikilik: " + m1);
				if(i1 > m1){
					insan.setSkor(insan.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kazandin</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.GREEN);
					oyunAlaniSag.setForeground(Color.RED);
				}else if(i1 < m1){
					makine.setSkor(makine.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kaybettin</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.RED);
					oyunAlaniSag.setForeground(Color.GREEN);
				}else{
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raund Berabere</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.BLACK);
					oyunAlaniSag.setForeground(Color.BLACK);
				}
			}else if(pozisyon.equals("ucluk")){

				int i1 = insanb.getUcluk();
				int m1 = makineb.getUcluk();
				oyunAlaniOrta.setText("<html><center>Pozisyon: UCLUK<br/><br/>");
				oyunAlaniSol.setText("<html><center>Ucluk: " + i1);
				oyunAlaniSag.setText("<html><center>Ucluk: " + m1);
				if(i1 > m1){
					insan.setSkor(insan.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kazandin</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.GREEN);
					oyunAlaniSag.setForeground(Color.RED);
				}else if(i1 < m1){
					makine.setSkor(makine.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kaybettin</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.RED);
					oyunAlaniSag.setForeground(Color.GREEN);
				}else{
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raund Berabere</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.BLACK);
					oyunAlaniSag.setForeground(Color.BLACK);
				}
			}else if(pozisyon.equals("serbestAtis")){

				int i1 = insanb.getSerbestAtis();
				int m1 = makineb.getSerbestAtis();
				oyunAlaniOrta.setText("<html><center>Pozisyon: SERBEST ATIS<br/><br/>");
				oyunAlaniSol.setText("<html><center>Serbest Atis: " + i1);
				oyunAlaniSag.setText("<html><center>Serbest Atis: " + m1);
				if(i1 > m1){
					insan.setSkor(insan.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kazandin</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.GREEN);
					oyunAlaniSag.setForeground(Color.RED);
				}else if(i1 < m1){
					makine.setSkor(makine.getSkor() + 1);
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raundu Kaybettin</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.RED);
					oyunAlaniSag.setForeground(Color.GREEN);
				}else{
					oyunAlaniOrta.setText(oyunAlaniOrta.getText() + "Raund Berabere</center></html>");
					oyunAlaniSol.setText(oyunAlaniSol.getText() + "<br/><br/>" + insan.getSkor() + "</center></html>");
					oyunAlaniSag.setText(oyunAlaniSag.getText() + "<br/><br/>" + makine.getSkor() + "</center></html>");
					oyunAlaniSol.setForeground(Color.BLACK);
					oyunAlaniSag.setForeground(Color.BLACK);
				}
			}

		}

		
		if(oyunBittiMi(insan, makine)){
			if(insan.skorGoster() > makine.skorGoster()){
				oyunAlaniOrta.setText("<html>Oyun Bitti<br/><br/>Kazandın!<br/><br/><center>" + insan.skorGoster() + " - " + makine.skorGoster() + "</center></html>");
				oyunAlaniOrta.setForeground(Color.GREEN);
			}else if(insan.skorGoster() < makine.skorGoster()){
				oyunAlaniOrta.setText("<html>Oyun Bitti<br/><br/>Kaybettin!<br/><br/><center>" + insan.skorGoster() + " - " + makine.skorGoster() + "</center></html>");
				oyunAlaniOrta.setForeground(Color.RED);
			}else{
				oyunAlaniOrta.setText("<html>Oyun Bitti<br/><br/>Berabere!<br/><br/><center>" + insan.skorGoster() + " - " + makine.skorGoster() + "</center></html>");
			}
			//yenidenBaslat.setVisible(true);
			yenidenBaslat.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	System.exit(0);
	            }
	        });

			System.out.println("Oyun Bitti");
		}

	}

	public boolean oyunBittiMi(Oyuncu insan, Bilgisayar makine){

		for(Sporcu birey: insan.kartListesi){
			if(futMubasMu(birey).equals("Futbolcu")){
				Futbolcu f = (Futbolcu)birey;
				if(!f.getKartKullanildiMi()){
					return false;
				}
			}else if(futMubasMu(birey).equals("Basketbolcu")){
				Basketbolcu b = (Basketbolcu)birey;
				if(!b.getKartKullanildiMi()){
					return false;
				}
			}
		}

		for(Sporcu birey: makine.kartListesi){
			if(futMubasMu(birey).equals("Futbolcu")){
				Futbolcu f = (Futbolcu)birey;
				if(!f.getKartKullanildiMi())
					return false;
			}else if(futMubasMu(birey).equals("Basketbolcu")){
				Basketbolcu b = (Basketbolcu)birey;
				if(!b.getKartKullanildiMi())
					return false;
			}
		}
		
		return true;
	}

	public String rasgelePozisyonSec(String futBas){
		Random rnd = new Random();
		int tempDeger = rnd.nextInt(3)+1;
		if(futBas.equals("Futbolcu")){
			if(tempDeger == 1){
				return "penalti";
			}else if(tempDeger == 2){
				return "serbestAtis";
			}else if(tempDeger == 3){
				return "kaleciKarsiKarsiya";
			}
		}else if(futBas.equals("Basketbolcu")){
			if(tempDeger == 1){
				return "ikilik";
			}else if(tempDeger == 2){
				return "ucluk";
			}else if(tempDeger == 3){
				return "serbestAtis";
			}
		}

		return null;
	}

	public String futMubasMu(Sporcu spor){

		if(spor.getClass().toString().equals("class Futbolcu")){
    		Futbolcu f = (Futbolcu)spor;
    		return "Futbolcu";
    	}
		if(spor.getClass().toString().equals("class Basketbolcu")){
    		Basketbolcu b = (Basketbolcu)spor;
    		return "Basketbolcu";
    	}
    	return null;
	}

}
