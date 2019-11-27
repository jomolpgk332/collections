package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exhashmap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		Map<Integer,Employee1>map=new HashMap<Integer,Employee1>();
		Employee1[]emp=new Employee1[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name");
			String name=s.next();
			System.out.println("Enter the age");
		int	age=s.nextInt();
		emp[i]=new Employee1();
		emp[i].setAge(age);
		emp[i].setName(name);
		map.put(i, emp[i]);
		}
		for(Map.Entry<Integer, Employee1>en:map.entrySet()){
			
			int key=en.getKey();
			Employee1 e=en.getValue();
			System.out.println(key+e.getName()+e.getAge());
		}
		s.close();
	}

}
