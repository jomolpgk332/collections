package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import linkedlist.NewCard;

public class Casestudy_cards {

	public static void main(String[] args) {
		int cards,num,i,count=0,sum=0;
		Scanner s=new Scanner(System.in);
		ArrayList<Symbols> list=new ArrayList<Symbols>();//using map it is difficult so arraylist
		Map<String,Symbols>map=new HashMap<String,Symbols>();
		System.out.println("Number of cards");//asking for size
		int n=s.nextInt();
		Symbols[]stud=new Symbols[n];
		for(i=0;i<n;i++) 
		{	
			System.out.println("Enter card ");
			String symbol=s.next();
			num=s.nextInt();
			stud[i]=new Symbols();//calling symbol class
			stud[i].setSymbol(symbol);
			stud[i].setNum(num);
			list.add(stud[i]);
			map.put(stud[i].getSymbol(),stud[i]);//setting values in map
		}
			System.out.println("Distinct symbols are:");
			Set<String>keys=map.keySet();//set deletes dup values and get distinct values
			for(String key:keys)//key stores keys values ie symbols are stored n keys and each symbol is accessed by key
			System.out.println(key+" ");
			System.out.println();
			for(String key:keys) 
			{
			System.out.println("Cards in " +key+ " symbol");//key map variable
			Iterator<Symbols>itr=list.iterator();
			while(itr.hasNext()) {
				Symbols sy=itr.next();
				if(sy.getSymbol().equals(key))//if a in sy==a in keys then get inside the loop
					System.out.println(sy.getSymbol()+" "+sy.getNum());
			}
			Iterator<Symbols>itr1=list.iterator();
			while(itr1.hasNext()) {
				Symbols sy=itr1.next();
				if(sy.getSymbol().equals(key)) {
					//same loop for counting the number of cards there and getting its sum
					count++;
					sum=sy.getNum()+sum;
				}
			}
			System.out.println("Number of cards "+count);
			System.out.println("Sum of number "+sum);
			count=sum=0;
			}		
}
}