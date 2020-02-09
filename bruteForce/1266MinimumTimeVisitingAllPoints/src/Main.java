public class Main {

    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int second = 0;
        for (int j = 0; j < points.length - 1; j++) {
            int x=Math.abs(points[j + 1][0] - points[j][0]);
            int y=Math.abs(points[j + 1][1] - points[j][1]);
            second += Math.max(x,y);
        }
        return second;
    }
}
