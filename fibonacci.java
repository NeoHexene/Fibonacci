
import java.util.*;

class fibonacci {
    public static void calcFibo(int n){
        int s=0,p=1;
        System.out.println(s+"");
        for(int i=2; i<=n; i++){
            System.out.println(p+" ");
            int temp=p;
            p=s+p;
            s=temp;
        }
    }
    
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = t.nextInt();

        calcFibo(n);
    }
}
