class countPairsWhoseSumIsLessThanTarget{
        public int countPairs(List<Integer> arr, int target) {
        int left=0;
        int right=arr.size()-1;
        int count=0;
        Collections.sort(arr);
        while(left<right){
            if(arr.get(left)+arr.get(right)<target){
                count+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}