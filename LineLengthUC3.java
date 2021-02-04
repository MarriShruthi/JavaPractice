public class LineLengthUC3
{
	public static double length(int x1, int x2, int y1, int y2)	
	{
	   double ln=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is : "+ln);
	    return ln; 
	}
	public static void main(String args[])
	{
		double n1=length(2, 5, 1, 5); 
		double n2=length(4, 7, 1, 4);
		if(n1 == n2)
			System.out.println("Both lines are equal");
	 	else if(n1 < n2)
			System.out.println("length of first line is less"); 
		else
			System.out.println("length of first line is greater"); 
	}
}
		