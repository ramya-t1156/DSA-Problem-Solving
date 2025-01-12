class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>list = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i =0 ;i<len-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

        for(int j = i+1;j<len-2;j++){
            if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
            int start = j+1;
            int end = len-1;
            while(start<end){
                long sum = nums[i]+nums[j];
                sum += nums[start]+nums[end];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++;
                        end--;
                        while(start<end && nums[start]==nums[start-1]) start++;
                        while(start<end && nums[end]==nums[end+1]) end--;
                    }
                    else if(sum<target){
                        start++;
                    }
                    else{
                        end--;
                    }
                } 
            }
        }
        return list;
    }
}
