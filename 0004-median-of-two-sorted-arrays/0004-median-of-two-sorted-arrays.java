class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int len = n + m;
        int[] merged = new int[len];

        int i = 0, j = 0, k = 0;

        while(i < n && j < m){
            if(nums1[i] <= nums2[j]){
                merged[k] = nums1[i++];
            }else{
                merged[k] = nums2[j++];
            }
            k++;
        }
        while(i < n){
            merged[k++] = nums1[i++];
        }
        while(j < m){
            merged[k++] = nums2[j++];
        }
        int mVal = len / 2; 
        int mid1 = merged[mVal];
        if(len % 2 == 0){
            int mid2 = merged[mVal - 1];
            return (double)(mid1 + mid2) / 2;
        } 
        return (double)mid1;
    }
}