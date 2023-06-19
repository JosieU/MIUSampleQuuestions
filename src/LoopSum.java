public class LoopSum {
    static int loopBackSum(int []a, int n){
        int sum = 0;
        int j = 0;
        int count = 0;
        int i = 0;
        while(j <= n){
            for(i = 0; i < a.length; i++){
                sum =sum + a[i];
                j++;
                count++;
                if(count == n){
                    return sum;
                }
                

            }
    }
    return sum;
    
}
public static void main(String []args){
    System.out.println(loopBackSum(new int[]{1, 2, 3}, 2));
    System.out.println(loopBackSum(new int[]{-1, 2, -1} , 7));
    System.out.println(loopBackSum(new int[]{1, 4, 5, 6}, 4));
    System.out.println(loopBackSum(new int[]{3}, 10));
}
} 
