package task3;

public class Main {
    public static void main(String[] args) {
        DocumentType type;
        switch (args[0]) {
            case "Text" -> type = DocumentType.TEXT;
            case "Image" -> type = DocumentType.IMAGE;
            case "Audio" -> type = DocumentType.AUDIO;
            default -> { return; }
        }
        DocumentFrame documentFrame = new DocumentFrame(type);
    }
}