public class BalancedArray {
    static int isBalanced(int []a){
        int result = 0;
        for(int i = 0 ; i < a.length; i++){
            if(a[i] < 0){
                for(int j = 0; j < a.length; j++){
                    if(a[j]*(-1) == a[i]){
                        result = 1;
                        break;
                    }
                    if(a[j]*(-1) != a[i] && j == a.length-1){
                        result = 0;
                        return result;
                    }
                }
            }
            if(a[i] > 0){
                for(int j = 0; j < a.length; j++){
                    if(a[j] == a[i]*(-1)){
                        result = 1;
                        break;
                    }
                    if(a[j] != a[i]*(-1) && j == a.length-1){
                        result = 0;
                        return result;
                    }
                }
            }
        
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(isBalanced(new int[]{2, 3, -2, -3}));
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2}));
        System.out.println(isBalanced(new int[]{5, 2, 2} ));
    }
    
}
