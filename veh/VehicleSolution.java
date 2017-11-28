package com.veh;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veh.FourWheeler;
import com.veh.TwoWheeler;
import com.veh.Vehicle;

public class VehicleSolution {

	public static void main(String[] args) throws IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Vehicle vehicle = new Vehicle();
		vehicle.setName("Car");

		TwoWheeler two = new TwoWheeler();
		two.setName("Bike");
		two.setSteeringHandle("Bike Steering");

		FourWheeler four = new FourWheeler();
		four.setName("Porsche");
		four.setSteeringWheel("Porsche wheel");

		session.beginTransaction();
		session.save(vehicle);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();

		session.close();
		sf.close();

	}

}
