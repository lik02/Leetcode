import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q210CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> node = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            node.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            node.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] inDegree = new int[numCourses];
        for (int i = 0; i < node.size(); i++) {
            for (int j = 0; j < node.get(i).size(); j++) {
                inDegree[node.get(i).get(j)]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();
        while (!queue.isEmpty()) {
            int hold = queue.poll();
            topo.add(hold);
            for (int i = 0; i < node.get(hold).size(); i++) {
                int current = node.get(hold).get(i);
                inDegree[current]--;
                if (inDegree[current] == 0) {
                    queue.add(current);
                }
            }
        }

        int[] res = new int[0];
        if (topo.size() == numCourses) {
            res = new int[numCourses];
            for (int i = 0; i < topo.size(); i++) {
                res[i] = topo.get(i);
            }
        }
        return res;
    }
}
