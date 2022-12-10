import java.util.Scanner;

public class DaireninCevresı {
    public static void main(String args []){
        final double PI_SAYISI=3.14159;
         Scanner scanner =new Scanner(System.in);

         System.out.println("yarıcap degerı gırınız");
         double yarıcap;
         yarıcap=scanner.nextDouble();

         //cevre hesaplama

         double cevre=2*PI_SAYISI*yarıcap;

         System.out.println(yarıcap +"yarıcaplı dairenin cevresi:"+  cevre);





    }
    
}
