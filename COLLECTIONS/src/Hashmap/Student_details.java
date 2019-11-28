package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_details {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		Map<Integer,Student>map=new HashMap<Integer,Student>();
		Student[]emp=new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name");
			String name=s.next();
			System.out.println("Enter the register number");
			int regno=s.nextInt();
			System.out.println("Enter the contact number");
			int	contact=s.nextInt();
			System.out.println("Enter the college name");
			String colname=s.next();
			System.out.println("Enter the address");
			String adress=s.next();
			System.out.println("Enter the mark");
		int	mark=s.nextInt();
		System.out.println("Enter the year");
		int	year=s.nextInt();
		emp[i]=new Student();
		emp[i].setContact(contact);
		emp[i].setAdress(adress);
		emp[i].setColname(colname);
		emp[i].setYear(year);
		emp[i].setMark(mark);
		emp[i].setName(name);
		emp[i].setRegno(regno);
		map.put(i, emp[i]);
		}
	
		System.out.println("Enter the key:\n");
		int k=s.nextInt();
		for(Map.Entry<Integer, Student>en:map.entrySet()){
			
			int flag=0;
			Student e=null;int key=0;
			for(int i=0;i<n;i++) {
				key=en.getKey();
				e=en.getValue();
				key=e.getRegno();
				if(k==key) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
			if(flag==1) {
			System.out.println(key+" "+e.getName()+" "+e.getRegno()+" "+e.getContact()+" "+e.getColname()+" "+e.getAdress()+" "+e.getMark()+" "+e.getYear());
		}
		}
		s.close();

	}

}
