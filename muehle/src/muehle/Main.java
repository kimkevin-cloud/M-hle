package muehle;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("Einfacher Rechner");
		System.out.print("Geben Sie die erste Zahl ein: ");
		int num1 = scanner.nextInt();

		System.out.print("Geben Sie die zweite Zahl ein: ");
		int num2 = scanner.nextInt();

		System.out.print("Wählen Sie die Operation (1 für Addition, 2 für Subtraktion): ");
		int operation = scanner.nextInt();

		if (operation == 1) {
			System.out.println("Ergebnis der Addition: " + (num1 + num2));
		} else if (operation == 2) {
			System.out.println("Ergebnis der Subtraktion: " + (num1 - num2));
		} else {
			System.out.println("Ungültige Operation");
		}

		scanner.close();
	}
}
