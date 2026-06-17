public class FirstAndLastPositionOfElementInSortedArray {
    public int firstOccurenceBinarySearch(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target) {
                ans=mid;
                high=mid-1;
            } else if (arr[mid]>target) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return ans;
    }

    public int lastOccurenceBinarySearch(int[] arr, int target) {
        int low=0,high=arr.length-1,ans=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if (arr[mid]==target) {
                ans=mid;
                low=mid+1;
            } else if (arr[mid]>target) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            firstOccurenceBinarySearch(nums, target),
            lastOccurenceBinarySearch(nums, target)
        };
    }
}
