public class hashing {
    public static void main(String args[])
    {
        String a="Swapnali@@@123";

        int hash[];
        hash=new int[256];
        for(int i=0;i<a.length();i++)
        {
            hash[a.charAt(i)]++;
        }
        for(int i=0;i<hash.length;i++)
        {
            if(hash[i]>0)
            {
                System.out.println((char)i+"="+hash[i]);
            }
        }

    }
}
