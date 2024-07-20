package leetcode.Interview150;

public class Q134GasStation {
    // public static int canCompleteCircuit(int[] gas, int[] cost) {
    //     int sumOfGas = 0;
    //     int sumOfCost = 0;
    //     for (int i = 0; i < gas.length; i++) {
    //         sumOfGas += gas[i];
    //         sumOfCost += cost[i];
    //     }
    //     if (sumOfGas < sumOfCost) {// if sum(gas) < sum(cost) means it cannot complete the circuit
    //         return -1;
    //     }
    //     for (int i = 0; i < gas.length; i++) {// find starting point
    //         if (gas[i] - cost[i] >= 0) {
    //             int round = 0;
    //             int index = i;
    //             int tank = gas[i];
    //             while (round != gas.length && tank > 0) {// verify that point, tank > 0 is to cater [00000] edge case
    //                 tank -= cost[index];
    //                 if (tank < 0) {
    //                     break;
    //                 }
    //                 index++;
    //                 if (index > gas.length - 1) {
    //                     index = 0;
    //                     tank += gas[index];
    //                 }
    //                 else {
    //                     tank += gas[index];
    //                 }
    //                 round++;
    //             }
    //             if (round == gas.length) {
    //                 return i;
    //             }
    //         }
    //     }
    //     return -1;
    // }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost = 0;
        for (int c : cost) {
            sumCost += c;
        }
        int sumGas = 0;
        for (int g : gas) {
            sumGas += g;
        }
        // Check if it is possible to complete the journey
        if (sumCost > sumGas) {
            return -1;
        }

        int currentGas = 0;
        int startingIndex = 0;

        for (int i = 0; i < gas.length; i++) {// loop all points
            currentGas += gas[i] - cost[i];// we assume the starting point is 0, if the currentGas is always positive. If the currentGas become negative means it is not the starting point.
            if (currentGas < 0) {
                currentGas = 0;// reset 
                startingIndex = i + 1;// assume next point is the starting point
            }
        }
        return startingIndex;
    }
}
/*
 * 2 situations
 * if sum(gas) < sum(cost) means it cannot complete the circuit
 * find starting point
 */
