public class PointsArray {
    public static void main(String[] args) {
        //A = 5, 10
        //B = 7, 4
        //C = 8, 9
        //x[i] = points[2*i];
        //y[i] = points[2*i + 1]
        int[] points = {5, 10, 7, 4, 8, 9};

        int aX = getX(points, 0);
        int aY = getY(points, 0);

        int cX = getX(points, 2);
        int cY = getY(points, 2);

        System.out.println("aX = " + aX);
        System.out.println("aY = " + aY);

        System.out.println("cX = " + cX);
        System.out.println("cY = " + cY);
    }

    public static int getX(int[] points, int index) {
        return points[2 * index];
    }

    public static int getY(int[] points, int index) {
        return points[2 * index + 1];
    }
}
