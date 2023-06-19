import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class MinDistance {
    static int hasMinDistance(int n){
        int count = 0;
        int startIndex = 0;
        int minDiv = 0;
        int result = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        int [] a = new int [count];
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                a[startIndex] = i;
                startIndex++;
            }
        }
        //Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            if(i == a.length-1){
                break;
            }
            //int previousMin = minDiv;
            minDiv = a[i+1] - a[i];
            if(result <= minDiv && result == 0){
                result = minDiv;               
            }
            if(minDiv < result){
                result = minDiv;
            }
        }
        return result;
         
    }
    public static void main(String []args){
        System.out.println(hasMinDistance(8));
        System.out.println(hasMinDistance(13013));
    }
    
}
