class Solution {
public:
    int maxArea(vector<int>& height) {
        int left=0;
        
        int right =height.size()-1;
        int maxw=0;
        while(left<=right){
            int width=right-left;
            int aheight=min(height[left],height[right]);
            int current=width*aheight;
             maxw=max(maxw,current);
        
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
        }
        return maxw;
    }
};