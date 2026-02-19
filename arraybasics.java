import java.util.*;

public class arraybasics
{
    public static void main(String args[])
    {
        /*
        int a[]={12,2323,34,5,6};
 
       for(int i=0;i<a.length;i++)
        System.out.println(a[i]);

       int[] arr=new int[5];
       for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

       int[] ar=new int[]{12,34,35,65,78,99};
       for(int i=0;i<arr.length;i++)
        System.out.println(ar[i]);
       
        
     
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        System.out.println("Enter the elements in array=");

        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for(int j=0;j<a.length;j++)
        {
            System.out.print(" "+a[j]);
        }

        System.out.println("First element="+a[0]);
        System.out.println("last elemenet="+a[a.length-1]);
        int middle=Math.round(a.length/2);
        if((a.length%2)==0)
        {
            System.out.println(a[middle-1]);
        System.out.println(a[middle]);
        
      }
else{
        System.out.println(a[middle]);
}
//max,min,average,sum,reverse 
int arr[]={12,34,21,2,56,43,67,234,4556,676,1};
int maxele=arr[0];

for(int i=0;i<arr.length;i++)
{
    if(maxele<arr[i])
    {
        maxele=arr[i];
    }
}
System.out.println("max="+maxele);

int minele=arr[0];

for(int i=0;i<arr.length;i++)
{
    if(minele>arr[i])
    {
        minele=arr[i];
    }
}
System.out.println("min="+minele);

int sum=0;
for(int i=0;i<arr.length;i++)
{
    sum+=arr[i];
}
System.out.println("Sum="+sum);
System.out.println("average="+(double)(sum/arr.length));
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");
int l=0;
int r=arr.length-1;
while(l<r)
{
    int temp=arr[l];
    arr[l]=arr[r];
    arr[r]=temp;
    l++;
    r--;
}
System.out.println();
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");
*/
/*Count occurrences of a given element

Count even / odd numbers

Count positive / negative numbers 
Check if array is sorted

Check if all elements are same

Check if array is empty

int a[]={1,1,1,1,1,6};
boolean a1=true;
for(int i=0;i<a.length-1;i++)
{
    if(a[i]!=a[i+1]){
      a1=false;  
      break;}
}
if(a1==true)
{
    System.out.println("all same");
}
else{
    System.out.println("not same");
}*/

int a[]={1,2,23,11,32,12,43,78,90};
int maxele=a[0];
int ele=0;

for(int i=0;i<a.length;i++)
{
    if(maxele<a[i])
    {
        ele=maxele;
        maxele=a[i];
    }
}
System.out.println("second largest"+ele);


    }
}