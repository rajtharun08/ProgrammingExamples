class KokoEatingBananas {
    public boolean canEat(int[] arr, int h, int speed) {
        long time = 0;
        for (int i : arr) {
            time += (i + speed - 1) / speed;
        }
        return time <= h;
    }

    public int minEatingSpeed(int[] nums, int h) {
        int low = 1, high = 0;
        for (int i : nums) {
            high = Math.max(high, i);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEat(nums, h, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}