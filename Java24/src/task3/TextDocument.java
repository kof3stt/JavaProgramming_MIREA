package task3;

public class TextDocument implements IDocument{
    public static final String info = "Текстовый документ";
    public static final String nameInfo = "Редактор текста";
    public static final String extensionInfo = "txt";
    private String data;

    public TextDocument() {
    }

    public TextDocument(String data) {
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
