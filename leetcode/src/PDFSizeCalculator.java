import java.io.File;

public class PDFSizeCalculator {
    public static void main(String[] args) {
        // Specify the path to your PDF file
        String filePath = "C:/Users/Shravani_Jawalkar/Downloads/80002447694.pdf";
        
        // Get the size in MB
        double sizeInMB = getFileSizeInMB(filePath);
        
        // Print the result
        System.out.println("The PDF file size is " + sizeInMB + " MB");
    }

    public static double getFileSizeInMB(String filePath) {
        // Create a File object
        File file = new File(filePath);

        // Get file size in bytes
        long fileSizeInBytes = file.length();
        
        // Convert bytes to megabytes
        double fileSizeInMB = fileSizeInBytes / (1024.0 * 1024.0);
        
        return fileSizeInMB;
    }
}