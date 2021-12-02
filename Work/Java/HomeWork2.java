class HomeWork2
{	
	double x1,x2,x3,x4,x5,ans;
	public void values(double a,int b,int c,int d,double e)
	{//percentage
		x1=a;
		x2=b;
		x3=c;
		x4=d;
		x5=e;
		ans=(x1+x2+x3+x4+x5)/100;
		System.out.println(ans);
	}
	public void values(double a,double b,int c,double d,int e)
	{//average
		x1=a;
		x2=b;
		x3=c;
		x4=d;
		x5=e;
		ans=(x1+x2+x3+x4+x5)/5;
		System.out.println(ans);
	}
	public static void main(String args[])
	{
		HomeWork2.values(15,25.5,35,45,55.5);
		HomeWork2.values(15.5,35.5,25,45.5,55);
	}
}
