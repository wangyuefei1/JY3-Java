package com.neuedu.practice;

public class Point {
	
	public Point()
	{
		
	}
	public Point (int x0,int y0)
	{
		this.x = x0;
		this.y = y0;
	}
	int x;
	int y;
	public int   movePoint (int dx,int dy) 
	{
		
		return 0;
	}
	 public static void main(String[] args)
	 {
		 Point point1 = new Point(2,0);
		 int point2 = point1.movePoint(1,0);
		 System.out.print(point2);
	 }
}
