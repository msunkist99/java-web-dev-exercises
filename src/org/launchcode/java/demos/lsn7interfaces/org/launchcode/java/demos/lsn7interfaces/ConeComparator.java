package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        //return o1.getCost().compareTo(o2.getCost());

        //according to the Comparator interface, compare MUST return an integer value, but the cost fields are double type.
        //To fix this, use an if/else if/else block to evaluate o1.getCost() - o2.getCost().
        // Return a positive integer, negative integer, or 0 depending on the result.
        double result = o1.getCost() - o2.getCost();

        if (result < 0) {
            return -1;
        }
        else if (result > 0) {
            return 1;
        }
        else return 0;
    }
}
