package task3;

public class CreateDocument implements ICreateDocument{
    @Override
    public IDocument createNew(DocumentType type) {
        switch (type) {
            case TEXT -> { return new TextDocument(); }
            case IMAGE -> { return new ImageDocument(); }
            case AUDIO -> { return new AudioDocument(); }
            default -> { return null; }
        }
    }

    @Override
    public IDocument openDocument(DocumentType type, String data) {
        switch (type) {
            case TEXT -> { return new TextDocument(data); }
            case IMAGE -> { return new ImageDocument(data); }
            case AUDIO -> { return new AudioDocument(data); }
            default -> { return null; }
        }
    }
}
