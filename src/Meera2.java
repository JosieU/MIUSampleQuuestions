public class Meera2 {
   static int isMeera(int []a){
    int count = 0;
    int result = 0;
    for(int i = 0; i < a.length; i++){
        for(int j = 1; j <= a[i]; j++){
            if(a[i] % j == 0){
                count++;
            }
    }
    if(count == 2){
        for(int j = 0 ; i < a.length; i++){
            if(a[i] == 0){
                result = 1;
                return result;
            }
        }
        result = 0;
        return result;
       }
       if( count != 2){
        for(int k = 0; i < a.length; i++){
            if(a[i] == 0){
                result = 0;
                return result;
            }
        }
        result = 1;
        return result;
       }
   }
   return result;
       
}
public static void main(String [] args){
   System.out.println(isMeera(new int[]{7, 6, 0, 10, 1}) );
    System.out.println(isMeera(new int[]{6, 4, 10, 0}) );
    System.out.println(isMeera(new int[]{6, 10, 1}) );
    System.out.println(isMeera(new int[]{11, 10, 1,0}) );
    System.out.println(isMeera(new int[]{17, 10, 1}) );
    System.out.println(isMeera(new int[]{9, 10, 0}) );
    System.out.println(isMeera(new int[]{6, 10, 1}) );
}
}
