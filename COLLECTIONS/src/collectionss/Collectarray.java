package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList al=new ArrayList();
		Employee[] emp=new Employee[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name");
			String name=s.next();
			System.out.println("Enter the age");
			int age=s.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			al.add(emp[i]);
		}
		Iterator<Employee> itr=al.iterator();
		while(itr.hasNext()) {
			Employee e=itr.next();
			System.out.println(e.getName()+" "+e.getAge());
		}
	}

}
