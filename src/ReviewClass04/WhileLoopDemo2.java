package ReviewClass04;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// when wanting the even numbers, instead of increment by 1, we will increment by 2, the odd numbers will be automatically skipped
		//this way also skipping the mod operator ---> %
		
		int y=2;
		while(y<=10) {
			System.out.println(y);
			y=y+2;
		}

	}

}
