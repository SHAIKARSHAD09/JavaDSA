package Greedy;

import java.util.*;

public class p2 {

    static class Item {
        int value, weight;
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static double getMaxValue(List<Item> items, int capacity) {
        // Sort by value-to-weight ratio using lambda
        items.sort((a, b) -> Double.compare(
            (double) b.value / b.weight,
            (double) a.value / a.weight
        ));

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity == 0) break;

            if (item.weight <= capacity) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                double fraction = (double) capacity / item.weight;
                totalValue += item.value * fraction;
                capacity = 0;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(60, 10));
        items.add(new Item(100, 20));
        items.add(new Item(120, 30));

        int capacity = 50;

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in knapsack = " + maxValue);
    }
}

