package task3;

public interface ICreateDocument {
    IDocument createNew(DocumentType type);
    IDocument openDocument(DocumentType type, String data);
}