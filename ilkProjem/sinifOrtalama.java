package ilkProjem;
import java.util.Scanner;
public class sinifOrtalama {
    public static void main(String[] args) {


    //ders veri tiplerini tanımladık.
    double mat, fiz, kimya, turkce, tarih, müzik;
    // input sınıfı aracılığıyla kullanıcıdan verileri aldık ve ekrana yazdırdık
    Scanner input = new Scanner(System.in);
    System.out.println("Notlarınızı Giriniz:");
    System.out.print("Matematik:");
    mat = input.nextDouble();
    System.out.print("Fizik:");
    fiz = input.nextDouble();
    System.out.print("Kimya:");
    kimya = input.nextDouble();
    System.out.print("Türkçe:");
    turkce = input.nextDouble();
    System.out.print("Tarih:");
    tarih = input.nextDouble();

    double toplam, ort ;     //toplam ve ortalama için veri tiplerini tanımladık.
// ortalama değerini ekrana yazdırdık
    toplam = (mat + fiz + kimya + turkce + tarih);
    ort = toplam/5;
    System.out.println("Ortalama: " + ort);

    // Geçme durumu için koşul oluşturup ekrana yazdırdık.
    boolean sonuc = ort >=60;
    String gecDurum = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";
     System.out.print("Geçme Durumu: " + gecDurum);
}
}

