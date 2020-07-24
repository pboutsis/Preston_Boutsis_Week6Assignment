//Preston Boutsis
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Preston_Boutsis_Week6Assignment 
{
	private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		part1Menu();
		part2Menu();
		part3Menu();
		input.close();
	}

	private static void part1Menu() 
	{
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Part 1: for loop: Average of randomly generated integers");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Enter the bottom number of the range: ");
		int min = input.nextInt();
		System.out.println("Enter the top number of the range: ");
		int max = input.nextInt();
		System.out.println("Enter How Many Numbers to Generate: ");
		int qty = input.nextInt();

        int sum = 0;

        System.out.print("Generated Random Numbers: ");

       	for (int x=0; x<qty; x++) 
       	{
       		int rand = (int)((Math.random() * ((max - min) + 1)) + min);

			System.out.print(rand + " ");

			sum = sum + rand;
       	}

      	double avg = (double)sum/(double)qty;

      	System.out.println();
      	System.out.println("Average of generated numbers: " + avg);


		System.out.println("---------------------------------------------------------------------");
	}

	private static void part2Menu() 
	{
		System.out.println("Part 2: While loop: Average of user-entered integers using While loop");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Enter integers to average. Enter -1 to finish.");

		int y =0;
		int sum = 0;
		int qty = 0;

		while (y != -1)
		{
			qty++;
			System.out.println("Entry " + qty + ": ");
			y = input.nextInt();
			sum = sum + y;
		}
			
		sum = sum + 1; // to account for exit -1

		System.out.println("Number of entries: " + qty);

		System.out.println("Average of user-entered numbers: " + ((double)sum/(double)qty));
		

		System.out.println("---------------------------------------------------------------------");
	}

	private static void part3Menu() 
	{
		int z;

		System.out.println("Part 3: do-while loop: Display menu until user chooses to exit");
		System.out.println("---------------------------------------------------------------------");

		do
		{
			System.out.println("==============================");
			System.out.println("MENU");
			System.out.println("==============================");
			System.out.println("1: Star Wars");
			System.out.println("2: Star Trek");
			System.out.println("3: LOTR");
			System.out.println("4: Exit");
			System.out.println("==============================");
			System.out.print("Enter 1, 2, 3 or 4 to Exit: ");
			z = input.nextInt();
		}
		while (z != 4);
			
			
		if (z == 4)
		{
			System.out.println("Goodbye!");
			
		}

  	}

	}








