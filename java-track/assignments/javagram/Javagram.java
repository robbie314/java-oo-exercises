package javagram;

import javagram.filters.*;

import java.io.File;

import java.util.Arrays;

import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images

		String[] baseParts = { System.getProperty("user.dir"), "images" };

		String dir = String.join(File.separator, baseParts);

		String relPath = "";

		Picture picture = null;

		Scanner in = new Scanner(System.in);

		// prompt user for image to filter and validate input

		do {

			String imagePath = "path not set";

			// try to open the file

			try {

				System.out.println("Image path (relative to " + dir + "):");

				relPath = in.next();

				// String[] relPathParts = relPath.split(File.separator);

				// imagePath = dir + File.separator +
				// String.join(File.separator, Arrays.asList(relPathParts));
				imagePath = (dir + "\\" + relPath);
				picture = new Picture(imagePath);

			} catch (RuntimeException e) {

				System.out.println("Could not open image: " + imagePath);

			}

		} while (picture == null);

		// TODO - prompt user for filter and validate input
		int selection = 0;
		
		Filter filter = null;
		do {
		selection = displayFilterMenu(in);

		// TODO - pass filter ID int to getFilter, and get an instance of Filter
		// back
		
	
			
		try {
		
			filter = getFilter(selection);
		} catch (Exception e ) {
			System.out.println("Please select a valid option: ");
			// filter and display image
		}
		} while (selection > 4 || selection < 1);
		
			Picture processed = filter.process(picture);

			processed.show();

			System.out.println("Image successfully filtered");

			// save image, if desired

			System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");

			String fileName = in.next();

			// TODO - if the user enters the same file name as the input file,
			// confirm that they want to overwrite the original
			String input = "";
			
			do {
			if (fileName.equals(relPath)) {
				System.out.println("Are you sure you want to overwrite file?(y/n)");
				 input = in.next();}
				
				
				if (input.toLowerCase().equals("y")) {
				
				}
				else if (input.toLowerCase().equals("n")) {
					System.out.println("Enter new file name");
					fileName = in.next();
				}
				else {
					System.out.println("Enter y or n only");
					fileName = "exit";
				}
				
			} while (fileName.equals(relPath));
			
			
			if (fileName.equals("exit")) {

				System.out.println("Image not saved");

			} else {

				String absFileName = dir + File.separator + fileName;

				processed.save(absFileName);

				System.out.println("Image saved to " + absFileName);

			}

			// close input scanner

			//in.close();
		  
			
		
		
			in.close();
	}
	
	
	private static int displayFilterMenu(Scanner in) {
		System.out.println("Welcome to  the filter menu!");
		System.out.println("1. Blue filter");
		System.out.println("2. Invert filter");
		System.out.println("3. Brightness filter");
		System.out.println("4. Grayscale filter");
		System.out.println("Please select an option: ");
		return in.nextInt();

	}
	// TODO - refactor this method to accept an int parameter, and return an
	// instance of the Filter interface

	// TODO - refactor this method to thrown an exception if the int doesn't
	// correspond to a filter

	private static Filter getFilter(int selection) throws Exception {

		// TODO - create some more filters, and add logic to return the
		// appropriate one
		if (selection == 1) {
			return new BlueFilter();
		} else if (selection == 2) {
			return new InvertFilter();
		} else if (selection == 3) {
			return new BrightnessFilter();
		} else if (selection == 4) {
			return new GrayscaleFilter();

		} else {
			throw new Exception();
		}

	}

}