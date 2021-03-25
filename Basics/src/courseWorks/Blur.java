package courseWorks;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static int getSaturatedColor(double color) {
        if (color > 255) {
            return 255;
        }

        if (color < 0) {
            return 0;
        }

        return (int) color;
    }

    public static void applyFilterToPixel(WritableRaster raster, int[] pixel, double[][] matrix, int x, int y) {
        int matrixSizeHalf = matrix.length / 2;

        double redSum = 0;
        double greenSum = 0;
        double blueSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                raster.getPixel(x + j - matrixSizeHalf, y + i - matrixSizeHalf, pixel);

                redSum += pixel[0] * matrix[i][j];
                greenSum += pixel[1] * matrix[i][j];
                blueSum += pixel[2] * matrix[i][j];
            }
        }

        pixel[0] = getSaturatedColor(redSum);
        pixel[1] = getSaturatedColor(greenSum);
        pixel[2] = getSaturatedColor(blueSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File("Basics/image.jpg"));
        WritableRaster inputRaster = inputImage.getRaster();

        BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), inputImage.getType());
        WritableRaster outputRaster = outputImage.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        double[][] matrix = {
                {1.0 / 9, 1.0 / 9, 1.0 / 9},
                {1.0 / 9, 1.0 / 9, 1.0 / 9},
                {1.0 / 9, 1.0 / 9, 1.0 / 9}
        };

        int matrixSizeHalf = matrix.length / 2;
        int heightMinusMatrixSizeHalf = inputRaster.getHeight() - matrixSizeHalf;
        int widthMinusMatrixSizeHalf = inputRaster.getWidth() - matrixSizeHalf;

        for (int y = matrixSizeHalf; y < heightMinusMatrixSizeHalf; y++) {
            for (int x = matrixSizeHalf; x < widthMinusMatrixSizeHalf; x++) {
                applyFilterToPixel(inputRaster, pixel, matrix, x, y);
                outputRaster.setPixel(x, y, pixel);
            }
        }

        ImageIO.write(outputImage, "png", new File("Basics/src/courseWorks/Blur.png"));
    }
}