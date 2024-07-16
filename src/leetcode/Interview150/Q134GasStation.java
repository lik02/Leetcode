package leetcode.Interview150;

public class Q134GasStation {
    public static void main(String[] args) {
        int[] gas = {2};
        int[] cost = {2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] - cost[i] > 0) {
                int round = 0;
                int index = i;
                tank = gas[i];
                while (round != gas.length && tank > 0) {
                    tank -= cost[index];
                    if (tank < 0) {
                        break;
                    }
                    index++;
                    if (index > gas.length - 1) {
                        index = 0;
                        tank += gas[index];
                    }
                    else {
                        tank += gas[index];
                    }
                    round++;
                }
                if (round == gas.length) {
                    return i;
                }
            }
        }
        return -1;
    }

    // public static int canCompleteCircuit(int[] gas, int[] cost) {
        // int tank = 0;
        // for (int i = 0; i < gas.length; i++) {
        //     int round = 0;
        //     int index = i;
        //     tank = gas[i];
        //     while (round != gas.length && tank > 0) {
        //         tank -= cost[index];
        //         if (tank < 0) {
        //             break;
        //         }
        //         index++;
        //         if (index > gas.length - 1) {
        //             index = 0;
        //             tank += gas[index];
        //         }
        //         else {
        //             tank += gas[index];
        //         }
        //         round++;
        //     }
        //     if (round == gas.length) {
        //         return i;
        //     }
        // }
        // return -1;
    // }
}
