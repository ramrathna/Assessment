import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student o) {
		if(id==o.id) {
			return 0;
		}
		else if(id>o.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class comparable {
	public static void main(String[] args) {
		ArrayList <Student> al = new ArrayList <Student>();
		al.add(new Student(111,"Naveen",23));
		al.add(new Student(112,"Prasad",22));
		al.add(new Student(113,"RamRathna",27));
		al.add(new Student(114,"Hariharan",18));
		al.add(new Student(115,"RamPrasana",20));
		Collections.sort(al);
		for(Student e : al) {
			System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
		}
	}
}
