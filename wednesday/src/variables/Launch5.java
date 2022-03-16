package variables;
class Calculatorss
{
	int a = 30;
	int b = 10;
	int c;
	int d = 20;
	char f = 'F';
	char e = 'T';
	void add()
	{
		c = a+b+d+f+e;
		System.out.println(c);
	}
}
public class Launch5 {

	public static void main(String[] args) {
		// TODO Autos-generated method stub
		Calculatorss C = new Calculatorss();
		C.add();
	}

}
