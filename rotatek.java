public class rotatek {
    public static void rotate(int[] arr,int k)
    {
        int len=arr.length;
        k=k%len;

        reverse(arr,0,len-1);//all array reverse
        reverse(arr,0,k-1);
        reverse(arr,k,len-1);
    }
    public static void reverse(int arr[],int s,int e)
    {
        while(s<e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;}
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int k=2;
        rotate(arr,k);
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
