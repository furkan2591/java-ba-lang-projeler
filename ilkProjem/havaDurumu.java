package ilkProjem;
import  java.util.Scanner;
public class havaDurumu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Değeri: ");
        Double sicaklik = inp.nextDouble();

        if (sicaklik < 5) {
            System.out.print("Kayak yap");
        } else if (sicaklik >= 5 && sicaklik <15 ) {
                System.out.print("Sinemma");
        } else if (sicaklik >= 15 && sicaklik <25){
                System.out.print("Piknik");
        } else { System.out.print("Yüzme");

        }
    }
}

