
import java.util.Scanner;


public class BasarıDurumuHesaplama {
    
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        String result;
        double not;

        System.out.println("not giriniz(0-100)");
        not=input.nextDouble();

        result = not>= 50 ?"basarılı": "basarısız" ;
        System.out.println("sonuc:"+ result);
        

    }
    
}
