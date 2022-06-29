package com.fasttrackit.exercices1;

import java.util.Collection;

public interface BasketActions {


    public boolean find(String fruit);
    public boolean remove(String fruit);
    public int position(String fruit);
    public Collection<String> distinct();
    public void add(String fruit);
    public int count();
    public int customCount();

}
