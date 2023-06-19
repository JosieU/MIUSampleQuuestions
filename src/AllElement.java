public class AllElement {
    static int allEven (int a[ ])
{
   
int result = 0;
for (int i=0; i<a.length; i++)
{
if (a[i] % 2 == 0){
result = 1;}
else{
    result =0;
    return 0;
}
// exit loop, found a non-even element
}
return result;
}
public static void main(String [] args){
   System.out.println( allEven(new int []{2,4,5,8}));
}
    
}
