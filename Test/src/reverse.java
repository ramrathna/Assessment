
public class reverse {
public static void main(String[] args) {
	String s1 = "Java is best";
	String[] temp = s1.split(" ");
    String result = " ";
    for (int i = 0; i < temp.length; i++) {
        if (i == temp.length - 1)
            result = temp[i] + result;
        else
            result = " " + temp[i] + result;
    }
    System.out.println(result);
}
}

