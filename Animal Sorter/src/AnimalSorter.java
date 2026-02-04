import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
public class AnimalSorter

	{

		public static void main(String[] args) throws IOException
			{
				Scanner animalSorter = new Scanner (new File ("AnimalSorter.txt"));
				ArrayList<String> animalNames= new ArrayList <String>();
				ArrayList<Integer> animalAges = new ArrayList <Integer>();
				while (animalSorter.hasNextLine())
					{
					String word = animalSorter.nextLine();
					System.out.println(word);
					String [] fredArray = word.split (",");
					animalNames.add(fredArray[0]);
					animalAges.add(fredArray [1]);
					
					}
				for (String a: animalNames)
					{
						System.out.println(a);
					}
					
				
				

			}

	}
