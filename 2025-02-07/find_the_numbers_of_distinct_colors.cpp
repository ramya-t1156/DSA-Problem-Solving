class Solution {
public:
    vector<int> queryResults(int limit, vector<vector<int>>& queries) {
        unordered_map<int,int>ball_color;
        unordered_map<int,int>color_freq;
        vector<int>res(queries.size());
        for(int i = 0;i<queries.size();i++){
            int ball = queries[i][0];
            int color = queries[i][1];
            // Remove the color if the choosen ball was already painted
            if(ball_color.count(ball)){
                // to Reduce the color frequency
                color_freq[ball_color[ball]]--;
                //if the color frequency is zero than remove the color
                if(color_freq[ball_color[ball]]==0){
                    color_freq.erase(ball_color[ball]);
                }
            }
            // paint the ball with the current color
            ball_color[ball] = color;
            color_freq[color]++;
            res[i] = color_freq.size();
        }
        return res;
    }
};
