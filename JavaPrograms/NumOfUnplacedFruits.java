class NumOfUnplacedFruits {
    public int numOfUnplacedFruits(int[] fruits, int[] basket) {
        boolean[] used = new boolean[basket.length];
        int count = 0;
        for (int fruit : fruits) {
            boolean placed = false;
            for (int i = 0; i < basket.length; i++) {
                if (!used[i] && basket[i] >= fruit) {
                    used[i] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                count++;
            }
        }
        return count;
    }
}