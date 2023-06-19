public class PrimeProduct {
    static int isPrimeProduct(int n){
        //int count = 0;
        int startIndex = 0;
        int []a = new int [n/2];
        int countProduct = 0;
        for(int i = 1; i < n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
        if(count == 2){
            a[startIndex] =i;
            startIndex++;
        }
    }
    for(int i = 0; i < a.length; i++){
        for(int j = 0; j < a.length; j++){
            if(a[i] * a[j] == n){
                return 1;
            }
    
        }
    }
    return 0;    
    }
    public static void main(String []args){
        System.out.println(isPrimeProduct(16));
    }
}
