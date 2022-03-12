package javaCore;

import java.util.ArrayList;
import java.util.List;
interface A{
	int square(int x);
}
public class JavaList {
public static void main(String args[]) {
	List<Boolean> list=new ArrayList<>();
	list.add(true);
	list.add(Boolean.parseBoolean("FalSe"));
	list.add(Boolean.TRUE);
	System.out.println(""+list.size());
	System.out.println(list.get(1) instanceof Boolean);
	A a1=(int x)->{return x*x;};
	System.out.println(a1.square(5));
	System.out.println(1/0);
}
}
