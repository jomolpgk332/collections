package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collectaddarray {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter the index");
		    int n=s.nextInt();
		    ArrayList<String>list=new ArrayList<String>();
		   
		    list.add("a");
		      list.add("b");
		       list.add("c");
		       ArrayList<String> list1=new ArrayList<String>();
		      list1.add("java");
		      list1.add("pgm");
		      list.addAll(list1);
		      	Iterator itr=list.iterator();
		      while(itr.hasNext()){
		        System.out.println(itr.next());
		    }
		    }

	}
