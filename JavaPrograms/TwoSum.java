class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int complement=target-arr[i];
            if(m.containsKey(complement))
            {
                return new int[] {m.get(complement),i};
            }
            m.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
}