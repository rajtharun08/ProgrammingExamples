public class MaxConsequtiveOnes {
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int count=0;
        int maxCount=0;
        for(int i:nums)
        {
            if(i==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}
