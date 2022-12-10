import java.util.Scanner;


public class faktöriyelHesaplama {
    public static void main(String args []){
      Scanner scanner=new Scanner(System.in);

      System.out.println("faktöriyeli hesaplanmasını istediğiniz sayıyı giriniz");
         int sayı=scanner.nextInt();

         int çarpım=1;
         int i=1;
         while(i<=sayı){
            çarpım=çarpım*i;
            i++;
         }
         System.out.println("girilen sayının faktöriyel değeri: " + çarpım);
    }
    
}
