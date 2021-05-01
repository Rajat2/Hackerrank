package hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<>(grades.size());
        for(int grade : grades){
            if(grade < 38){
                list.add(grade);
            }else{
                int div = grade/5;
                int nextBig = (div+1)*5;
                if(nextBig - grade < 3){
                    list.add(nextBig);
                }else{
                    list.add(grade);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Integer array[] = {73,67,38,33};
        System.out.println(gradingStudents(Arrays.asList(array)));
    }
}
