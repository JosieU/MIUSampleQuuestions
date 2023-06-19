
public class PrimeCount {
    public static int primeCount(int start, int end){
        int result = 0;
        int count = 0;

        for (int i = start; i<=end; i++) {
            for(int j = 1; j <= start; j++){
                if(i % j == 0){
                    count++;
                
                }
                
            }
            if(count == 2){
                result++;
                count = 0;

               }               
               start = start +1;
               count = 0;
            }
            return result;
                          

               

            }
        
             
           
        
        
    
    

public static void main(String []args){
    System.out.println(primeCount(1,10));
    System.out.println(primeCount(10,30));
    
    

}
}