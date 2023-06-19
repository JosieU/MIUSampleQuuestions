public class MeeraNumber {
    static int isMeeraNumber(int n){
        int count = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(n % count == 0){
            return 1;
        }
        return 0;
    }
    public static void main(String []args){
        System.out.println(isMeeraNumber(6));
        System.out.println(isMeeraNumber(21));
        System.out.println(isMeeraNumber(30));
    }
    
}
