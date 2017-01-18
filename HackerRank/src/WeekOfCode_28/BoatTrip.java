package WeekOfCode_28;

import java.util.*;

public class BoatTrip {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        int max_n = 0;
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
            if(p[p_i]>max_n)
                max_n = p[p_i];
        }
        if(max_n<=m*c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        in.close();
    }
}
