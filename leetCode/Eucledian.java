package Testhere;

import java.util.Scanner;

public class Eucledian {

	static double Cx;
	static double Cy;
	static int[] Px = {1,1,2,2,3,4,5,6};
	static int[] Py = {1,2,1,3,3,5,4,5};
	static int[] cx ={1,1,2};
	static int[] cy ={1,2,1};
	static double[] distances = new double[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter x value of centroid");
		Cx = s.nextDouble();
		System.out.println("Enter y value of centroid");
		Cy = s.nextDouble();
		//calculateDistance(Cx,Cy);
		for (int i = 0; i < Px.length; i++) {
			System.out.println(Px[i]+","+Py[i]+"\t"+distances[i] + "\n");
		}*/
		calculateWss(1.3,1.3);
	}
	private static void calculateWss(double x, double y) {
		// TODO Auto-generated method stub
		double temp =0;
		for (int i = 0; i < cx.length; i++) {
			double xDiff = cx[i] - x;
			double yDiff = cy[i] - y;
			temp += (Math.pow(xDiff, 2)+ Math.pow(yDiff, 2));
			//distances[i] = dist;
		}
		System.out.println("WSS: " + temp);
	}
	private static void calculateDistance(double cx2, double cy2) {
		// TODO Auto-generated method stub
		double dist = 0;
		for (int i = 0; i < Px.length; i++) {
			double xDiff = Px[i] - cx2;
			double yDiff = Py[i] - cy2;
			dist = Math.sqrt(Math.pow(xDiff, 2)+ Math.pow(yDiff, 2));
			distances[i] = dist;
		}
	}

}
