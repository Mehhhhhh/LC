class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if ((m+n)%2 == 0) {
            return (findKth(nums1, nums2, (m+n)/2) + findKth(nums1, nums2, (m+n)/2+1)) / 2.0;
        } else {
            return findKth(nums1, nums2, (m+n)/2+1);
        }
    }
    
    public double findKth(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        if(m > n) { return findKth(nums2, nums1, k);}
        
        int l = -1, r = m ;
        while(l < r) {
            int mid1 = l + (r - l) / 2;
            int mid2 = k - mid1 -2;
            int left1 = mid1 >= 0? nums1[mid1]: Integer.MIN_VALUE;
            int left2 = mid2 >= 0? nums2[mid2]: Integer.MIN_VALUE;
            int right1 = mid1 + 1 < m ? nums1[mid1+1] : Integer.MAX_VALUE;
            int right2= mid2  +1 < n ? nums2[mid2+1] : Integer.MAX_VALUE;
            if (left1 <= right2 && left2 <= right1) {
                return Math.max(left1, left2);
            } else if (left1 > right2) {
                r = mid1;
            } else {l = mid1 + 1;}
        }
        if (r == 0) {return nums2[k-1];}
        if (r == m) {return nums1[k-1];}
        return -1;
    }
    
}