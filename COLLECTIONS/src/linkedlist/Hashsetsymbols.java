package linkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hashsetsymbols {

	public static void main(String[] args) {
		int num,count=0;
		String symbol;
		Scanner s=new Scanner(System.in);
		Set<NewCard>set=new TreeSet<NewCard>(new Symbol());
		NewCard[]c=new NewCard[40];
		int n=s.nextInt();
		while(set.size()<n) {
			symbol=s.next();
			num=s.nextInt();
			c[count]=new NewCard();
			c[count].setSymbol(symbol);
			c[count].setNum(num);
			set.add(c[count]);
			count++;
		}
		System.out.println(n+ "Symbols gthered in"+count+"cards.");
		System.out.println("cards are");
		Iterator<NewCard>itr=set.iterator();
		while(itr.hasNext()) {
			NewCard ca=(NewCard)itr.next();
			System.out.println(ca.getSymbol()+ " "+ca.getNum());
		}
		
	}

}
//treeset natural order