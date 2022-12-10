public class sayıAsalMı {
    public static void main(String args[]){
        int number=25;
        boolean asal=true; 
        if(number<2){
            System.out.println("hatali sayı gırdınız lutfen 2 veya 2'den büyük sayı giriniz"); 
        }
 
        for(int i=2; i<number; i++){
            if(number%i==0){
                asal=false;
            }
        } 
        if(asal==true){
            System.out.println("sayı asaldır");
        }
        else{
            System.out.println("sayı asal değil"); 
        }
    } 
 
} 
    

 