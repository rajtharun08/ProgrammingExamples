public class SignOfProductOfArray {
    public int arraySign(int[] nums)
    {
        int negative=0;
        int positive=0;
        int zero=0;
        for(int i:nums)
        {
            if(i<0) negative++;
            else if(i>0) positive++;
            else zero++;
        }
        if(zero>0) return 0;
        else if(negative%2!=0 ) return -1;
        else return 1; 
}
}