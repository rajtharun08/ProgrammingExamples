public class ShuffleTheArrayProg {
    public int[] shuffle(int[] arr, int n) {
       int len=arr.length;
       int index=0;
       int[] res=new int[2*n];
       for(int i=0;i<n;i++){
            res[index++]=arr[i];
            res[index++]=arr[i+n];
       }
       return res;
    }
  
}
