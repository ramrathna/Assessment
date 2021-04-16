
public class swap {
	public static void main(String[] args) {
		 String a = "Naveen";  
	        String b = "Prasad";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After : " + a + " " + b);  
	}

}
