public class Numbergame {
    public int[] numberGame(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            int t=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=t;
            i+=2;
        }
        return nums;
    }
}
