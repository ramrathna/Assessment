import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		   list.add("Naveen");
		   list.add("Prasad");
		   list.add("Hariharan");
		   list.add("RamPrasana");
		   System.out.println("Before Sorting:");
		   for(String str: list){
				System.out.println(str);
			}

		   Collections.sort(list, Collections.reverseOrder());

		   System.out.println("ArrayList in descending order:");
		   for(String str: list){
				System.out.println(str);
			}
	}

}
