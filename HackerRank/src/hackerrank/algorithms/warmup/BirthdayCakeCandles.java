package hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallest = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer candle : candles) {
            map.put(candle, map.containsKey(candle) ? map.get(candle) + 1 : 1);
            tallest = tallest > candle ? tallest: candle;
        }
        return map.get(tallest);
    }

    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5,6,5,6,7};
        birthdayCakeCandles(Arrays.asList(array));
    }
}
