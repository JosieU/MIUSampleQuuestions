public class Mercicial {
    static int isMercicial(int []a){
        int result = 0;
        int hold = 0;
        boolean check1 = false;
        boolean check2 = false;
       for(int i = 0; i < a.length; i++){
        if(a[i] == 1){
            check1 = true;
        }
        if(a[i] == 3){
            hold = i;
            check2 = true;
            break;

        }
       }
       for(int i = hold; i < a.length; i++){
        if(a[i] == 1 && check1 == true && check2 == true){
            result = 0;
            return result;
        }
        if(a[i] != 1 && check1 == true && check2 == true){
            result = 1;
        }
        if(a[i] == 1 && check1 == true && check2 == false){
            result = 1;
        }
        if(a[i] == 3 && check1 == false && check2 == true){
            result = 1;
        }
    }
        
       return result;
    }
    public static void main(String []args){
        System.out.println(isMercicial(new int[]{3, 3, 3, 3, 3, 3} ));
        System.out.println(isMercicial(new int[]{1} ));
        System.out.println(isMercicial(new int[]{8, 2, 1, 1, 18, 3, 5} ));
        System.out.println(isMercicial(new int[]{2, 3, 1, 1, 18} ));
        System.out.println(isMercicial(new int[]{13, 2, 18, 1, 0, 3, -11, 1, 3} ));
        System.out.println(isMercicial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(isMercicial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercicial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        
    }
    
}
