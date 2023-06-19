public class DigitSum {
    static int isDigitSum(int a, int b){
        int sum = 0;
        if(a < 0 || b < 0)return -1;
        String holdStringNumber = String .valueOf(a);
        for(int i = 0; i < holdStringNumber.length(); i++){
            sum = sum + Character.getNumericValue(holdStringNumber.charAt(i));
        }
        if(sum < b){
            return 1;
        }
        return 0;
    }
    public static void main (String []args){
        System.out.println(isDigitSum(32121, 10));
        System.out.println(isDigitSum(32121, 9));
        System.out.println(isDigitSum(13, 6));
        System.out.println(isDigitSum(-13, 6));
    }
    
}
