public class arraybrute {
    public static void insertintoarray(int ar[],int newele,int pos)
    {
        int len=ar.length;
        int newarr[]=new int[len+1];
        for(int i=0;i<newarr.length;i++)
        {
            if(i<pos)
            {
                newarr[i]=ar[i];
               
            }
            else if(i==pos)
            {
                newarr[i]=newele;
            }
            else{
            newarr[i]=ar[i-1];}
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        for(int i=0;i<newarr.length;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
    public static void deletefrom(int arr[],int ele)
    {
           int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
         
            if(arr[i]==ele)
            {
                cnt+=1;
            }
            }
        int newarr[]=new int[arr.length-cnt];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=ele)
            {
              
            
            newarr[j]=arr[i];
            j++;
            }
        }
         System.out.println();
        for(int i=0;i<newarr.length;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
    public static void transferarr(int arr[])
    {
        int newar[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            newar[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(newar[i]+" ");
        }
    }
    public static void countunique(int arr[])
    {  
        for(int i=0;i<arr.length;i++)
        {
             int cnt=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt+=1;
                }
            }
            if(cnt==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
    
    public static void main(String args[])
    {
int ar[]={12,23,23,12,45,78,43,12};
//int pos=1;
//int ele=90;
//int ele2=12;
//deletefrom(ar, ele2);
//insertintoarray(ar, ele, pos);
//transferarr(ar);
countunique(ar);
    }
}
