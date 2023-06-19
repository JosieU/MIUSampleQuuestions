public class CubePerfect {
    static int isCubePerfect(int []a){
        double isCube = 0;
        int result = 0;
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j <= a[i]; j++){
                isCube = Math.pow(j, 3);
                if(isCube == a[i]){
                    result = 1;
                }
                if(isCube == a[i] && i == a.length -1 ){
                    result = 1;
                    return result;
                }

                if(isCube != a[i] && j == a[i]){
                    result = 0;
                    return result;

                }
            
            }
        }
        return result;

    }
    public static void main(String[]args){
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{163}));
        System.out.println(isCubePerfect(new int[]{-1,0,1}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }
    
}
