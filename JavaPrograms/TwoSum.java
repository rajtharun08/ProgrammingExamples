import java.util.HashMap;
import java.util.Arrays;
public class TwoSum {
    public static int[] tsgen(int[] arr,int target)
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            int complement=target-num;
            if(m.containsKey(complement))
            {
                return new int[]{m.get(complement),i};
            }
            m.put(num,i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int[] arr={2,7,11,13};
        int target=9;
        int[] res=tsgen(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
