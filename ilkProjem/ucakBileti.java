package ilkProjem;
import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int msf, yas, yolTip;
        Scanner inp = new Scanner(System.in);
        System.out.print("Alınan Yol(km): ");
        msf = inp.nextInt();
        System.out.print("Tarife (Tekyön:1 / GidişDönüş: 2):  ");
        yolTip = inp.nextInt();
        System.out.print("Yaşınız: ");
        yas = inp.nextInt();

        boolean isError = false;
        double ucrt = 0;

        if ((msf > 0) && (yolTip ==1 || yolTip ==2) ) {
            if (yas >=0 && yas < 12) {
                ucrt = msf * 0.1 * 0.5;

                }else if (yas > 12 && yas < 24) {
                    ucrt = msf * 0.1 * 0.9;
                } else if (yas > 65) {
                    ucrt = msf * 0.1 * 0.7;
                } else if (yas < 0) {
                    isError = true;

            } else {
                ucrt = msf*0.1;
            }

            if (yolTip==2) {
                ucrt = msf*0.1*0.8;
            }else {
                ucrt = msf*0.1;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.print("Hatalı Veri Girdiniz !");
        } else {
            System.out.print(ucrt);
        }

    }
}
