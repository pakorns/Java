import java.util.ArrayList;
public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[4];
		n[0]=3; 
		n[1]=4;
		n[2]=2;
		n[3]=6;
		//Display value : 
		System.out.println("One dimention : "+ n[0]);
		///
		ArrayList<Integer> list =new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(65);
		list.add(77);
		list.add(68);
		System.out.println("Display value from ArrayList :");
		System.out.println(list);
		
		/*
		 * ArrayList<String> car =new ArrayList<>(); car.add("Toyota");
		 * car.add("Mazda"); car.add("Honda"); car.add("Volvo"); car.add("BMW");
		 * 
		 * System.out.println(car); System.out.println(list.get(3));
		 * System.out.println(car.get(2)); System.out.println("Size of list: " +
		 * list.size()); System.out.println("Size of car: " + car.size()); for(int ln:
		 * list) System.out.println(ln); for(String carList:car)
		 * System.out.println(carList); //learn more website
		 * //https://www.w3schools.com/java/java_arraylist.asp
		 */
	}

}
