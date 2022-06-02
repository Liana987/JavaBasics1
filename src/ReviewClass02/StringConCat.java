package ReviewClass02;

public class StringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Ali";
		String lastName="Baba";
		String fullName=firstName+lastName;
		System.out.println(fullName);
		
		int num=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		
		int num2=10;
		System.out.println(firstName+num+num2);//Ali1010 (first operation = firstName+num= Ali10+10=Ali1010
		System.out.println(firstName+(num+num2)); //Ali20 (first operation (num+num2)=10+10=20=Ali+20=>Ali20
		System.out.println(num+firstName+num2);//10Ali10
	}

}
