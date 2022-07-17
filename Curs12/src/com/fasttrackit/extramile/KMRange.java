package com.fasttrackit.extramile;

import java.util.ArrayList;
import java.util.List;

public class KMRange {


    public KMRange() {

    }


    public static List<Range> getKmRanges() {
        List<Range> ranges = new ArrayList<>();
        ranges.add(new Range(0, 10000));
        ranges.add(new Range(10001, 50000));
        ranges.add(new Range(50001, 100000));
        ranges.add(new Range(100001, 150000));
        ranges.add(new Range(150001, 200000));
        ranges.add(new Range(200001, 250000));
        ranges.add(new Range(250001, 300000));
        ranges.add(new Range(300001, 500000));
        ranges.add(new Range(500001, 1000000));

        return ranges;
    }
}
