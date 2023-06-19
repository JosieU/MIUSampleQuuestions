public class RailRoadTie {
  static int isRailRoad(int []a){
    int result = 1;
    int startIndex = a[0];
    int countNonZero = 0;
    int countZero = 0;
    if(startIndex == 0){
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                countNonZero++;
            }
            if(a[i] == 0  && countNonZero != 0){
                if(countNonZero == 2){
                    result =1;
                    countNonZero = 0;
                }
                else{
                    result = 0;
                    return result;
                }
            }

        }
        if(countNonZero != 2){
            result = 0;
        }

    }
    else{
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                countZero++;
            }
            if(a[i] == 0 && countZero != 0){
                if(countZero == 2){
                    result = 1;
                    countZero = 0;
                }
                else{
                    result = 0;
                    return result;
                }
            }
        }
        if(countZero != 2){
            result = 0;
        }           
    }
                  
    return result;
  }
  public static void main(String []args){
    System.out.println(isRailRoad(new int []{1, 2, 0, 3, -18, 0, 2, 2}));
    System.out.println(isRailRoad(new int []{1, 2}));
    System.out.println(isRailRoad(new int []{0, 0, 0, 0}));
    System.out.println(isRailRoad(new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
   // System.out.println(isRailRoad(new int []{1, 2, 0, 3, -18, 0, 2, 2}));
    ///System.out.println(isRailRoad(new int []{1, 2, 0, 3, -18, 0, 2, 2}));
  }
    
}
