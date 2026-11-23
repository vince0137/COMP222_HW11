import java.util.ArrayList;

/**
 * Main class that runs the testing methods for different numbers of points
 * @author Vincent Dragolich, Zachary Wilson
 */
public class Main {

    /**
     * A search algorithm for the ArrayList that finds the nearest neighbor of the given coordinates
     * @param arrayList The ArrayList containing the point
     * @param point The point being operated on
     * @return the point closest to the point given
     */
    private double[] arrayListSearch(ArrayList<double[][]> arrayList, double[] point) {
        return new double[]{-1.0};
    }

    /**
     * Main method to run the tests
     */
    public static void main(String[] args) {
        
        int k = 2; // Number of dimensions of the tree. the 'k' in k-dimensional
        int range = 1_000_000_000; // How far away a point can be in each dimension
        
        for (int numPoints = 10_000; numPoints <= 100_000_000; numPoints *= 10) {

            double[][] points = new double[numPoints][k];
            
            
            
        }
    }
}
