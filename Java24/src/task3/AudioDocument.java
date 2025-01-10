package task3;

public class AudioDocument implements IDocument{
    public static final String info = "Аудио";
    public static final String nameInfo = "Редактор аудио";
    public static final String extensionInfo = "mp3";
    private String data;

    public AudioDocument() {
    }

    public AudioDocument(String data) {
        this.data = data;
    }

    @Override
    public String getNameInfo() {
        return nameInfo;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String getExtensionInfo() {
        return extensionInfo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}