import java.util.Scanner;

public class haftanınGünleri {
    public static void main(String args []){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 ile 7 arasında bir sayı girin");
        int number=scanner.nextInt();

        switch(number){
            case 1:
            System.out.println("bugün pazartesidir");
            break;

            case 2:
            System.out.println("bugün salıdır");
            break;

            case 3:
            System.out.println("bugün çarşambadır");
            break;

            case 4:
            System.out.println("bugün perşembedir");
            break;

            case 5:
            System.out.println("bugün cumadır");
            break;

            case 6:
            System.out.println("bugün cumartesidir");
            break;

            case 7:
            System.out.println("bugün haftanın yedinci günü pazardır");
            break;

            default:
            System.out.println("hatalı giriş, lütfen geçerli bir sayı giriniz");


        }
    }

}
