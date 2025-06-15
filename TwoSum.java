class Solution {
  public int[] twoSum(int[] nums, int target) {
      int i=0;
      int n=nums.length;
      int j=n-1;
      int ans[]={};
      while(i<j){
          if(nums[i]+nums[j]==target)
       {   ans[0]=i;
          ans[1]=j;
          return ans;}
          if(nums[i]+nums[j]<target)
         { i++;}
          else
       {   j++;}
      }
return ans;
  }
}