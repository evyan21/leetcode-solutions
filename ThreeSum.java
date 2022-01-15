class ThreeSum {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        
        List<List<Integer>> res = new LinkedList<>();
        
        for (int i = 0; i < num.length - 2 && num[i] <= 0; i++) {
            
            // second condition to avoid duplicates
            if (i == 0 || num[i] != num[i - 1]) {
                int lo = i + 1, hi = num.length - 1, sum = -num[i];
                
                
                while (lo < hi) {
                    // triplet found
                    if (num[lo] + num[hi] == sum) {
                        // add triplet
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        
                        // avoid duplicates
                        while (lo < hi && num[lo] == num[lo + 1]) lo++;
                        while (lo < hi && num[hi] == num[hi - 1]) hi--;
                        
                        lo++;
                        hi--;
                        
                    }
                    else if (num[lo] + num[hi] > sum) {
                        hi--;
                    }
                    else {
                        lo++;
                    }
                }
            }
        }
        
        
        return res;
        
    }
}
