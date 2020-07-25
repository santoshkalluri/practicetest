package practicetest;
import java.util.*; 

public class StringIncreasing {
	 public static void main(String[] args) {
		 int a,b;
		 String temp=" ";
		 for( a=0;a<args.length;a++) {
			 for(b=0;b<(args.length-a);b++)
			 {
				 if(args[b-1].length()>args[b].length())
				 {
					 temp=args[b-1];
					 args[b-1]=args[b];
					 args[b]=temp;
				 }
			 }
		 }
		for(a=0;a<args.length;a++) {
			System.out.println(args[a]);
		}
	 }
	 
	 }
	 