import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        float pi=3.14F;
        int r; //yarıçap
        double alan,cevre;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        r=girdi.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Dairenin Alanı:"+ alan);
        System.out.println("Dairenin Çevresi:"+ cevre);
    }
}
