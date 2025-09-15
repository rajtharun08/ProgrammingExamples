import java.util.*;

public class permutation {
    public static void perm(int index,List<List<Integer>> res,List<Integer> currList,int[] arr)
    {
        if(index==arr.length)
        {
            res.add(new ArrayList<>(currList));
            return ;
        }
        currList.add(arr[index]);
        perm(index+1,res,currList,arr);
        currList.remove(currList.size()-1);
        perm(index+1,res,currList,arr);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<Integer> currList=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        perm(0, res, currList, arr);
        System.err.println(res);
    }
}
