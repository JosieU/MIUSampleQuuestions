public class Matchs {
    static int isMatches(int a[], int []p){
        int sum = 0;
        int startIndex = 0;
        int holdIndex1 = 0;
        int count = 0;
        int trial = 0;
        for(int i = 0; i < p.length; i++){
            if(p[i] > 0){
                sum = sum + p[i];
            }
            else{
                p[i] = p[i] * (-1);
                sum = sum + p[i];

            }
        }
        if(a.length != sum){
            return 0;
        }
        else{
        
        int j = 0;
            for(j = 0; j < a.length; j++){
                if(a[j] > 0){
                    count++;
                }
                if(a[j] < 0){
                    break;
                }

            }
            if(count == p[trial]){
                trial++;
                count =0;
                int k = 0;
                for(k = j ; k < a.length; k++){
                    if(a[k] < 0){
                        count++;
                }
                if(a[k] > 0){
                    break;

                }

                }
                if(count == p[trial]){
                    trial++;
                    count = 0;
                    int i = 0;
                    for(i = k; i < a.length;i++){
                        if(a[i] > 0){
                            count++;

                    }

                }
                if(count == p[trial]){
                    return 1;
                }
                }
                else{
                    return 0;
                }
            }


        }
        return 0;
    
    }

    public static void main(String [] args){
        System.out.println(isMatches(new int []{1, 2, 3,47,1,1,1, -5, -5,-4 , 2, 3, 18}, new int []{7, -3, 3}));
        System.out.println(isMatches(new int []{1, 2, 3, -5, -5, 2, 3, 18}, new int []{4, -1, 3}));


    }

    
}
