// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
    int cnt=0;
    int temp=n;
    if(n<100 || n>999){return false;}
    while(n>0)
    {
        int d=n%10;
        cnt+=d*d*d;
        n/=10;
        
    }
    
    if(cnt==temp)
    {
        return true;
    }
    return false;
    }
}