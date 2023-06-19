public class ClosestFibonacci {
    static int isClosestfibonacci(int n){
        int fibonacci = 0;
        int a = 0;
        int holdprevious = 0;
        int holdcurrent = 1;
        for (int i = 1; i <= n; i++){
            holdprevious = holdcurrent;// 1// 0//1//1//2//3
            holdcurrent = fibonacci;// 0//1//1//2//3//5
            fibonacci = holdprevious + holdcurrent; //1//1//2//3//5//8
            
            if(fibonacci == n){
                a = holdcurrent;
                return holdcurrent;

            }
             
        }
        return holdcurrent;
        
    }
    public static void main(String []args){
        System.out.println(isClosestfibonacci(13));
       System.out.println(isClosestfibonacci(1));
       System.out.println(isClosestfibonacci(5));
       System.out.println(isClosestfibonacci(13));
       System.out.println(isClosestfibonacci(34));
    }
    
}
