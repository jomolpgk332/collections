package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Deletecollect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++) {
			 list.add("a");
		      list.add("b");
		       list.add("c");
		}
		System.out.println("Enter the updated name");
		String name1=s.next();
		list.set(0, name1);
		list.clear();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}


