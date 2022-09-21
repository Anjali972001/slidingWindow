public class SlidingWindow2 {
   public static void main (String[] args)
   {
       int[] arr={1,2,3,4,5,6,7,8};
       int k=3;
       int n=arr.length;
       System.out.println(slide(k,arr,n));

   }
   public  static int slide(int k,int arr[],int n)
   {
       // we use static so that jvm can easily call static method without
       // creating instance of the class.
       int max_sum=Integer.MIN_VALUE;
       // we actually initialize with the integer minimum value so that we can compare
       // the first element and return the max.
       for(int i=0;i<n-k+1;i++)
       {
           int current_sum=0;
          for(int j=0;j<k;j++)
          {
              current_sum=current_sum+arr[i+j];
          }
          max_sum=Math.max(current_sum,max_sum);

       }
       return max_sum;
   }


}
