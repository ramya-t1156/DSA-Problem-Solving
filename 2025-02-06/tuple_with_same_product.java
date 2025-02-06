class Solution {
    public int nCr(int n){
        return ((n*(n-1))/2);
    }
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                hm.put(nums[i]*nums[j],hm.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> map : hm.entrySet()){
            count += 8*nCr(map.getValue());
        }
        return count;
    }
}
