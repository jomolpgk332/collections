package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Casestudy1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		Employe[]emp=new Employe[n];
		for(int i=0;i<n;i++) {
			
		
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("Enter your contact number");
		int contact=s.nextInt();
		System.out.println("Enter your email id");
		String email=s.next();
		System.out.println("Enter your proof type");
		String prooftype=s.next();
		System.out.println("Enter your proof id");
		int proofid=s.nextInt();
		emp[i]=new Employe();
		//System.out.println("Thank you for registering.Your id is 1");
		//System.out.println("Do you want to continue(y/no)");
		//String con=s.next();
		//if(con.equals("no")) {
			System.out.println("do you want to update email(y/n)");
			String upemail=s.next();
			String c=upemail.toLowerCase();
			if(upemail.equals("y")) {
				System.out.println("Enter the updated email");
				String emailup=s.next();
				emp[i].setEmail(upemail);
				
				emp[i].setName(name);
				emp[i].setContact(contact);
				emp[i].setAddress(address);
				emp[i].setProoftype(prooftype);
				emp[i].setProofid(proofid);
		}
			else
			{
				emp[i].setEmail(upemail);
				emp[i].setContact(contact);
				emp[i].setName(name);
				emp[i].setAddress(address);
				emp[i].setProoftype(prooftype);
				emp[i].setProofid(proofid);
			}
			list.add(emp[i]);
		}
		Iterator<Employe> itr=list.iterator();
		int j=1;
		while(itr.hasNext()) {
			Employe e=itr.next();
			System.out.println("Employee details"+j);
			System.out.println("**************************");
			System.out.println("Name : "+e.getName());
			System.out.println("Address : "+e.getAddress());
			System.out.println("Contact number : "+e.getContact());
			System.out.println("Proof Type : "+e.getProoftype());
			System.out.println("Proofid : "+e.getProofid());

			j++;
		}
	 int i;
		System.out.println("do you want to delete the employee details(y/n)");
				String dc=s.next();
		String c=dc.toLowerCase();
		if(dc.equals("y")) {
			for(i=0;i<n;i++)
			{
			System.out.printf("INDEX %d Name %s\n", i,emp[i].name);
			}
			System.out.println("Enter   employees id");
			int id=s.nextInt();
			list.remove(emp[id]);
		}
			Iterator<Employe> itr1=list.iterator();
		int h=1;
			while(itr1.hasNext()) {
				Employe e=itr1.next();
				System.out.println("Employee details"+h);
				System.out.println("**************************");
				System.out.println("Name : "+e.getName());
				System.out.println("Address : "+e.getAddress());
				System.out.println("Contact number : "+e.getContact());
				System.out.println("Proof Type : "+e.getProoftype());
				System.out.println("Proofid : "+e.getProofid());

				h++;
			}	
	}

}

