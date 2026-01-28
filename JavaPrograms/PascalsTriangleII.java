class PascalsTriangleII {
    public int ncr(int n, int r) {
        long val = 1;
        for (int i = 0; i < r; i++) {
            val *= (n - i);
            val /= (i + 1);
        }
        return (int) val;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            res.add(ncr(rowIndex, i));
        }
        return res;
    }
}