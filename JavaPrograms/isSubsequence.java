public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int n=t.length();
        int m=s.length();
        while(i<m &&j<n)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i==m;
    }
}
