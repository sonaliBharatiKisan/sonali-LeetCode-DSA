class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet <Integer> st =new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        int index=0;
        for(int it:st){
            nums[index]=it;
            index++;
        }
        return index;
    }
}