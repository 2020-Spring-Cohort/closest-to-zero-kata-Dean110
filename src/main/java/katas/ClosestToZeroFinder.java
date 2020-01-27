package katas;

import java.util.Collections;
import java.util.List;

public class ClosestToZeroFinder {

    public int findClosestToZero(List<Integer> integers) {
        Collections.sort(integers);
        int closestToZero = Integer.MAX_VALUE;
        for (int numberToCompare : integers) {
            if(numberToCompare == Integer.MIN_VALUE){
                continue;
            }
            if (Math.abs(numberToCompare) <= Math.abs(closestToZero)) {
                closestToZero = numberToCompare;
            }
        }
        return closestToZero;
    }

}
