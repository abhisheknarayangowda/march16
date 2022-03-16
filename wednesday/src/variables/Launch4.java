package variables;
class Calculators
{
	int a = 30;
	int b = 10;
	int c;
	int d = 20;
	char f = 'F';
	char e = 'T';
	void add()
	{
		c = a+b+d;
		System.out.println(c);
	}
}
public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculators C = new Calculators();
C.add();
	}

}
