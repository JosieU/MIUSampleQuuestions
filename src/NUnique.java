public class NUnique {
    static int isUnique(int []a, int n){
        int count = 0;
        int unique = 0;
        for(int i = 0 ; i < a.length; i++){
            for(int j = i+1; j < a.length ;j++){
            if (a[i] + a[j] == n ){
                count ++;
            }
            if (count ==1){
            unique = 1;
            }
            else{
                unique = 0;
            }
            
        }
    }
        return unique;
    }
    public static void main(String [] args){
        System.out.println(isUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isUnique(new int[]{7, 3, 3, 2, 4} , 10));
        System.out.println(isUnique(new int[]{7, 3, 3, 2, 4} , 11));
        System.out.println(isUnique(new int[]{7, 3, 3, 2, 4}  , 8));
        System.out.println(isUnique(new int[]{4}  , 4));
        System.out.println(isUnique(new int[]{1,0} , 1));
    }
}

    

