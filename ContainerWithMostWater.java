class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;
        
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            
            if (height[right] < height[left]) {
                right--;
            }
            else {
                left++;
            }
        }
        
        
        
        return maxArea;
    }
}
