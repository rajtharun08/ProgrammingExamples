public class FirstPalindromicStringInArray {
    public boolean isPal(String s)
    {
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i) !=s.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String word : words)
        {
            if(isPal(word))
            {
                return word;
            }
        }
        return "";
    }
}
