public class inversion {
    public static void demo()
    {
       int arr[]={10,10,10};
       int cnt=0;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                cnt++;
            }
        }
       }
       System.out.println(cnt);
    }
    public static void main(String[] args) {
        demo();
    }
}
