package java101;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int dogumYili, kalan;
        System.out.println("Doğum Yılınızı giriniz: ");
        dogumYili = inp.nextInt();
        kalan = dogumYili % 12;

        switch (kalan){
            case 0:
                System.out.println("Çin Zodyağı Burcunuz: MAYMUN");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz: HOROZ");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz: KÖPEK");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz: DOMUZ");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz: FARE");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz: ÖKÜZ");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz: KAPLAN");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz: TAVŞAN");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz: EJDERHA");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz: YILAN");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz: AT");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz: KOYUN");
                break;
        }
    }
}
