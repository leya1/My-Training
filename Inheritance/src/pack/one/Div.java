package pack.one;

public class Div extends Add {
	
	public void division()
	{
		int sum;
		sum=super.addition();
		if(sum%10==0)
		System.out.println("Divisible by 10");
		else 
			System.out.println("Not divisible by 10");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Div o=new Div();
		o.division();
	}

}
