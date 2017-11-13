package org.sample.emp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int id = Integer.valueOf(bf.readLine());
		String name = bf.readLine();
		String emailId = bf.readLine();
		long phoneNumber = Long.valueOf(bf.readLine());
		boolean gender = Boolean.valueOf(bf.readLine());
		Employee employee = new Employee(id, name, emailId, phoneNumber, gender);

	}
}
