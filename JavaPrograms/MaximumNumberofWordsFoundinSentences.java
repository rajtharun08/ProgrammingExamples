public class MaximumNumberofWordsFoundinSentences {
        public int mostWordsFound(String[] sentences) 
    {
        int len=0;
        int maxLen=0;
        for(String s:sentences)
        {
            String[] words=s.split(" ");
            len=words.length;
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}
