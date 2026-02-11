// Last updated: 2/11/2026, 2:00:13 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;  
        int empty = numBottles;       

       
        while (empty >= numExchange) {
            int newFull = empty / numExchange;      
            totalDrank += newFull;                  
            empty = empty % numExchange + newFull;  
        }

        return totalDrank;
    }
}
