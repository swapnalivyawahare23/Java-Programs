import java.util.*;

public class javahashmap {
    public static void first()
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0, 10);
        map.put(1,11);
        map.put(2,23);
        if(map.containsKey(2)){System.out.println("Present");}
        if(map.containsValue(10)){ System.out.println("present");}
        System.out.println(map.getOrDefault(2,0));
        for(Integer i:map.keySet())
        {
            System.out.println(i+" "+map.get(i));
        }
    } 
    public static void findfre()
    {
         int arr[]={12,24,34,23,455,67,12,34,24,455};
         HashMap<Integer,Integer> map=new HashMap<>();

         for(int i=0;i<arr.length;i++)
         {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
         int maxval=Integer.MIN_VALUE;
         int minval=Integer.MAX_VALUE;
         int minkey=-1;
         int maxkey=-1;

         for(Map.Entry<Integer,Integer> e:map.entrySet())
            {
                int fre=e.getValue();
                if(fre<minval)
                {
                    minval=fre;
                    minkey=e.getKey();
                   
                }
                if(fre>maxval)
                {
                    maxval=fre;
                    maxkey=e.getValue();
                  
                }
            }
            System.out.println("Min="+minkey+"=>"+minval);
            System.out.println("max="+maxkey+"=>"+maxval);       
    }
    public static void main(String args[])
    {
     first();
     findfre();
    }
}
