public class slidinWindow1 {
    public static void main(String[] args)
    {
       int arr[]={100,200,300,400};
       int k=2;
       int n=4;
        System.out.println(maxSum(arr,n,k));


    }
    static int maxSum(int[]arr,int n,int k)
    {

        int max_sum=Integer.MAX_VALUE;
        for(int i=0;i<-k+n+1;i++)
        {
            int current_sum=0;
            for(int j=0;j<k;j++)
            {
                current_sum=current_sum+arr[i+j];
                max_sum=Math.max(current_sum,max_sum);
            }

        }
       return max_sum;

    }
}
