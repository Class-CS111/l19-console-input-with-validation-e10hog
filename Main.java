import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(instantiateFromInput(input).toString());
		System.out.println(instantiateFromInput(input).toString());
	}

	public static NetflixOriginal instantiateFromInput(Scanner input) {
		String name, genre;
		double rating;
		NetflixOriginal original = new NetflixOriginal();
		System.out.println("Please enter the name of the show: ");
		original.setName(input.nextLine());

		while (true) {
            System.out.println("Please enter the star rating: ");
			if(!original.setStarRating(input.nextFloat())){
				System.out.println("Invalid Input.");
			 } else {
				input.nextLine();
				break; 
			 }
        }
		while (true) {
            System.out.println("Please enter the genre: ");
			if(!original.setGenre(input.nextLine())){
				System.out.println("Invalid Input.");
			 } else {Stranger Things
				break; 
			 }
        }
		
		return original;
	}

}