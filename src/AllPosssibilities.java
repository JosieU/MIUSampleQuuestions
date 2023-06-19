public class AllPosssibilities {
    static int isPossible(int []a){
        int result = 0;
        int n = 0;
        int i = 0;
        if(a.length == 0)return 0;
        for(i = 0; i < a.length; i++){
            n = n + i;
            for(int j = 0; j < a.length; j++){
                if(n == a[j]){
                    n = 0;
                    result = 1;
                    break;
                }
                else if(n != a[j] && j == a.length -1){
                    result = 0;
                    return result;
                }
            
            }
        }
       
        return result;
    }
    public static void main(String []agrs){
        System.out.println(isPossible(new int []{1, 2, 0, 3}));
        System.out.println(isPossible(new int []{3, 2, 1, 0} ));
        System.out.println(isPossible(new int []{1, 2, 4, 3}));
        System.out.println(isPossible(new int []{0, 2, 3}));
        System.out.println(isPossible(new int []{0}));
        System.out.println(isPossible(new int []{}));
    }
    
}
