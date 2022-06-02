package ReviewClass04;

public class NestedLoopDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		while(c<=2) {
			System.out.println(c);
			c++;
		}
		c=1; //we add this value because in the above while increment will
		//add the 1 and get to number 3 so that the below would be false and not executed
		while(c<=2) {
			System.out.println(c);
			c++;
	}

}}
