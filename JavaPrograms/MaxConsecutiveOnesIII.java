public class MaxConsecutiveOnesIII {
        public int longestOnes(int[] arr, int k) {
        int left = 0;
        int n = arr.length;
        int zeroCount = 0;
        int right = 0;
        int max = 0;
        while (right < n) {
            if (arr[right] == 0)
                zeroCount++;
            while (zeroCount > k) {
                if (arr[left++] == 0)
                    zeroCount--;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
