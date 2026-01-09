public class DistributeCandies {
    public int uniqueCount(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int uniqueCandies=uniqueCount(candyType);
        int n=candyType.length;
        return Math.min(uniqueCandies,n/2);
    }
}
