public class MinMaxDisjoint {
    static int isMinMaxDisjoint(int []a){
        int max = 0;
        int count = 0;
        boolean check = false;
        if(a.length == 0) return 0;
        int min =a[0];
        for(int i = 0; i < a.length;i++){
            if(i == a.length -1){
                break;
            }
            if(a[i] > max){
                max = a[i];
            }
            if(min > a[i]){
                min = a[i];
            }

    }
    for(int i = 0; i < a.length; i++){
        if(i ==a.length -1){
            break;
        }
        if((a[i] == max && a[i+1] != min) || (a[i] == min && a[i+1] != max)){
            check = true;
            break;

        }
        
    }
    if(check == true){
        for(int i = 0; i < a.length; i++){
            if(a[i] == min || a[i] == max){
                count++;
            }
        }
        if(count != 2){
            return 0;
        }
    }
    else{
        return 0;
    }
    return 1;
    }

    public static void main(String []args){
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2} ));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }
}

