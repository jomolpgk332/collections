package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Updatecollect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++) {
		
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter age");
		int age=s.nextInt();
		list.add(name);
		list.add(age);
		}
		System.out.println("Enter updated name");
		String name1=s.next();
		list.set(0, name1);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
