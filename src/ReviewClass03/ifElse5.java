package ReviewClass03;

public class ifElse5 {

	public static void main(String[] args) {
		// when multiple if else if conditions result in the same output, we can replace IF ELSE IF 
		//with the LOGICAL OPERATOR (&& || !NOT)
		//otherwise when outputs are not the same- use IF ELSE IF condition
		
		String country="Turkey";
		if("Turkey".equals(country)) {
			System.out.println("Ankara");
		} else if("USA".equals((country)){
			System.out.println("DC");
		} else if("Serbia".equals(country)) {
			System.out.println("Belgrade");
		}else if("Albania".equals(country)) {
			System.out.println("Tirana");
		}

	}

}
