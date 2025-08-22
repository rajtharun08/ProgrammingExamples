public class KMPalgo {
    public void generatekmp(String pattern,int[] lps)
    {
        int len=0;
        lps[0]=0;
        int i=1;
        while(i<pattern.length())
        {
            if(pattern.charAt(i)==pattern.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                {
                    len=lps[len-1];
                }
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
    public int strStr(String haystack, String needle)
    {
        int n=haystack.length();
        int m = needle.length();
        int[] lps=new int[m];
        generatekmp(needle,lps);
        int i=0;
        int j=0;
        while(i<n)
        {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                    return i-j;
        //            j = lps[j - 1];
                }
            }
            else
            {
                if(j!=0)
                {
                    j=lps[j-1];
                }
                else
                {
                    i++;
                }
            }
        }
            return -1;
    }
  
}
