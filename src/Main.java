import java.util.Random;

/**
 * Main class that runs the testing methods for different numbers of points
 * @author Vincent Dragolich, Zachary Wilson
 */
public class Main {

    /**
     * Main method to run the tests
     */
    public static void main(String[] args) {
        
        int k = 2; // Number of dimensions of the tree. the 'k' in k-dimensional
        int range = 1_000_000_000; // How far away a point can be in each dimension
        int numQueries = 10_000; // The number of operations performed in a test

        for (int numPoints = 2_000; numPoints <= 20_000_000; numPoints *= 10) {

            double[][] points = new double[numPoints][];
            int[] labels = new int[numPoints];
            Random rand = new Random();
            
            for (int i = 0; i < numPoints; i++) {
                points[i] = new double[]{
                        rand.nextInt(range + 1),
                        rand.nextInt(range + 1)
                };
                labels[i] = i;
            }
            
            System.out.println(numPoints + " points: ");
            long runningTimeOrMemory;

//            runningTimeOrMemory = RunningTimeAndMemoryTesting.RunningTimeTestKDTree(points, numPoints, labels, numQueries);
            runningTimeOrMemory = RunningTimeAndMemoryTesting.RunningTimeTestArray(points, numPoints, numQueries);

            
            System.out.println("Uniformly distributed numbers: " + runningTimeOrMemory + " ms/MB");

            int stdDev = 166_666_667; // (range/2)/3, so 99.7% of the numbers are within range. 
            for (int i = 0; i < numPoints; i++) {
                points[i][0] = rand.nextGaussian(range/2, stdDev);
                points[i][1] = rand.nextGaussian(range/2, stdDev);
            }

//            runningTimeOrMemory = RunningTimeAndMemoryTesting.RunningTimeTestKDTree(points, numPoints, labels, numQueries);
            runningTimeOrMemory = RunningTimeAndMemoryTesting.RunningTimeTestArray(points, numPoints, numQueries);
            
            System.out.println("Gaussian distributed numbers: " + runningTimeOrMemory + " ms/MB\n");
        }
    }
}
