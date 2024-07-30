package exercise6;

// RealImage.java
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading " + fileName + " from remote server...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
