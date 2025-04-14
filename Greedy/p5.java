package Greedy;
//FractionalKnapsackMain
import java.util.*;

// Class representing an item
class Item {
    int weight;
    int value;

    // Constructor
    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

// Class for solving fractional knapsack
class FractionalKnapsack {

    // Method to calculate max value
    public static double getMaxValue(Item[] items, int capacity) {
        // Sort by value/weight ratio in descending order
        Arrays.sort(items, (a, b) -> 
            Double.compare((double)b.value / b.weight, (double)a.value / a.weight)
        );

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                // Take full item
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // Take fraction of the item
                totalValue += item.value * ((double) capacity / item.weight);
                break; // Knapsack is full
            }
        }

        return totalValue;
    }
}

// Main class
public class p5 {
    public static void main(String[] args) {
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int capacity = 50;

        double maxValue = FractionalKnapsack.getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
