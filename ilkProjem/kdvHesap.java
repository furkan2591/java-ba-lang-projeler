package ilkProjem;
import java.util.Scanner;
public class kdvHesap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double anaPara;
        System.out.print("Ana Para: ");
        anaPara = inp.nextDouble();

// KDV’li ve KDV’siz fiyatları ekrana yazdırdık
        double kdv1, kdvli1, kdvsiz ;
        kdv1 = 0.18;
        kdvli1 = (anaPara + anaPara*kdv1);
        kdvsiz = anaPara;
        System.out.println("KDV’li Fiyat: " +kdvli1);
        System.out.println("KDV’siz Fiyat: " +kdvsiz);


// 1000 lira altında ise KDV’yi %8 olarak ayarladık; 1000 lira üstünde KDV'yi %18 olarak ayarladık.
        double kdvli2, kdv2 ;
        kdv2 = 0.08;
        kdvli2 = (anaPara + anaPara*kdv2);
        boolean fiyat = anaPara >=1000;
        Double sonuc = fiyat ? kdvli1 : kdvli2;
        System.out.println("Koşula Göre KDV’li Fiyat: " + sonuc);

    }
}
