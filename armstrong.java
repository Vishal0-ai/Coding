import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a no.");
        int n=sc.nextInt();
        System.err.println(Arm(n));
    }
    public static boolean Arm(int m){
        int l=m;        int i = (int) Math.log10(m) + 1;
        int r=0;
        while(m>0){
           int n=m%10;
            r+=Math.pow(n, i);
            m/=10;
        }
        return r==l;
    }
}
