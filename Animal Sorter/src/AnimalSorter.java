import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.io.File;

public class AnimalSorter

{
	static String totalAge;
	static int counter;

	public static void main(String[] args) throws IOException {
		Scanner animalSorter = new Scanner(new File("AnimalSorter.txt"));
		ArrayList<String> animalNames = new ArrayList<String>();
		ArrayList<Integer> animalAges = new ArrayList<Integer>();
		while (animalSorter.hasNextLine()) {
			String word = animalSorter.nextLine();
			// System.out.println(word);
			String[] fredArray = word.split(",");
			animalNames.add(fredArray[0]);

			Collections.sort(animalNames);

			animalAges.add(Integer.parseInt(fredArray[1]));
			totalAge += (Integer.parseInt(fredArray[1]));
			counter++;
		}

		System.out.println("List of Alphabetized animal Names");
		System.out.println();
		for (String a : animalNames) {
			System.out.println(a);
		}

		
	}
	
}
