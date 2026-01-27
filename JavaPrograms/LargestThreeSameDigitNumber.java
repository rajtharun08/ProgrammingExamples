class LargestThreeSameDigitNumber {
    public String largestGoodInteger(String nums) 
    {
        String max="";
        int n=nums.length();
        for(int i=0;i<n-2;i++)
        {
            char c=nums.charAt(i);
            if(c==nums.charAt(i+1) && c==nums.charAt(i+2))
            {
                String threeDigit=nums.substring(i,i+3);
                if(max.isEmpty() || threeDigit.compareTo(max)>0)
                {
                    max=threeDigit;
                }
            }
        }
        return max;
    }
}
