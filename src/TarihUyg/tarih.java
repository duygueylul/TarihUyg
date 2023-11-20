package TarihUyg;
import java.io.*;

public class tarih {

	public static void main(String[] args) throws IOException {
     String[] aylar = {" ", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
     String[] birler = {" ", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
     String[] onlar = {" ", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmis", "seksen", "doksan"};
     String[] yuzler = {" ", "yuz", "ikiyüz", "üçyüz", "dörtyüz", "beşyüz", "altıyüz", "yediyüz", "sekizyüz", "dokuzyüz"};
     String[] binler = {"", "bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin", "sekizbin", "dokuzbin"};
     String tarih;
     
     
     BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
     tarih = b.readLine();
     
     int ay = new Integer(tarih.substring(3, 5));
     int bir = new Integer(tarih.substring(1, 2));
     int on = new Integer(tarih.substring(0, 1));
     int yilbinler = new Integer(tarih.substring(6, 7));
     int yilyuzler = new Integer(tarih.substring(7, 8));
     int yilonlar = new Integer(tarih.substring(8, 9));
     int yilbirler = new Integer(tarih.substring(9, 10));
     
    
     
     System.out.println(onlar[on] + birler[bir] + " " + aylar[ay] + " " + binler[yilbinler] + yuzler[yilyuzler] + onlar[yilonlar] + birler[yilbirler]);
	}

}
