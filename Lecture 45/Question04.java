package q11312;
public class TimingExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int total = 0;
		for (int i = 0; i < 1000; i++) {
			total = total + i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken in milliseconds = " + (endTime - startTime));
	}
}
