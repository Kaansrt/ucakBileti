import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mesafe başına ücret = 0.10
        double mesafe,tutar=0,indirimliTutar=0;
        int yas,yolculukTipi;
        System.out.print("Gidilecek mesafe : ");
        mesafe = input.nextDouble();
        //System.out.println("Normal tutar : "+tutar);
        System.out.print("Yaşınız : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipi -- 1=> Tek yön 2=> Gidiş Dönüş : ");
        yolculukTipi = input.nextInt();
        tutar = mesafe * 0.10;
        if (yolculukTipi == 1) {
            if (mesafe > 0) {
                if (yas > 0 && yas < 12) {
                    indirimliTutar = tutar - (tutar* 0.5);
                    indirimliTutar = (indirimliTutar - indirimliTutar * 0.2);
                    System.out.println("Toplam Tutar : "+ indirimliTutar);
                } else if (yas >= 12 && yas < 24) {
                    indirimliTutar = tutar - (tutar * 0.1);
                    indirimliTutar = (indirimliTutar - indirimliTutar * 0.2);
                    System.out.println("Toplam Tutar : "+ indirimliTutar);
                } else if (yas > 65) {
                    indirimliTutar = tutar - (tutar * 0.3);
                    indirimliTutar = (indirimliTutar - indirimliTutar * 0.2);
                    System.out.println("Toplam Tutar : "+ indirimliTutar);
                } else {
                    System.out.print("Yaş pozitif bir değer almalıdır!");
                }
                System.out.println("Toplam Tutar : "+ indirimliTutar);
            } else {
                System.out.print("Hatalı veri...");
            }
        } else if (yolculukTipi == 2) {
            if (mesafe > 0) {
                if (yas > 0 && yas < 12) {
                    indirimliTutar = tutar - (tutar * 0.5);
                    indirimliTutar = (indirimliTutar - indirimliTutar * 0.2);
                    System.out.println("Toplam Tutar : "+ indirimliTutar);

                } else if (yas >= 12 && yas < 24) {
                    indirimliTutar = tutar - (tutar * 0.1);
                    indirimliTutar = (indirimliTutar - indirimliTutar * 0.2);
                    System.out.println("Toplam Tutar : "+ indirimliTutar);

                } else if (yas > 65) {
                    indirimliTutar = tutar - (tutar * 0.3);
                    indirimliTutar = (indirimliTutar - indirimliTutar * 0.2);
                    System.out.println("Toplam Tutar : "+ indirimliTutar);

                } else {
                    System.out.print("Yaş pozitif bir değer almalıdır!");
                }


            } else {
                System.out.print("Hatalı veri...");
            }
        } else {
            System.out.println("Hatalı veri...");
        }


    }
}