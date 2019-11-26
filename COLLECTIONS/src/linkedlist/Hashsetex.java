package linkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hashsetex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashSet<String>set=new HashSet<String>();
		set.add("merin");
		set.add("althaf");
		set.add("abin");
		set.add("bibin");
		set.add("merin");
		set.add("bibin");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
