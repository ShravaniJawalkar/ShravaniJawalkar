public class CompositePatternDemo {
    public static  void main(String[] args){
        Directory fileSystem = new Directory("Root");

        FileSystem file1 = new File("File1.txt");
        fileSystem.addFilesOrDirectory(file1);
        Directory childFileSystem = new Directory("Child Directory");
        FileSystem file2 = new File("File2.txt");
        FileSystem file3 = new File("File3.txt");
        childFileSystem.addFilesOrDirectory(file2);
        childFileSystem.addFilesOrDirectory(file3);
        fileSystem.addFilesOrDirectory(childFileSystem);
        fileSystem.ls();
    }
}