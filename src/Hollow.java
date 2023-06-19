public class Hollow {
    static int isHollow(int []a){
		int countLeft = 0;
		int countZero = 0;
		int hold = 0;
		int countRight= 0;
		for(int i = 0; i < a.length;i++){
			if(a[i]!= 0){
				countLeft++;
			}
			if(a[i] == 0){
				hold = i;
				break;
			}
		}
		for(int i = hold; i < a.length;i++){
			if(a[i] == 0){
				countZero++;
			}
			}
			for(int i = a.length-1; i >= 0; i--){
				if(a[i] != 0){
					countRight++;
				}
				else{
					break;
				}
			}
		if(countZero >=3 && countLeft == countRight){
			return 1;
		}
		return 0;	
    }
    public static void main(String [] args){
        System.out.println(isHollow(new int []{1,2,4,0,0,0,3,4,5}));
		System.out.println(isHollow(new int []{1,2,0,0,0,3,0,5}));
		System.out.println(isHollow(new int []{1,2,4,9,0,0,0,3,4,5}));
		System.out.println(isHollow(new int []{1,2,0,0,0,3,4}));
    }
    
}
