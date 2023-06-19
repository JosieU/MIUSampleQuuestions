public class PorCupine {
   static int isPorcupine(int n){
      int moduleNumber =0;
      int count = 0;
      int outputPrime = 0;
      if(isPrime(n)== 1 && n % 10 == 9){
         for(int i = n+1 ; i < Integer.MAX_VALUE;i++){
            count = 0;
            for(int j = 1; j <= i; j++){
               if( i %  j == 0){
                 count++;
               }
            }
            if(count == 2){
               moduleNumber = i % 10;
               if(moduleNumber == 9){
                  outputPrime = i;
                  return i;
                  
               }
            }

         }
      }
      return outputPrime;   
   
   }
   static int isPrime(int n){
      for(int i = 2; i < n/2; i++){
         if(n % i == 0){
            return 0;
         }
         
      }
      return 1;
   }
   public static void main(String []args){
      System.out.println(isPorcupine(139));
   }
    
}
