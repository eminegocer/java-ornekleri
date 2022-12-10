import java.util.Scanner;


public class negatifMiPozitifMi {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int sayı=scanner.nextInt();

        if(sayı<0){
            System.out.println("negatif sayı girdiniz");

        }
        else if(sayı>0){
            System.out.println("pozitif sayı girdiniz");

        }
        else{
            System.out.println("girdiğiniz sayı sıfırdır");
            
        }
    }
    
}
