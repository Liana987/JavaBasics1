package ReviewClass02;

public class IfElseDemo4 {

	public static void main(String[] args) {
		// NESTED IF

		double money = 1000;
		boolean amIFree = false;

		if (money > 100) // conditions inside oother conditions and if the first condition is checked and
							// it is true- all ignored-
			// the outer condition has to be met so that we could move forward to the inner
			// condition

			if (amIFree) {
				System.out.println("Go watch a movie");
			}

	}
}
