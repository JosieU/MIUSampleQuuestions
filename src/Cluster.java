import java.util.Arrays;

public class Cluster {
    static int[] isCluster(int []a){
          int index = 0;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]!= a[j+1]) {
					index = index + 1;
					a[index] = a[j+1];
					}
				else {
					a[index]= a[j];
				}
			}
			// index indicates the position of the last element
			// hence the length of the cluster compressed array is index + 1
			int[] clusterArray = new int[index + 1];
			for (int i = 0;i<clusterArray.length;i++) {
				clusterArray[i]= a[i];
			}
	  return clusterArray;
	}
    public static void main(String []args){
        int[] result = isCluster(new int []{2, 0, 2, 0, 2, 0, 0});
        System.out.println(Arrays.toString(result));
    }
}
