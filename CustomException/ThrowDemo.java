package CustomException;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
			System.out.println(5/0);
			
			}
			catch(ArithmeticException e){
				
				System.out.println("Division by zero is not possible");
			}
			
			System.out.println("Program Ended");
	}

}