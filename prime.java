public class prime {
    public static void main(String args[])
    {
        int n=10;
        boolean h=true;
        if(n==0 && n==1){System.out.println("Not prime");}
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("not prime");
                h=false;
                break;

            }
        }
        if(h==true)
        {
            System.out.println("prime");
        }
    }
}
