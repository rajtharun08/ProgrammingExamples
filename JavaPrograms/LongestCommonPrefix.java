class Solution {
    public String longestCommonPrefix(String[] strs)
    {
        String first=strs[0]; // flower 
        for(int i=0;i<first.length();i++)
        {
            char c=first.charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[j].charAt(i)!=c)
                {
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}