public class AllPosssibilities {
    static int isPossible(int []a){
        int result = 0;
        int n = 0;
        if(a.length == 0)return 0;
        while(n < a.length){
            for(int i = 0; i < a.length; i++){
                if(n == a[i]){
                    result = 1;
                    break;
                }
                else if(n != a[i] && i == a.length -1){
                    result = 0;
                    return result;
                }
            }
            n++;
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
