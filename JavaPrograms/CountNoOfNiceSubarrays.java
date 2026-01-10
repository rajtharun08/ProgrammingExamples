public class CountNoOfNiceSubarrays {
    public int noOfNiceSubarrays(int[] nums,int k){
        int n=nums.length;
        if(k<0) return 0;
        int left=0;
        int sum=0;
        int count=0;
        for(int right=0;right<n;right++){
            sum+=(nums[right])%2;
            while(sum>k){
                if((nums[left++]%2)==1) sum--;
            }
            count+=right-left+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return noOfNiceSubarrays(nums,k)-noOfNiceSubarrays(nums,k-1);
    }

}
