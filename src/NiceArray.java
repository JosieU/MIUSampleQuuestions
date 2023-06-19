public class NiceArray {
    static int isNiceArray(int []a){
        int result = 0;
        for(int i = 0; i < a.length;i++){
            for(int j = 0 ; j < a.length; j++){
                if(a[i] == a[j] + 1 || a[i] == a[j]- 1){
                    result = 1;
                    break;
                }
                if(a[i] != a[j] + 1 || a[i] != a[j]- 1 )
                if(j == a.length -1){
                    result = 0;
                    return result;
                }

            }
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(isNiceArray(new int []{2, 10, 9, 3}));
        System.out.println(isNiceArray(new int []{2, 2, 3, 3, 3}));
        System.out.println(isNiceArray(new int []{3, 4, 5, 7} ));
        System.out.println(isNiceArray(new int[] {0,1, -1} ));
    }
    
}
