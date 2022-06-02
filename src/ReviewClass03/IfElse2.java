package ReviewClass03;

public class IfElse2 {

	public static void main(String[] args) {
		// when code executes but does not produce expected results we call these mistakes logical errors
		//when code does not even executes we call these mistakes syntax errors
		
		String day="Friday"; //if non primitive type variables we can store null which means nothing
		if(day.equals("Monday")) {
			System.out.println("Weekday");
		} else if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		}
	}

	//if we have to test multiple conditions we go with IF ELSE IF conditions
}
