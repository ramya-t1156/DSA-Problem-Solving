class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        // sort the items in the group
        // combine them
        int n = nums.length;
        List<int[]> copy = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            copy.add(new int[]{nums[i],i});
        }
        copy.sort(Comparator.comparingInt(a->a[0]));

        int left = 0 , right = 1;
        while(right<n){
            // find group and get their original array indices
            List<Integer> pos = new ArrayList<>();
            pos.add(copy.get(left)[1]);
            while(right<n && Math.abs(copy.get(right)[0]-copy.get(right-1)[0])<=limit){
                pos.add(copy.get(right)[1]);
                right++;
            }
            Collections.sort(pos);
            for(int i = 0;i<right-left;i++){
                nums[pos.get(i)] = copy.get(left+i)[0];
            }
            left = right;
            right++;
        }
        return nums;
    }
}
