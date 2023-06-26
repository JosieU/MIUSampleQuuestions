import java.util.Arrays;
public class MinDistance {
    static int hasMinDistance(int n){
            int count = 0;
        int previousMinDistance = 0;
        int minDistance = 0;
        count = 0;
        for(int i = 1; i < n ; i++){
            if(n % i == 0){
                for(int j = i+1; j < n; j++){
                    if(n % j == 0){
                        count++;
                        previousMinDistance = j - i;
                        break;
                    }
                }
                if(previousMinDistance > minDistance && count ==1){
                    minDistance = previousMinDistance;
                }
                if(previousMinDistance < minDistance){
                    minDistance = previousMinDistance;
                }
            }
        }
        return minDistance;
    }
    
    public static void main(String []args){
        System.out.println(hasMinDistance(8));
        System.out.println(hasMinDistance(13013));
       
    }
    
}
