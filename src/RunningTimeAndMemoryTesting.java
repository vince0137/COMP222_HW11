import smile.neighbor.KDTree;
import java.util.ArrayList;

/**
 * Class containing the memory and running time testing methods
 * @author Vincent Dragolich, Zachary Wilson
 */
public class RunningTimeAndMemoryTesting {

    /**
     * A search algorithm for the ArrayList that finds the nearest neighbor of the given coordinates
     *
     * NOTE: Code written by ChatGPT with the following prompt:
     * "write a java method that takes an arraylist of 2d points (arraylist of type double[]) and a specific point and 
     * finds the closest point in 2d space"
     *
     * @param points The ArrayList containing the point
     * @param target The point being operated on
     * @return the point closest to the point given
     */
    private double[] arrayListSearch(ArrayList<double[]> points, double[] target) {
        if (points == null || points.isEmpty()) {
            return null;
        }

        double[] closestPoint = null;
        double minDistance = Double.MAX_VALUE;

        for (double[] point : points) {
            double dx = point[0] - target[0];
            double dy = point[1] - target[1];

            // Calculate squared Euclidean distance
            double distance = dx * dx + dy * dy;

            if (distance < minDistance) {
                minDistance = distance;
                closestPoint = point;
            }
        }

        return closestPoint;
    }

    /**
     * Tests the running time to find the nearest neighbor of a point in a K-D Tree using evenly random and Gaussian 
     * clusters of numbers.
     * @param points The array of points in the K-D tree
     * @param range How far away a point can be in each dimension
     * @param k The number of dimensions
     * @return The running time of the operations
     */
    public static long RunningTimeTestKDTree(double[][] points, int range, int k) {
        return -1;
    }

    /**
     * Tests the running time to find the nearest neighbor of a point in an ArrayList using evenly random and Gaussian 
     * clusters of numbers.
     * @param points The array of points in the ArrayList
     * @param range How far away a point can be in each dimension
     * @return The running time of the operations
     */
    public static long RunningTimeTestArray(double[][] points, int range) {
        return -1;
    }

    /**
     * Tests the memory usage required to create a K-D tree with a given number of points within a range.
     * @param points The array of points in the K-D tree
     * @param range How far away a point can be in each dimension
     * @param k The number of dimensions
     * @return The total memory used
     */
    public static long MemoryTestKDTree(double[][] points, int range, int k) {
        return -1;
    }

    /**
     * Tests the memory usage required to create an ArrayList with a given number of points within a range.
     * @param points The array of points in the ArrayList
     * @param range How far away a point can be in each dimension
     * @return The total memory used
     */
    public static long MemoryTestArray(double[][] points, int range) {
        return -1;
    }
    
}
