public class Anagram {
    static int isAnagram(char []a, char []b){
        int result = 0;
        if(a.length == 0 && b.length== 0)return 1;
        if(a.length != b.length)return 0;
            for(int i = 0 ; i < a.length; i++){
                for(int j = 0 ; j < b.length;j++){
                    if(a[i] == b[j]){
                        result = 1;
                        break;
                    }
                    if(j== b.length-1 && b[j]!= a[i]){
                        result = 0;
                        return result;
                    }
                }
            }        
        
        return result;
    }
    public static void main (String []args){
        System.out.println(isAnagram(new char[]{'p', 'o', 'l'} , new char[]{'p', 'o', 'o','l'} ));
        System.out.println(isAnagram(new char[]{'s', 'i', 'd'} , new char[]{'i', 'd', 's'} ));
        System.out.println(isAnagram(new char[]{'b', 'i', 'g'} , new char[]{'b', 'i', 'g'} ));
        System.out.println(isAnagram(new char[]{} , new char[]{} ));
    }
    
}
