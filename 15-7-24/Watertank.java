import java.util.*;
class Watertank{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int l = sc.nextInt();
        int water = c,i=1;
        for(;water>0;i++)
        {
            water+=l;
            if(water>c) water=c;
            water-=i;
        }
        System.out.print(--i);
    }
}