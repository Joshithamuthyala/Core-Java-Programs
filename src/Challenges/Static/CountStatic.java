package Challenges.Static;
class Count {
    static int count = 0;

    Count() {
        count++;
    }

    static int getCount() {
        return count;
    }
}
public class CountStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Count a = new Count();
	        Count b = new Count();
	        Count c = new Count();

	        System.out.println("Objects created: " + Count.getCount());
	}

}
