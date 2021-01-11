import java.util.*;
public class StudentList {

	public static void main(String[] args) {

		ArrayList<Students> list = new ArrayList<>();
		list.add(new Students(1,"Somchai"));
		list.add(new Students(2,"Somchai"));
		list.add(new Students(3,"Somchai"));
		list.add(new Students(4,"Somchai"));
		System.out.println(list.size());
		for(Students student:list)
		System.out.println("ID: "+student.id+
				" Name: "+student.name);
    }

	}


