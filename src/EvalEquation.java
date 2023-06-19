public class EvalEquation {
    static double isEval(double x, int []a){
        double sum =0;
        for(int i = a.length -1; i >= 0;i--){
            if(a[i] != 0){
                double b = Math.pow(x, i);
                double eval = a[i] * b;
                sum = sum + eval;
            }
            
         }
         return sum;
    }
    public static void main(String[]args){
        System.out.println(isEval(1.0, new int[]{0, 1, 2, 3, 4}));
        System.out.println(isEval(3.0, new int[]{3, 2, 1} ));
        System.out.println(isEval(2.0, new int[]{3, -2, -1}));
        System.out.println(isEval(-3.0, new int[]{3, 2, 1}));
        System.out.println(isEval(2.0, new int[]{4, 0, 9} ));
    }
    
}
