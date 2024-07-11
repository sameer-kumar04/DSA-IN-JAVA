package Sortingalgorithm;

import java.util.*;

public class Enhancedfibonacci {
    public static void main(String[] args) {

        System.out.println(fiboforumla(50));
    }

    static int fiboforumla(int n) {
        // using golden ratio
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
