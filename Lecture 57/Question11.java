package q24079;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// Notice the use of generics. We will learn more about them later.
		// The type parameter <String> will ensure that your code cannot add any 
		// other object than those of type String
		List<String> namesList = new ArrayList<String>();
		// write your code below this
		for(int i = 0;i<args.length;i++){
			namesList.add(args[i]);
		}



		// write your code above this
		System.out.println(namesList);

	}
}
