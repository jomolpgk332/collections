package collectionss;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;
	public class Collectclones {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size");
			int n=s.nextInt();
			ArrayList list=new ArrayList();//arraylist class declaration
			for(int i=0;i<n;i++) {

				System.out.println("Enter the name");
				String name=s.next();
				System.out.println("Enter the age");
				int age=s.nextInt();
				list.add(name);//add method
				list.add(age);
			}
			ArrayList list1=(ArrayList) list.clone();
			System.out.println("clone values"+list1.get(0));
			list1.remove(0);
			System.out.println(list1.get(0));
			System.out.println("list1 values ");
			Iterator itr=list.iterator();//used to traverse a elmenets one by one
			while(itr.hasNext())//boolean hasnext():returns true if iteration has more elements 
				{
				System.out.println(itr.next());//returns next element in the iteration
			}
			
		}

	}


