public class MeeraAnother {
    static int isMeera(int []a){
        int result = 1;
        for(int i = 0; i < a.length; i++){
            if(a[i] > i){
                result = 0;
                return result;
            }
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(isMeera(new int []{-4, 0, 1, 0, 2} ));
        System.out.println(isMeera(new int []{-1, 0, 0, 8, 0}  ));
        System.out.println(isMeera(new int []{-3, 0, 1, 0, 2} ));
        System.out.println(isMeera(new int []{-3, 9, 1, 0, 2} ));
    }
    
}
