package ilkProjem;
import  java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        int dtarih;
        Scanner inp =new Scanner(System.in);
        System.out.print("Doğum Tarihiniz: ");
        dtarih = inp.nextInt();
        String burc = "";


        if (dtarih%12 == 0 ){
            burc = "Maymun";
        } else if (dtarih%12 == 1) {
            burc = "Horoz";
        } else {
            burc = "Diğer";
        }

        System.out.print(burc);
    }
}
