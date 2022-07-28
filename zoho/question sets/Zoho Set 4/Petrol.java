public class Petrol {
    public static void main(String[] args)
    {
        int petrolincar=2;
        char petrolbank[]={'A','B','C'};
        int distance[]={1,5,3};
        int petrolcapacity[]={6,4,2};
        System.out.println(remainingpetrol(petrolincar,petrolbank,distance,petrolcapacity));
    }
    static int remainingpetrol(int a,char pb[],int dis[],int pc[])
    {
        for(int i=0;i<pb.length;i++)
        {
            a=a-dis[i];
            if(a<0)
            return -1;
            else
            a=a+pc[i];
        }
        return a;
    }
}
