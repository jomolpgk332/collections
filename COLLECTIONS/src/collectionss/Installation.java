package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Installation 
{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,n;
		ArrayList list=new ArrayList();
		do {
		System.out.println("1)Display installed applications\n2)Install an application\n3)Uninstall an application\n4)Quit");
		n=s.nextInt();
		switch(n)
		{
		
		case 1:{
			
		Iterator itt=list.iterator();
		if(list.isEmpty()) {
			System.out.println("There is no application installed");
		}
		else
		{
			int j=0;
			while(itt.hasNext()) {
				System.out.println(j+ " "+itt.next());
				j++;
			}
		}
	}
		break;
		case 2:{
			Iterator it1=list.iterator();
			System.out.println("Enter the application");
			String app=s.next();
			int flag=0;
			while(it1.hasNext()) {
				String st=(String)it1.next();
				if(st.equals(app)) {
					//System.out.println("Already installed");
					flag=1;
					break;
				}}
				if(flag==1) {
					System.out.println("Already installed");
				}
				else
				{
					list.add(app);
				}
			
			
		}break;
		case 3:
		{
			if(list.isEmpty()) {
				System.out.println("There is no application installed");
			}
			else {
				
			
			Iterator it=list.iterator();
			for(i=0;i<list.size();i++) {
				System.out.println(i+" "+it.next());
			}
			System.out.println("Enter the index of application to be removed");
			int index=s.nextInt();
			list.remove(index);}
		//System.out.println("Successfully uninstalled");
		}
		break;
		case 4:{
			System.out.println("Successfully exited");
			System.exit(0);
			
		}
		default:
		{
			System.out.println("Invalid option");
		}
		break;
		}
		}
		while(true) ;
		
		}
	}
	

