package pack.one;
import java.util.*;
public class Ad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List ls=new ArrayList();
		List l=new ArrayList();
		
		l.add(5);
		l.add("Hello");
		ls.add(1);
		ls.add("Hi");
		ls.add(true);
		ls.add(4);
		System.out.println(ls);
		ls.addAll(l);
		System.out.println(ls);
		ls.remove("Hi");
		System.out.println(ls);
		ls.remove(4);
		System.out.println(ls);
		ls.remove((Integer)1);
		System.out.println(ls);
		ls.removeAll(l);
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.contains(2));
		ls.set(0, 5);
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
	}

}
