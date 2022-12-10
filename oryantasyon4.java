public class fibonacciHesaplama {
   public static void main(String args []){
    int birinci=1, ikinci=1, sonuç=0;
    System.out.print(birinci + "," + ikinci);
  
     for(int i=1; i<30; i++){
       sonuç=birinci+ikinci;
        System.out.print("," + sonuç);
        birinci=ikinci;
        ikinci=sonuç;
    } 
   }
    
}
