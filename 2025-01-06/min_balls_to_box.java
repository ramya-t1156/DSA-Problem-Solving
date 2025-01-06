class Solution {
    public int[] minOperations(String boxes) {
        int distance = 0;
        int[] arr = new int[boxes.length()];
        for(int i = 0;i<boxes.length();i++){
            distance = 0;
            for(int j = 0;j<boxes.length();j++){
                if(j==i) continue;
                if(boxes.charAt(j)=='1'){
                    distance += Math.abs(i-j);
                }
            }
            arr[i] = distance;
        }
        return arr;
    }
}
