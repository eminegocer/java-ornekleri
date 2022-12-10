import java.util.Scanner;

public class sayınınRakamlarıToplamı {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=scanner.nextInt();

        int toplam=0;
        while(sayı!=0){
            toplam=(sayı%10)+toplam;
            sayı=sayı/10;
        }
        System.out.println("basamak toplamı" + toplam);
           

    

    }
}
