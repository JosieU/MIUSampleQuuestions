public class HasNValues {
   static int isNValues(int []a, int n){
    int count = 0;
    for(int i = 0; i < a.length-1; i++){
        if(a[i] != a[i+1]){
            count++;
        }
    }
    if(count !=n ){
        return 0;
    }
    
    return 1;
   }
   public static void main(String [] args){
    System.out.println(isNValues(new int[]{1, 2, 2, 1} , 2));
    System.out.println(isNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}  , 3));
    System.out.println(isNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10));
    System.out.println(isNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3} , 2));
    System.out.println(isNValues(new int[]{1, 2, 2, 1} , 5));
   }
    
}
