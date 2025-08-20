public class NumberOfZeroFilledSubarray {
    public long zeroFilledSubarray(int[] nums) 
    {
        long total=0;
        long curr=0;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==0)
            {
                curr++;
                total+=curr;
            }
            else
            {
                curr=0;
            }
        }    
        return total;
    }
}
