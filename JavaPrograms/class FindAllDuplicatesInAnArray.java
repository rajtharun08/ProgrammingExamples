class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int i:nums){
            if(s.contains(i)){
                res.add(i);
            }
            s.add(i);
        }
        return res;
    }
}