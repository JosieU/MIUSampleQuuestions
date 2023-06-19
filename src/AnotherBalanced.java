public class AnotherBalanced {
    static int isAnotherBalanced(int []a){
        int result = 1;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 != 0){
                result = 0;
                return result;
            }
            i++;
            for(int j = 1; j < a.length; j++){
                if(a[j] % 2 ==0){
                    result = 0;
                    return result;
                }
                j++;
                
            }

        }    
        return result;
    }
    public static void main(String [] args){
        System.out.println(isAnotherBalanced(new int[]{2, 3, 6, 7}));
        System.out.println(isAnotherBalanced(new int[]{6, 7, 2, 3, 12}));
        System.out.println(isAnotherBalanced(new int[]{7, 15, 2, 3} ));
        System.out.println(isAnotherBalanced(new int[]{16, 6, 2, 3}));
    }
    
}
// I have to make some changes to make it optimal.
// on this 27 I hav to run this like this {6, 7, 2, 3, 12}
