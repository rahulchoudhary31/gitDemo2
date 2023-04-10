package Pack1;

class Car1
{
   public void engine()
	{
		System.out.println("This engine has 200HP");
	}
	public void headlight()
	{
		System.out.println("This is headlight");
	}
	
}
class MarutiCar extends Car1
{
	public void interior()
	{
		System.out.println("This is interior");
	}
}

public class inheritance {

	public static void main(String[] args) {
         
         MarutiCar h= new MarutiCar();
         h.engine();
         h.headlight();
         h.interior();

	}

}
