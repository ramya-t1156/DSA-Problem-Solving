class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int>triangle(1,1);

        long long prev = 1;
        long long next = 0;
        for(int i = 1;i<=rowIndex;i++){
            next = prev*(rowIndex-i+1)/i;
            triangle.push_back(next);
            prev = next;
        }
        return triangle;
    }
};

