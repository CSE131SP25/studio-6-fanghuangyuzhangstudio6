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
		if (n==1) {
			return 0.5;
		}
		else if (n==0) {
			return 0;
		}
		else {
		double sum = (1/(Math.pow(2, n))) + geometricSum(n-1);
		return sum;
		}
			
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
		if (radius <= radiusMinimumDrawingThreshold) {
			return;
		}
		else {
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter+radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter-radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter+radius, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter-radius, radius/3, radiusMinimumDrawingThreshold);
		}
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 * 
	 * 
	 * 
	 * public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];
		if (array.length > 0) {
			int lastIndex = array.length - 1;
			for (int index = 0; index <= array.length / 2; ++index) {
				int mirrorIndex = lastIndex - index;
				// note:
				// since we read from array and write to reversed
				// we do not need to use a temp variable
				reversed[index] = array[mirrorIndex];
				reversed[mirrorIndex] = array[index];
			}
		}
		return reversed;
	}
	 */
	public static int[] toReversedHelper(int[] array) {
		
	}
	public static int[] toReversed(int[] array) {
		
		
		
			return new int[0];
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
//	public static int gcd(int p, int q) {
//		while (q != 0) {
//			int temp = q;
//			q = p % q;
//			p = temp;
//		}
//		return p;
	
	public static int gcd(int p, int q) {
		if (q==0 || p ==0) {
			return 0;
		}
		else if ( q==1 || p ==1) {
			return 1;
		}
		else if (p%q==0) {
			return q;			
		}
		else {
			int greatestCD = gcd(q, p%q);
			return greatestCD;
		}
	}


}
