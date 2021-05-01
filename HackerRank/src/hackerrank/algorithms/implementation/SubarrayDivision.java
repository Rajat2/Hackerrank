package hackerrank.algorithms.implementation;

import java.util.*;

public class SubarrayDivision {

    static int birthday(List<Integer> s, int d, int m) {
        int total=0;
        int array[] = new int[s.size()];
        for(int i=0;i<s.size();i++){
            array[i] = s.get(i);
        }
        for (int i=0;i<=array.length-m;i++){
            if(Arrays.stream(array, i, i+m).sum() == d)
                total++;
        }
        return total;
    }

    public static void main(String[] args) {

    }
}
