import java.util.*;
public class basic {

    public static void main(String ars[])
    {
       /* Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of rows=");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
       { 
        System.out.println("sum1="+sum);
        System.out.println("i1="+i);    
          sum=sum+i;
            i++;
            System.out.println("sum2="+sum);
        System.out.println("i2="+i);   
         } 
System.out.println("total sum="+sum);
    } 
   for(int i=0;i<4;i++)
   {
    for(int j=0;j<4;j++)
    {
        System.out.print(" * ");
    }
    System.out.println();
   }
 *  *  *  * 
 *  *  *  * 
 *  *  *  * 
 *  *  *  * 


for(int i=0;i<4;i++)
{
    for(int j=0;j<5;j++)
    {
        if(i==0||i==3||j==0||j==4){
            System.out.print("*");
        }
        else {System.out.print(" ");}

    }
    System.out.println();
}
*****
*   *
*   *
*****
for(int i=0;i<4;i++)
{
    for(int j=i;j<4;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}


for(int i=0;i<4;i++)
{
    for(int k=i;k<3;k++)
    {
        System.out.print("0");
    }
    for(int j=0;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}000*
00**
0***
****
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j);
    }
    System.out.println();
}
1
12
123
1234
12345
int n=5;
for(int i=0;i<n;i++)
{
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(j);
      
    }
    
    System.out.println();
}
12345
1234
123
12
1
int num=1;
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
     
        System.out.print(" "+num);
         num++;
     
    }
    
    System.out.println();
} 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        if((i+j)%2==0)
        {
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
    System.out.println();
}1
01
101
0101
10101*/

//butterfly
for(int i=0;i<4;i++)
{
    for(int j=0;j<8;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}

}
}

