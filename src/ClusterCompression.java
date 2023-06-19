import java.util.Arrays;

public class ClusterCompression {
    static int[] clusterCompose(int []a){
        int [] a1 = new int [a.length];
        int startIndex = 0;
            for(int j = 0; j < a.length; j++){
                if(j == a.length-1){
                    break;
                }
                if(a[j] == a[j+1] && a[j] != a[startIndex]){
                    a1[startIndex] = a[j];
                    startIndex++;

                }

            }
        
        return a1;
        
        }
    public static void main(String []args){
        int [] result = clusterCompose(new int []{-5, -5, -5, -5, -5});
        System.out.println(Arrays.toString(result));
    }    
    }

    

