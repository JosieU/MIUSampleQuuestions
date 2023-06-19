public class countDigit {
    static int hasNumber(int n, int digit){   
        int checkHasDigit = 0;  
        int count = 0;   
        while(n != 0){
            checkHasDigit = n % 10;
            n = n / 10;
            if(checkHasDigit == digit){
                count++;
            }
        }
        return count;
    }
    public static void main(String []args){
        System.out.println(hasNumber(32121, 1));
        System.out.println(hasNumber(33331, 3));
        System.out.println(hasNumber(32121, 6));
        System.out.println(hasNumber(3, 3));
    }
    
}
