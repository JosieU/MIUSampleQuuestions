public class Travlent2 {
    //int startIndex = 0;
    static int isTrivalent1(int []a){
        int [] b = new int[a.length];
        int index = 0;
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < b.length;j++){
                if(a[i] != b[j] && j== i){
                    b[index] = a[i];
                    index++;
                }
                if(a[i] == 0 && j == i){
                    b[index] = a[i];
                    index++;
                }
                if(a[i] == b[j]){
                    break;
                }
            }
        }
         if(index == 3){
            return 1;
         }
         return 0;
        }
    
    public static void main(String [] args){
        System.out.println(isTrivalent1(new int []{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent1(new int []{}));
        System.out.println(isTrivalent1(new int []{ 2147483647, -1, -1, -2147483648}));
    } 
}
