class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int missing=-1;
        int duplicate=-1;
        boolean visited[]=new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            if(visited[nums[i]])
            duplicate=nums[i];
            else
             visited[nums[i]]=true;
        }
      

     
       for(int i = 1; i <= n; i++)
    {
    if(!visited[i]) {
        missing = i;
        break;
    }
}
           
        
        return new int[]{duplicate, missing};
    }
}