package ex1_list;

import java.util.ArrayList;
import java.util.List;

public class Exam02 {
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		
		Car c1 = new Car();
		c1.setTire(4);
		c1.setEngine(1);
		
		carList.add(c1);
		
		Car c2 = new Car();
		c2.setTire(4);
		c2.setEngine(2);
		
		carList.add(c2);
		
		for(Car c : carList) {
			System.out.println(c.getTire());
			System.out.println(c.getEngine());
		}
	}
}
