package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class BrightnessFilter implements Filter {

	@Override
	public Picture process(Picture original) {
		Picture processed = new Picture(original.width(), original.height());

		// get each pixel one by one
		for (int i = 0; i < original.width(); i++) {
			for (int j = 0; j < original.height(); j++) {

				Color c = original.get(i, j);

				// get color components from each pixel
				int r = c.getRed();
				int g = c.getGreen();
				int b = c.getBlue();
				int newRed = (r + 100);
				int newGreen = (g + 100);
				int newBlue = (b + 100);
				if (newRed > 255 ) {
					newRed = 255;
				
				}
				if (newGreen > 255) {
					newGreen = 255;
					
				}
				if (newBlue > 255) {
					newBlue = 255;
				}
				processed.set(i, j, new Color(newRed, newGreen, newBlue));
			}
		}

		return processed;
	}

}
