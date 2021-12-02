class Homework1
{
	int x;
	int y;
	int z;
	string name;
	Homework1()
	{
	}
	
	Homework1(int i)
	{
		x=i;
	}
	Homework1(int i , string n)
	{
		x=i;
		name=n;
	}
	Homework1(int i ,int j ,int k , string n)
	{
		x=i;
		y=j;
		z=k;
		name=n;
	}
	//void display()
	
	void addNumbers()
	{
		System.out.println(x+y+z);
	}
	void subtractNumbers()
	{
		System.out.println(x-y-z);
	}
	void multiplyNumbers()
	{
		System.out.println(x*y*z);
	}
	void divideNumbers()
	{
		System.out.println(x/y/z);
	}
    void main(String args[])
	{
		//Homework1 h1=new Homework1();
		//Homework1 h1=new Homework1(50);
		//Homework1 h1=new Homework1(50,25,"Ram");
		Homework1 h1=new Homework1(50,25,5,"Ram");
	}
	
	h1.addNumbers();
	h1.subtractNumbers();
	h1.multiplyNumbers();
	h1.divideNumbers();
	
	
}
