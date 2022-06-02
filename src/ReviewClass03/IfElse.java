package ReviewClass03;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user="Asghar";
		String password="pass123";
		//whenever we use primitive datatype like byte short int long float double char boolean
		//we use ==
		//whenever using non primitive datatypes - we use .equals method in the IF statement
		//this rule applies to whenever we have comparison
		
		if(user.equals("Asghar") && password.equals("pass123")) {
			System.out.println("Welcome back to Syntax");
		} else {
			System.out.println("username or password is not correct");
			//when debugging make sure the following:
			//you have not disabled the breakpoint
			//you have not enabled the skip all breakpoints option in debug window
		}
}}
