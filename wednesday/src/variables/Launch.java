package variables;
class Calculator
{
	int a = 30;
	int b = 10;
	int c;
	void add()
	{
		c = a+b;
		System.out.println(c);
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c = new Calculator();
c.add();
	}

}
