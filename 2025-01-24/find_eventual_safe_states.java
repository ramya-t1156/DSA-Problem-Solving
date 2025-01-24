class Solution {
    // here visited[i] = 0-> not visited , 1-> visited & not processed , 2-> visited & processed
    public boolean checkSafeNode(int[][] graph,int[] visited,int curr,boolean[] safeNodes){
        // if already visited
        if(visited[curr]==1){
            return safeNodes[curr] = false;
        }
        // if already processed
        if(visited[curr]==2){
            return safeNodes[curr];
        }
        boolean isSafe = true;
        // visited
        visited[curr] = 1;
        for(int neigh : graph[curr]){
            isSafe &= checkSafeNode(graph,visited,neigh,safeNodes);
        }
        visited[curr] = 2; // processed
        return safeNodes[curr] = isSafe;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] visited = new int[graph.length];
        boolean[] safeNodes = new boolean[graph.length];
        for(int i = 0;i<graph.length;i++){
            safeNodes[i] = true;
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<graph.length;i++){
            if(visited[i]==0){
                checkSafeNode(graph,visited,i,safeNodes);
            }
        }

        for(int i = 0;i<graph.length;i++){
            if(safeNodes[i]){
                result.add(i);
            }
        }
        return result;
    }
}
