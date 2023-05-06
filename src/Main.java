import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut =2.14 , elma =3.67, domates =1.11, muz =0.95, patlıcan =5.00;
        double toplamtutar;
        double kilo, kilo2, kilo3, kilo4, kilo5 ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo armut alındı? : ");
        kilo = inp.nextDouble();

        System.out.print("Kaç kilo elma alındı? : ");
        kilo2 = inp.nextDouble();

        System.out.print("Kaç kilo domates alındı? :");
        kilo3 = inp.nextDouble();

        System.out.print("Kaç kilo muz alındı? :");
        kilo4 = inp.nextDouble();

        System.out.print("Kaç kilo patlıcan alındı? :");
        kilo5 = inp.nextDouble();

        toplamtutar = (kilo*armut) + (kilo2*elma) + (kilo3*domates) + (kilo4*muz) + (kilo5*patlıcan);
        System.out.print("Toplam Tutarınız: "+ toplamtutar);

    }
}