package com.bridgelabz.day8.UC_LineComparison_OOPS;

import java.util.*;
public class LineComparisonProblem {

	public static void main(String[] args) {
		System.out.println("-------------Welcome to Line Comparison Computation Program-------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Co-ordinates of line 1 (x1,y1): ");
		float x1= scan.nextFloat();
		float y1= scan.nextFloat();
		System.out.print("Enter Second Co-ordinates of line 1 (x2,y2): ");
		float x2= scan.nextFloat();
		float y2= scan.nextFloat();
		System.out.println();
		float a=(float)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of a line "+a);
		System.out.println();
		System.out.print("Enter First Co-ordinates of line 2 (x11,y11): ");
		float x11= scan.nextFloat();
		float y11= scan.nextFloat();
		System.out.print("Enter Second Co-ordinates of line 2 (x22,y22): ");
		float x22= scan.nextFloat();
		float y22= scan.nextFloat();
		System.out.println();
		float b=(float)Math.sqrt((x22-x11)*(x22-x11)+(y22-y11)*(y22-y11));
		System.out.println("Length of a line "+b);
		System.out.println();
		String s1=Float.toString(a);
		String s2=Float.toString(b);
		System.out.println("Equality of two lines using Java equals method is: "+s1.equals(s2));
		
	}

}
