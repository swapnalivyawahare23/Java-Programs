import java.util.*;
public class arraydetails {
    public static int problem1(int[] arr)
    {
        //Write a java program to find second largest element in an array. If not exist, then return -1.
        int large=arr[0];
        int seclarge=0;
        for(int i=0;i<arr.length;i++)
        {
            if(large<arr[i])
            {
               seclarge=large;
                large=arr[i];
                
            }
            else if(arr[i] > seclarge && arr[i] != large)
        {
            seclarge = arr[i];
        }
    

    if(seclarge == Integer.MIN_VALUE)
        return -1;

        }
        return seclarge;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of the array=");
     int n=sc.nextInt();
     System.out.println("Enter the elemenets=");
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
      arr[i]=sc.nextInt();
     }
       
       System.out.println(problem1(arr));
    }
}
