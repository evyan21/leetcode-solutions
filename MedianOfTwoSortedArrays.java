class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] a, int[] b) {
        
        // ensure that a length is <= b length
        if(a.length > b.length) {
            return findMedianSortedArrays(b, a);
        }
        
        int x = a.length, y = b.length;
        int start = 0, end = x;
        
        // binary search
        
        while(start <= end) {
            int partitionX = (start + end) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;
            
            // if nothing on left, set to -infinity
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : a[partitionX - 1];  
            // if nothing on right, set to infinity
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : a[partitionX];
            
            
            // if nothing on left, set to -infinity
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : b[partitionY - 1];
            // if nothing on right, set to infinity
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : b[partitionY];
            
            
            // found
            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                // even solution
                if((x + y) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                }
                // odd solution
                else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            }
            // move towards left in x
            else if(maxLeftX > minRightY) {
                end = partitionX - 1;
            }
            
            // move towards right in x
            else {
                start = partitionX + 1;
            }
            
            
        }
        
        
        // arrays were not sorted
        throw new IllegalArgumentException();
        
        
    }
}
