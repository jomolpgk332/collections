package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<n;i++) {
			String name=s.next();
			list.add(name);
		}
		String str1=s.next();
		System.out.println("size of list"+list.size());
		System.out.println("list is"+list.isEmpty());
	}

}
