public class recursion {
 
    public static void demo(int i,int n){
      if(i>n)
        return;
  
    demo(i+1, n);
      System.out.println(i);
    }
    public static void sumofn(int i,int n,int sum)
    {
        if(i<1){
        System.out.println(sum);
            return;}
        
        sumofn(i-1, n, sum+i);
       
    }
    public static void fact(int num,int fact1)
    {
        if(num<1)
        {
            System.out.println(fact1);
            return;
        }
        fact(num-1,fact1*num);
    }
    public static void rever(int r,int l,int arr[])
    {
       
    if(l>=r) 
        return;

        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        rever(r-1, l+1, arr);
     
    }
    p
   public static void main(String args[])
   {
   //demo(1,4);
   //mofn(10,10,0);
  // fact(6,1);
  int arr[]={12,13,56,74,23,22};
  rever(arr.length-1,0,arr);
    for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]);
       }
        
   }
}
