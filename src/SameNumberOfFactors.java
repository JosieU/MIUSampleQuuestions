public class SameNumberOfFactors {
    static int isSameNumberFactors(int a, int b){
        int count1 =0;
        int count2 =0;
        int result = 1;
        if(a == b) return 1;
        if(a < 0 || b < 0) return -1;
        for(int i = 1; i <= a;i++){
            if(a % i== 0){
                count1++;
            }

        }
        for(int i = 1; i <= b; i++){
            if(b % i == 0){
                count2 ++;
            }
        }
        if(count1 != count2){
            result = 0;
            return result;

        }
        return 1;
    }
    public static void main(String []args){
        System.out.println(isSameNumberFactors(-6, 21));
        System.out.println(isSameNumberFactors(6, 21));
        System.out.println(isSameNumberFactors(8, 12));
        System.out.println(isSameNumberFactors(23, 97));
        System.out.println(isSameNumberFactors(0, 1));
        System.out.println(isSameNumberFactors(0, 0));
        

    }
}