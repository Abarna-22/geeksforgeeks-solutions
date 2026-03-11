class concatenation {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
            ans[i+n]=nums[i]; 
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int nums[]={1,4,1,2};
        int ans[]=getConcatenation(nums);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}