import java.util.*;
public class alldivisors {
    public static void main(String[] args) {
        int n=36;
      TreeSet<Integer> ts=new TreeSet<>();
      for(int i=1;i<=Math.sqrt(n);i++)
      {
        if(n%i==0){
        ts.add(i);
        ts.add(n/i);
        }
      }
      for(int y:ts)
      {
        System.out.print(" "+y);
      }
    }
}
