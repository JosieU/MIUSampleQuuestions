public class FilterArray {
    static int isFilterArray(int []a){
        boolean holdNumberOne = false;
        boolean holdNumberTwo = false; 
        boolean holdNumberThree = false;
        boolean holdNumberFour = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 9){
                holdNumberOne = true;
            }
            if(a[i] == 11){
                holdNumberTwo = true;
            }
            if(a[i] ==  7){
                 holdNumberThree = true;
            }
            if(a[i] == 13){
                holdNumberFour = true;

            }
        }
        if(holdNumberOne == true && holdNumberTwo == true){
            return 1;
        }
        if(holdNumberThree == false && holdNumberFour == true){
            return 1;
        }
        if(holdNumberThree == true && holdNumberFour == false){
            return 1;
        }
        return 0;
    }
    public static void main(String []args){
        System.out.println(isFilterArray(new int []{3, 4, 6, 7, 14, 16}));
        System.out.println(isFilterArray(new int []{1, 2, 3, 9, 6, 11}));
        System.out.println(isFilterArray(new int []{1, 2, 3, 4, 10, 11, 13}));
        System.out.println(isFilterArray(new int []{9, 6, 18} ));
        System.out.println(isFilterArray(new int []{4, 7, 13}  ));
        

    }
    
}
