public class Solution {
    public String convert(String s, int numRows) 
    {
        if(numRows==1 || s.length()<=numRows) 
        {
            return s;
        }
        StringBuilder res = new StringBuilder();
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            rows[i] = new StringBuilder();
        }
        boolean down=false;
        int currRow=0;
        for(char c:s.toCharArray())
        {
            rows[currRow].append(c);
            if(currRow==0 || currRow==numRows-1)
            {
                down=!down;
            }
            currRow+= down? 1:-1;
        }

        for(StringBuilder row:rows)
        {
            res.append(row);
        }
        return res.toString();
    }
} 
