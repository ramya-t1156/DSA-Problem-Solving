class Solution {
    // since this problem uses the relationship between the nodes it is an graph problem
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean>result = new ArrayList<>();
        int[][] dist = new int[numCourses][numCourses];

        // to initialize path as Integer.MAX_VALUE
        for(int i = 0; i < numCourses ; i++){
            Arrays.fill(dist[i] , Integer.MAX_VALUE);
            // since there is no self loop we make the distance b/w node a to a as 0
            dist[i][i] = 0;
        }

        // to compute the distance between nodes
        for(int[] edge : prerequisites){
            dist[edge[0]][edge[1]] = 1;
        }

        // to compute the shortest path using Floyd-Warshall Algorithm
        for(int k = 0;k<numCourses;k++){
            for(int i = 0;i<numCourses;i++){
                for(int j = 0;j<numCourses;j++){
                    if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!=Integer.MAX_VALUE && dist[i][j]>dist[i][k]+dist[k][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    } 
                }
            }
        }

        // for compute the result using dist matrix
        for(int[] edge : queries){
            result.add(dist[edge[0]][edge[1]]<Integer.MAX_VALUE);
        }

        return result;
    }
}
