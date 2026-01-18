// 1266. Minimum Time Visiting All Points
// Question Link: https://leetcode.com/problems/minimum-time-visiting-all-points/description/

// Within Time Complexity - Adavnced Solution
public class MinimumTime {

    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i - 1][0]);
            int dy = Math.abs(points[i][1] - points[i - 1][1]);
            time += Math.max(dx, dy);
        }
        return time;
    }
}

// Actual Solution
class ActualSolution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int currX = points[i][0];
            int currY = points[i][1];
            int targetX = points[i + 1][0];
            int targetY = points[i + 1][1];
            ans += Math.max(Math.abs(targetX - currX), Math.abs(targetY - currY));
        }

        return ans;
    }
}
