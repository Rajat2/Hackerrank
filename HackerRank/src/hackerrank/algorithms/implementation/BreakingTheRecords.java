package hackerrank.algorithms.implementation;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> list = new ArrayList<>(scores.size());
        int max= scores.get(0),min=scores.get(0), maxCount=0, minCount=0;
        for(int score: scores){
            if(score > max){
                maxCount++;
                max = score;
            }
            if(score < min){
                minCount++;
                min = score;
            }
        }
        list.add(maxCount);
        list.add(minCount);
        return list;
    }

    public static void main(String[] args) {
        Integer array[] = {10,5,20,20,4,5,2,25,1};
        System.out.println(breakingRecords(Arrays.asList(array)));
    }
}
