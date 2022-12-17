package org.zkoss.Service;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.Model.Car;

public class CarService2 {
	private List<Car> listCar;
	
	public CarService2() {
		this.listCar = new ArrayList();
		this.listCar.add(new Car(1,"1","1","1","1",1));
		this.listCar.add(new Car(2,"2","2","2","2",2));
		this.listCar.add(new Car(3,"3","3","3","3",3));
		this.listCar.add(new Car(4,"4","4","4","4",4));
		this.listCar.add(new Car(5,"5","5","5","5",5));
	}
	
	/**
	 * Retrieve all cars in the catalog.
	 * @return all cars
	 */
	public List<Car> findAll() {
		return this.listCar;
	}
	
	/**
	 * search cars according to keyword in model and make.
	 * @param keyword for search
	 * @return list of car that match the keyword
	 */
	public List<Car> search(String keyword) {
		List<Car> list = new ArrayList();
		for(Car c : this.listCar) {
			if(c.getModel().equalsIgnoreCase(keyword)) {
				list.add(c);
			}
		}
		return list;
	}

}
