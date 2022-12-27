package LaunchComparable;

import java.util.*;

class MyComparator4 implements Comparator{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		
	//DNSO --> based on id, sort the objects
		
		int id1 =this.eid;
		
		public void m2() {
			System.out.println("Inside m2()");
		}
		
	}
}

class Employee implements Comparable
{
	
	String name;
	int eid;
	
	Employee(String name, int id){
		this.name=name;
		this.eid=eid;
		
	}
	
	public String toString(){
		return name + "====>" + eid;
		
	}
}

public class Test5 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		Employee e1= new Employee("sachin", 10);
		Employee e2 =new Employee("ponting", 14);
		Employee e3=new Employee("gayle",99);
		Employee e4= new Employee("develliers",17);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		

		

	}

}
