public class ZeroBalanced {
    static int isZeroBalanced(int []a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] < 0){
                    if(a[i] == a[j] * (-1)){
                        sum += a[i];
                    }
                }
                if(a[j] < 0){
                    if(a[j] == a[i] * (-1)){
                        sum+= a[i];
                        break;

                    }
                }
            }
        }
        if(sum == 0){
            return 1;
        }
        return 0;
    }
    public static void main(String [] args){
        System.out.println(isZeroBalanced(new int []{3, 4, -2, -3, -2} ));
    }
    
}
