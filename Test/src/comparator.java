import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1{
	int id;
	String name;
	int age;
	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
public class comparator {
	public static void main(String[] args) {
		ArrayList <Employee1> al = new ArrayList <Employee1>();
		al.add(new Employee1(111,"Naveen",23));
		al.add(new Employee1(112,"Prasad",22));
		al.add(new Employee1(113,"RamRathna",27));
		al.add(new Employee1(114,"Hariharan",18));
		al.add(new Employee1(115,"RamPrasana",20));
	System.out.println("Sort by age");
		Comparator<Employee1> c1 = (A1,A2)->{
			return (A1.age==A2.age)?0:(A1.age>A2.age)?1:-1;
		};
		Collections.sort(al,c1);
		for(Employee1 e : al) {
			System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
		}
	System.out.println("Sort by name");
		Comparator<Employee1> c2 = (N1,N2)->{
			return N1.name.compareTo(N2.name);
		};
		Collections.sort(al,c2);
		for(Employee1 e : al) {
			System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
		}
	System.out.println("Sort by id");
		Comparator<Employee1> c3 = (I1,I2)->{
			return (I1.id==I2.id)?0:(I1.id>I2.id)?1:-1;
		};
		Collections.sort(al,c3);
		for(Employee1 e : al) {
			System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
		}
	}


}
