package com.fasttrackit.extramile;

import java.util.HashMap;
import java.util.Map;

public class Range {



   private int minRange;
   private int maxRange;

    public Range(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }


    public Map<String, Integer> getRange(){
        Map<String, Integer> range = new HashMap<>();
        range.put("min",minRange);
        range.put("max", maxRange);
        return range;
    }

    @Override
    public String toString() {
        return "["+minRange+"-"+maxRange+"]";
    }
}
