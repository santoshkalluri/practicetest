package practicetest;
import java.util.Collections;
import java.util.ArrayList;
public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        ArrayList<Student> ar = new ArrayList<Student>();
		        ar.add(new Student("santosh", 21, 5.0));
		        ar.add(new Student("kalluri", 19, 6.0));
		        ar.add(new Student("bvrit", 18, 4.0));
		 
		 
		        Collections.sort(ar, new SortbyAge());
		 
		       System.out.println("Sorted by age");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
		 
		        Collections.sort(ar, new SortByName());
		 
		        System.out.println("Sorted by name");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
		        Collections.sort(ar, new SortByHeight());
				 
		        System.out.println("Sorted by height");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
	}

		
	}


