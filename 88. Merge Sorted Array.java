class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            nums1[i+n]=nums2[j];
            i--;
            j--;
        }
        Arrays.sort(nums1);
    }
}
