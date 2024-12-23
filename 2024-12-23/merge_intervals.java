class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!temp.isEmpty() && temp.get(temp.size() - 1).get(1) >= start) {
                end = Math.max(end, temp.get(temp.size() - 1).get(1));
                temp.get(temp.size() - 1).set(1, end);
            } else {
                ArrayList<Integer> temp2 = new ArrayList<>();
                temp2.add(start);
                temp2.add(end);
                temp.add(temp2);
            }
        }

        int[][] ans = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++) {
            ans[i][0] = temp.get(i).get(0);
            ans[i][1] = temp.get(i).get(1);
        }
        return ans;
    }
}
