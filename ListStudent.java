import java.util.ArrayList;

public class ListStudent {

	public static void main(String[] args) {
		ArrayList<Students> listStudents=new ArrayList<>();
		//listStudens.add(____?_____Students(id,name));
		listStudents.add(new Students(133,"Somchai"));
		listStudents.add(new Students(222,"Somying"));
		listStudents.add(new Students(301,"Somsak"));
		int[] arr =new int[4];
		System.out.println(arr.length);
		System.out.print("ID :  "+ listStudents.get(1).getId());
		System.out.print("Name :  "+listStudents.get(1).getName());
	
		
		/*
		 * //display list for(Students ______________ )
		 * System.out.println("Id: "+______" Name: "+________);
		 */
	}

}
