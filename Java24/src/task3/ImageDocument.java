package task3;

public class ImageDocument implements IDocument{
    public static final String info = "Изображение";
    public static final String nameInfo = "Редактор изображений";
    public static final String extensionInfo = "jpg";
    private String data;

    public ImageDocument() {
    }

    public ImageDocument(String data) {
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
