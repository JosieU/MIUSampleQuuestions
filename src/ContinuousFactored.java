public class ContinuousFactored {
    static int isFactoredContinuous(int n){
        int count = 0;
        int startIndex = 0;
        int product = 1;
        boolean check = true;
        int hold = 0;
        for(int i= 2; i <= n/2; i++){
            product = 1;
            product = product * i;
            for(int j = i+1; j < n; j++){
                product = product * j;
                if(product == n){
                    return 1;
                }
                else if( product > n && i != n){
                    break;
                }
            }
        }
        
        return 0;
    }
    public static void main(String []args){
        System.out.println(isFactoredContinuous(6));
        System.out.println(isFactoredContinuous(60));
        System.out.println(isFactoredContinuous(120));
        System.out.println(isFactoredContinuous(13));
        System.out.println(isFactoredContinuous(121));
    }

        

    
}
