import java.util.List;
import java.util.ArrayList;
public class Directory implements FileSystem{

    private List<FileSystem> fileSystemList = new ArrayList<>();
    private String name;

    public Directory(String name) {
        this.name = name;
    }

    public void addFilesOrDirectory(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls(){
        System.out.println("Inside Directory: " + name);
        for(FileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }
}