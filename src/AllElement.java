public class AllElement {
    // to check if all element of array are even numbers
    static int allEven (int a[ ]){
    int result = 1;
    for(int i = 0; i < a.length;i++){
        if(a[i] % 2 != 0){
            result = 0;
            return result;
        }
    }
   
    return result;
    }
public static void main(String [] args){
   System.out.println( allEven(new int []{2, 4, 5, 8}));
   System.out.println( allEven(new int []{2, 4, 5, 9}));
   System.out.println( allEven(new int []{2, 4, 6, 8}));
    }
    
}
