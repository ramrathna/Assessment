
import java.util.LinkedList;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class linkedlist {
public static void main(String[] args) {
		LinkedList <Student> al = new LinkedList <Student>();
		al.add(new Student(111,"Naveen",23));
		al.add(new Student(112,"Prasad",22));
		al.add(new Student(113,"RamRathna",27));
		al.add(new Student(114,"Hariharan",18));
		al.add(new Student(115,"RamPrasana",20));
		
		for(Student e:al) {
			System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
		}
		al.remove(1);
		System.out.println("Middle node removed");
		
		for(Student e:al) {
			System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
		}
 }
}