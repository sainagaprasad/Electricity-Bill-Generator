import java.util.Scanner;

public class CustomerValidation {
	public static String validation() {
		Scanner sc = new Scanner(System.in);
		String string = null;
		int j = 0;
		while (j == 0) {
			try {
				string = sc.next();
				boolean a = string.matches("^[a-zA-Z]*$");
				while (!a) {
					throw new UserException(
							"Name should not contain numbers or special characters \nEnter the input again :");
				}
				j = 1;
			} catch (UserException e) {
				System.out.println(e.getMessage());
			}
		}
		return string;
	}

	public static String validatecode() {
		Scanner sc = new Scanner(System.in);
		String string = "";
		int j = 0;
		while (j == 0) {
			try {
				string = sc.nextLine();
				if (string.length() == 6) {
					int temp = 0;
					try {
						while (temp < string.length()) {
							if (Character.isDigit(string.charAt(temp)) == false) {
								throw new UserException(
										"Area code should contain six digits \nEnter the input again :");
							}
							temp++;
						}
						j = 1;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}
				}

				else {
					if (string.length() != 6)
						throw new UserException("Area code should contain six digits \nEnter the input again :");
				}

			} catch (UserException e) {
				System.out.println(e.getMessage());
			}

		}
		return string;
	}

	public static int validatenumber() {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		String s;
		int n = 0;
		while (j == 0) {
			try {
				s = sc.nextLine();
				n = Integer.parseInt(s);
				if (n < 0) {
					throw new UserException("Number cannot be negetive \nEnter the input again");
				}
				j = 1;
			} catch (NumberFormatException e) {
				System.out.println("Input is not a valid integer \nEnter the input again");
			} catch (UserException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		}
		return n;
	}
}