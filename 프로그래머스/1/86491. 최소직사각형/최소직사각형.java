class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        int width;
        int height;
        
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0]>sizes[i][1]) {
                width = sizes[i][1];
                height = sizes[i][0];
            } else {
                width = sizes[i][0];
                height = sizes[i][1];
            }
            if(width > maxWidth) maxWidth = width;
            if(height > maxHeight) maxHeight = height;
        }
        
        return maxWidth*maxHeight;
    }
}