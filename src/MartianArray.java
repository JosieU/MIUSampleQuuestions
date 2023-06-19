public class MartianArray {
    static int isMartianArray(int []a){
        
        boolean check = false;
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        while(i < a.length){
            /*if(i>= a.length-1){
                break;
            }*/
            for(int j = i+1; j < a.length;j++)
            if(a[i] != a[j]){
                check = true;
                i++;
            }
            else{
                //result = 0;
                return 0;
            }
        }
        if(check = true){
            for(int j = 0; j < a.length; j++){
                if(a[j] == 1){
                    count1++;

                }
                if(a[j] != 1){
                    count2++;
                }
            }
        }
        if(count1 > count2){
            return 1;
        }
        return 0;
    }
    public static void main(String []args){
        System.out.println(isMartianArray(new int []{1, 3} ));
        System.out.println(isMartianArray(new int []{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartianArray(new int []{1, 3, 2}));
        System.out.println(isMartianArray(new int []{1, 3, 2, 2, 1, 5, 1, 5} ));
        System.out.println(isMartianArray(new int []{1, 2, -18, -18, 1, 2} ));
        System.out.println(isMartianArray(new int []{} ));
        System.out.println(isMartianArray(new int []{1} ));
        System.out.println(isMartianArray(new int []{2} ));
    }
    
}
