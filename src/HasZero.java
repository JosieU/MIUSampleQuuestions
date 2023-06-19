public class HasZero {
    static int arrayHasNoZeroes(int []a){
        int result = 1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                result = 0;
                return result;
                
            }
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println(arrayHasNoZeroes(new int []{1,2,3}));
        System.out.println(arrayHasNoZeroes(new int []{1,0,3}));
        System.out.println(arrayHasNoZeroes(new int []{1,2,3,0}));
        System.out.println(arrayHasNoZeroes(new int []{}));
    }
}
