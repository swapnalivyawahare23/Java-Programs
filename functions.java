import java.util.*;
public class functions {
    public static void pr1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numer of digit you want=");
        int n=sc.nextInt();
        System.out.println("ENter the numbers=");
        int cntneg=0;
        int cntpov=0;
        int cntzero=0;
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            if(ele<0)
            {
                cntneg++;
            }
            else if(ele>0){cntpov++;}
            else{cntzero++;}

        }
        System.out.println("Negative="+cntneg+"\n Positive="+cntpov+"\n Zero="+cntzero);
       
    }
    public static void pr2()
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=1;
        for(int i=1;i<=n2;i++)
        {
            sum=sum*n1;
        }}
        public static void pr3()
        {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a=0;
        int b=1;
        int i=2;
        int res=0;
                    System.out.print(a+" "+b+" ");
        while(i<n1)
            {
                res=a+b;
                a=b;
                b=res;
                i++;
                            System.out.print(res+" ");
            } 

        
        }
     public static void main(String args[])
    {
       // pr1();
       //pr2();
       pr3();
    }
}
