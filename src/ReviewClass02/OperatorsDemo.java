package ReviewClass02;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Operators in Java
		//Arithmetic Operators + - / * %
		//whichever operator that ends in true or false it is a Logical operator == != >= <= > < 
		//== Logical operator to compare
		//Relational Operators:
	
		int num=10;
		int num2=10;
		System.out.println(num+num2);
		
		//>= (if any of two conditions is true, we will get true)
		System.out.println(num>=num2);//num>num2 or num=num2; since one operation is true,we get a true response
		//Whole 0-infinity  Negative infinity to Positive infinity
		System.out.println(Long.MAX_VALUE);//Gives us the maximum range
		System.out.println(Long.MIN_VALUE);//Gives us the maximum range
		System.out.println(Byte.MAX_VALUE);//Gives us maximum value for byte
		System.out.println(Integer.MAX_VALUE);
		System.out.println(num/num2);//1
		System.out.println(num%num);//interested in remainder and that is 0
		
		System.out.println(10.0/3);//3.3333333333333-answers in decimals
		System.out.println((int)10.0/3);//losing the decimal part (narrowing)
	
	}

}
