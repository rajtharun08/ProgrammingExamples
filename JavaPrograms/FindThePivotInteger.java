class FindThePivotInteger {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int res=(int)Math.sqrt(sum);
        if(res*res==sum) return res;
        return -1;
    }
}