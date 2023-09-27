class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int len = len1 + len2;
        int[] merged = new int[len];

        int i = 0, j = 0, k = 0;

        while(i < len1 && j < len2){
            if(nums1[i] <= nums2[j]){
                merged[k] = nums1[i];
                i++;
            }else{
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < len1){
            merged[k++] = nums1[i++];
        }
        while(j < len2){
            merged[k++] = nums2[j++];
        }

        int mid1 = merged[len / 2];
        if(len % 2 == 0){
            int mid2 = merged[len/2 - 1];
            return (double)(mid1 + mid2) / 2;
        }
        return (double)mid1;
        
    }
}