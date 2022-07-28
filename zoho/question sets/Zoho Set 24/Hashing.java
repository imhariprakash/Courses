import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Hashing {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        Map<Integer,Integer> mp=new HashMap<>();
        int l=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(a[i]))
            mp.put(a[i],mp.get(a[i])+1);
            else
            mp.put(a[i],1);
        }
        if(mp.containsKey(l))
        System.out.println(mp.get(l));
        sc.close();
    }
}
