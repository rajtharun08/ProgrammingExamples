public class HammingDistance {
    public int hammingWeight(int n) 
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n=n&(n-1);
        }
        return count;
    }
    public int hammingDistance(int x, int y) 
    {
        int res=hammingWeight(x^y);
        return res;
    }
}
