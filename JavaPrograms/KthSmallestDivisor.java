class KthSmallestDivisor {
    public boolean isValid(int[] arr, int t, int n) {
        int sum = 0;
        for (int i : arr) {
            sum += Math.ceil((double) i / n);
        }
        return sum <= t;
    }

    public int smallestDivisor(int[] arr, int t) {
        int low=0;
        int high=0;
        for(int i:arr)
        {
            high=Math.max(high,i);
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isValid(arr,t,mid))
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
