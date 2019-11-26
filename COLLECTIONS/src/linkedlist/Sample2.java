package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index");
		int n=s.nextInt();
		
		LinkedList list=new LinkedList();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name");
			String name=s.next();
			System.out.println("Enter the address");
			String address=s.next();
			System.out.println("Enter the place");
			String place=s.next();
			list.add(name);
			list.add(address);
			list.add(place);
		}
		
		System.out.println("size of list"+list.size());
		System.out.println("list is"+list.isEmpty());
	}

}
