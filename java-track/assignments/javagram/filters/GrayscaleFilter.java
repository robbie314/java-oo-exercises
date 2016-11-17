package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class GrayscaleFilter implements Filter {

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
				int newRGB = (int)(0.2989 * r + 0.5870 * g + 0.1140 * b);
				

				processed.set(i, j, new Color(newRGB, newRGB, newRGB));
			}
		}

		return processed;
	}

}
