class Solution {
    public boolean checker(char a,char b,char c,char d)
    {
        int black=0;
        int white=0;
        if(a=='B') black++; else white++;
        if(b=='B') black++; else white++;
        if(c=='B') black++; else white++;
        if(d=='B') black++; else white++;        
        return black>=3 || white>=3;
    }
    // 00 01 02
    // 10 11 12
    // 20 21 22
    public boolean canMakeSquare(char[][] grid) {
        if(checker(grid[0][0],grid[0][1],grid[1][0],grid[1][1])) return true;
        if(checker(grid[0][1],grid[0][2],grid[1][1],grid[1][2])) return true;  
        if(checker(grid[1][0],grid[1][1],grid[2][0],grid[2][1])) return true;
        if(checker(grid[1][1],grid[1][2],grid[2][1],grid[2][2])) return true;   
        return false;  
    }

}