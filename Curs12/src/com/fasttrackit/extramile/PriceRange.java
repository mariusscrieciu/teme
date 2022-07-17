package com.fasttrackit.extramile;

import java.util.ArrayList;
import java.util.List;

public class PriceRange {


    public PriceRange() {
    }


    public static List<Range> getPriceRange(){
        List<Range> priceRanges = new ArrayList<>();
        priceRanges.add(new Range(0,10000));
        priceRanges.add(new Range(10001,50000));
        priceRanges.add(new Range(50001,100000));
        priceRanges.add(new Range(100001,150000));
        priceRanges.add(new Range(150001,200000));
        return priceRanges;
    }
}
