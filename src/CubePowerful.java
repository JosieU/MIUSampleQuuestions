public class CubePowerful {
    static int isCubePowerful(int n){
        String numbreHolder = String.valueOf(n);
        //int [] newArray = new int[numbreHolder.length()];
        double sum = 0;
        int i = 0;
        while( i < numbreHolder.length()){
            int firstTRial = n % 10;
            n = n / 10;
            Double powDouble = Math.pow(firstTRial, 3);
            sum = sum + powDouble ;
            i++;
        }
        if(sum == Integer.parseInt(numbreHolder)){
            return 1;

        }
        return 0;
    }
    public static void main (String []args){
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(-81));
        System.out.println(isCubePowerful(0));

    }
    
}
