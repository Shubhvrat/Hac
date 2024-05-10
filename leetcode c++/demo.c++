class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        int coordinates = points.size();
 
        sort(points.begin() , points.end());
        int max_area = 0;
        for(int i=1;i<coordinates;i++)
        {
           int diff =  points[i][0] - points[i-1][0];
           max_area = max(max_area , diff);
        }
        return max_area;
       
    }
};