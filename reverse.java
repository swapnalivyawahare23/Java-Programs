public class reverse {
    public static int rev(int x)
    {
        int rev=0;
        
        while(x!=0)
        {
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        return rev;
    }
    public static void rever(int[] arr,int s,int e)
    {
        if(s>=e)
        {
            return;
        }
        swap(arr,s,e);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int s,int e)
    {
        while(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
   
    
    public static void main(String args[])
    {
        System.out.println(rev(-120));
        int arr[]={12,3,4,6,3,45};
        rever(arr, 0, arr.length-1);
    }
}
