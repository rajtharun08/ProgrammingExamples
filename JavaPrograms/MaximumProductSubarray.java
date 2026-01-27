class MaximumProductSubarray {
    public int maxProduct(int[] arr) {
        int prefix = 1, suffix = 1;
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                prefix = 1;
                ans = Math.max(ans, 0);
            } else {
                prefix *= arr[i];
                ans = Math.max(ans, prefix);
            }
            
            if (arr[n - 1 - i] == 0) {
                suffix = 1;
                ans = Math.max(ans, 0);
            } else {
                suffix *= arr[n - 1 - i];
                ans = Math.max(ans, suffix);
            }
        }
        return ans;
    }
}
