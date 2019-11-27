package linkedlist;

import java.util.Scanner;

public class Eg {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int m=s.nextInt();
int n=s.nextInt();
int arr[][]=new int[m][n];
int i=0,j=0;
for(i=0;i<m+2;i++) {
	for(j=0;j<n+2;j++) {
		arr[m][n]=s.nextInt();
	}
}
System.out.println("square matrix");
for(i=0;i<m+2;i++) {
	for(i=0;i<n+2;i++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
}
}