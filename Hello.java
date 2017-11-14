
public class Hello {
	void show() {
		System.out.println("This feels good");
	}

	void getGreeting(String user) {
		System.out.println("Welcome" + user);
	}

	double calculateNetSalary(double basicSalary, float travelAllowance, float dearnessAllowance,
			float houseRentAllowance, float providalFund) {
		double netSalary = basicSalary + ((travelAllowance / 100) * basicSalary)
				+ ((dearnessAllowance / 100) * basicSalary) + ((houseRentAllowance / 100) * basicSalary)
				- ((providalFund / 100) * basicSalary);
		return netSalary;
	}

	public static void main(String[] args) {
		long accountNumber = 1234567812345678l;
		float houseRentAllowance = 5.0f;
		double travelAllowance = 13.3d;
		boolean status = true;
		short rent = 1340;
		int white = 0xfff;
		short black = (short) ~white;
		double providalFund = houseRentAllowance;
		System.out.println("Hello World");
	}
}
