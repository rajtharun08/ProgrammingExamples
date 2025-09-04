public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int i=0,j=0,k=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<Integer> ans=new ArrayList<>();
        while(i<n && j<m)
        {
            if(arr1[i] <arr2[j])
            {
                i++;
            }
            else if(arr1[i] > arr2[j])
            {
                j++;
            }
            else
            {
                ans.add(arr1[i++]);
                j++;
            }
        }
        int[] res=new int[ans.size()];
        for(int a=0;a<ans.size();a++)
        {
            res[a]=ans.get(a);
        }
        return res;
    }
}
