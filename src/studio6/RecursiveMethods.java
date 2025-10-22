package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
			double sum = 0;
			if (n > 0) {
				sum = geometricSum(n - 1) + Math.pow(0.5, n);
				return sum;
			}
			else
			return 0;
		
	}

	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		
		// FIXME complete the recursive drawing
		if (radius >= radiusMinimumDrawingThreshold) {
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter + radius, yCenter, radius / 3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter - radius, yCenter, radius / 3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter + radius, radius / 3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter - radius, radius / 3, radiusMinimumDrawingThreshold);
		}
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	 public static void toReversedHelper(int[] array, int[] reversed, int index) {
		int lastIndex = array.length - 1;
		if (index <= lastIndex / 2) {
			int mirrorIndex = lastIndex - index;
			reversed[index] = array[mirrorIndex];
			reversed[mirrorIndex] = array[index];
			toReversedHelper(array, reversed, index + 1);
		}
	}
	 public static int[] toReversed(int[] array) {
			// FIXME create a helper method that can recursively reverse the given array
			int[] reversed = new int[array.length];
			if(array.length == 0) {
				return reversed;
			}
			toReversedHelper(array, reversed, 0);
			return reversed;	
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
			// FIXME compute the gcd of p and q using recursion
			if (p%q == 0) {
				return q;
			}
			else {
				return gcd(q, p%q);
			}
		
	}


}