class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer,int[]>map = new HashMap<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for(int i = 0;i<arr.length;i++){
            int[] temp = map.get(arr[i]);
            int x = temp[0];
            int y = temp[1];
            rowCount[x]++;
            colCount[y]++;

            if(rowCount[x]==n || colCount[y]==m){
                return i;
            }
        }
        return 0;
    }
}
