import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        int s,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Slow node:");
        s=sc.nextInt();
        System.out.println("Enter the Fast node:");
        f=sc.nextInt();
        s-=1;
        f-=1;
        while(true)
        {
            if((s+1)==(f+1)){
                System.out.println(s+1);
                break;
            }
            s++;
            f+=2;
            s=s%12;
            f=f%12;
        }
    }
}