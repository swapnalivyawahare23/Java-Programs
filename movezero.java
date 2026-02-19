public class movezero {
  
    public static void move(int arr[])
    {
       int l=0;
       int r=arr.length-1;
       while(l<=r)
       {
        if(arr[l]==0)
        {
            if(arr[r]==0)
            {
                r--;
            }
            else{
          int temp=arr[l];
          arr[l]=arr[r];
          arr[r]=temp; 
          l++;   
          }
        }
  
      }
      
            System.out.println(arr);
      
       
    }
    public static void main(String[] args) {
         int arr[]={0,1,0,3,12};
        move(arr);
    }
}
