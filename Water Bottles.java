class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrink = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalDrink += newBottles;
            emptyBottles = newBottles + (emptyBottles % numExchange);
        }

        return totalDrink;
    }
}
