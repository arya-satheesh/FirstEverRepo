package encapsulation;

public class Encapsulation1 {
private String name;
private int roll_no;

public void getter()
{
	System.out.println(name);
	System.out.println(roll_no);
}
public void setter(String name, int roll_no)
{
	this.name = name;
	this.roll_no = roll_no;
}
}
