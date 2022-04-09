import java.util.TreeSet;
 
public class code4444 {
    
    public static void main(String[] args)
    {
 
        int a[] = {1, 9, 7, 56, 36, 91, 42};
        int n = a.length;
 
        compute(a, n);
        
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
 
    static void compute(int[] a, int n)
    {
        TreeSet<Integer> t = new TreeSet<>();
 
        for (int i = 0; i < n; i++)
            t.add(a[i]);
 
 
        for (int i = 0; i < n; i++) {
            
            int temp;
 
            if (t.higher(a[i]) == null)
                temp = -1;
 
            else
                temp = t.higher(a[i]);

            t.remove(a[i]);
            a[i] = temp;
        }
    }
}