public class FactorTwoCount {
    static int isFactoredTwoCount(int n){
        int count = 0;
        while(n % 2 == 0){
            count++;
            n = n / 2;
        }
        return count;
    } 
    public static void main(String []args){
        System.out.println(isFactoredTwoCount(48));
        System.out.println(isFactoredTwoCount(21));
    }  
}
