class Solution {
    public int arrangeCoins(int n)
    {
        int count=0;
        int i=1;
        while(n>=i)
        {
            n-=i;
            i++;
            count++;
        }
        return count;
    }
}
