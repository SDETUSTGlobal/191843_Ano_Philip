public class Multiply
{
	public int multiply(int a,int b)
	{
		return(a*b);
	}
	public int multiply(int a,int b,int c)
	{
		return(a*b*c);
	}
	public double multiply(double a,double b)
	{
		return(a*b);
	}
	public static void main(String args[])
	{
		Multiply m =new Multiply();
		System.out.println(m.multiply(15,16));
		System.out.println(m.multiply(15,16,56));
		System.out.println(m.multiply(35.5,36.2));
	}
}
	