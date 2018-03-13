public class MultiplicationTable {
	/** Main method */
	public static void main(String[] args) {
		// Display the table heading
		System.out.println("            Multiplication Table");

		// Display the number title
		System.out.print("    ");
		for (int j = 1; j <= 9; j++)
			System.out.print("   " + j);

		System.out.println("\n---------------------------------------");
		String output = "";

		// Print table body
		for (int i = 1; i <= 9; i++) {
			output += i + " | ";
			for (int j = 1; j <= 9; j++) {
				// Display the product and align properly
				if (i * j < 10)
					output += "   " + i * j;
				else
					output += "  " + i * j;
			}
			output += "\n";
		}
		
		// Display result
		System.out.println(output);
	}
}