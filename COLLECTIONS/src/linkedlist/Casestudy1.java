package linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Casestudy1 
{
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub


	String pr = "NO";String cot = null;String cable = null;String wifi = null;String laundry = null;
	Scanner s=new Scanner(System.in);
	int total,b=0,c,d,e,f,i=1;
	ArrayList li=new ArrayList();
	do {
	System.out.println("Menu\n 1.Book\n 2.Check Status\n 3.Exit");
	System.out.println("Enter your choice");
	int n=s.nextInt();
	Employe[] cus=new Employe[n];
	String ac = null;
	switch(n) {
	case 1:
	do {
	System.out.println("Booking");
	System.out.println("Please choose the service required");
	System.out.println("AC/non-AC(AC/nAC)");
	ac=s.next();
	if(ac.contentEquals("AC")==true) {b=1500;}
	else {b=700;}

	System.out.println("Cot(S/D)");
	cot=s.next();
	if(cot.contentEquals("S")==true) {c=50;
	}
	else {c=100;}

	System.out.println("Cable(C/nC)");
	cable=s.next();
	if(cable.contentEquals("C")==true) {d=50;}
	else {d=0;}

	System.out.println("Wifi(W/nW)");
	wifi=s.next();
	if(wifi.contentEquals("W")==true) {e=200;}
	else {e=0;}

	System.out.println("Laundry(L/nL)");
	laundry=s.next();
	if(laundry.contentEquals("L")==true) {f=100;}
	else {f=0;}
	total=b+c+d+e+f;
	System.out.println("The total charge is Rs."+total);
	System.out.println("The services chosen are");
	if(ac.contentEquals("AC"))
	{
	System.out.println("Ac is choosen!");
	}
	else
	{
	System.out.println("There is no Ac!");
	}
	if(cot.contentEquals("S"))
	{
	System.out.println("Single Cot!");
	}
	else
	{
	System.out.println("Double cot!");
	}
	System.out.println(cot);
	System.out.println(cable);
	System.out.println(wifi);
	System.out.println(laundry);
	System.out.println("Do you want to proceed");
	pr=s.next();

	if (pr.equals("yes")==true)
	{//booked[i]=1;
	System.out.println("Thank you!! your room number is"+i);
	i=i+1;
	}}while(pr.contentEquals("no"));
	break;
	case 2:
	System.out.println("Check Status");
	System.out.println("Enter your room number:");
	int room=s.nextInt();

	//customer[i]=1;
	System.out.println("Room number"+room+"is booked");


	cus[i]=new Employe();
	cus[i].setAc(ac);
	cus[i].setCot(cot);
	cus[i].setCable(cable);
	cus[i].setWifi(wifi);
	cus[i].setLaundry(laundry);

	System.out.println("Thank you for registering \n Your id is " +i);
	}}
	while(pr.equals("NO"));
	{
	//if(pr.contentEquals("YES")==true)
	//{
	//customer[i]=1;
	System.out.println("Thank you  for booking.. !!! \n Welcome to Skyline builders");
	//i=i+1;
	//}
	}}}




	