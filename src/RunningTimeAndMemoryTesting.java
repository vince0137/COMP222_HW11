import smile.neighbor.KDTree;

/**
 * Class containing the memory and running time testing methods
 * @author Vincent Dragolich, Zachary Wilson
 */
public class RunningTimeAndMemoryTesting {

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
