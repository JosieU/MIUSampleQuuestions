public class DaphneAnother {
    static int isDaphneAnother(int []a){
        int count1 = 0;
        int count2 = 0;
        boolean check = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                count1++;
            }
            if(a[i] % 2 != 0){
                check = true;
                break; 
            }
        }
        if(check == true){
            for(int i = a.length -1; i >= 0; i--){
                if(a[i] % 2 == 0){
                    count2++;
                }
                else{
                    break;
                }
            }
        }
        else{
            return 0;
        }
        if(count1 == count2 ){
            return 1;
        }
        return 0;
    }
    public static void main(String []args){
        System.out.println(isDaphneAnother(new int []{4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12}));
        System.out.println(isDaphneAnother(new int []{4, 8, 6, 5, 12, 12, 6}));
    }
    
}
