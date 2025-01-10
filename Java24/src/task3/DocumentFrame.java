package task3;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DocumentFrame {
    private final DocumentType type;
    private final JFrame frame;
    private final JTextArea textArea;
    private JMenuItem newItem, openItem, saveItem;
    private IDocument document;

    public DocumentFrame(DocumentType type) {
        this.type = type;

        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ICreateDocument createDocument = new CreateDocument();
        document = createDocument.createNew(type);
        frame.setTitle(document.getNameInfo());

        setMenu();
        setActionListeners();
        textArea = new JTextArea();
        textArea.setFocusable(false);
        frame.getContentPane().add(textArea);

        frame.setVisible(true);
    }

    public void setMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
    }

    public void setActionListeners() {
        newItem.addActionListener(a -> {
            textArea.setFocusable(true);
            ICreateDocument createDocument = new CreateDocument();
            document = createDocument.createNew(type);
            textArea.setText(document.getData());
        });
        openItem.addActionListener(a -> {
            textArea.setFocusable(true);
            ICreateDocument createDocument = new CreateDocument();
            document = createDocument.openDocument(type, "");
            File file = chooseFile(document);
            if (file == null) return;
            try {
                Scanner scanner = new Scanner(file);
                StringBuilder stringBuilder = new StringBuilder();
                while (scanner.hasNextLine()) {
                    stringBuilder.append(scanner.nextLine()).append('\n');
                }
                textArea.setText(stringBuilder.toString());
                document.setData(stringBuilder.toString());
                scanner.close();
                JOptionPane.showMessageDialog(frame, "Файл типа " + document.getInfo() + " открыт");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        saveItem.addActionListener(a -> {
            textArea.setFocusable(true);
            File file = chooseFile(document);
            if (file == null) return;
            try {
                FileWriter writer = new FileWriter(file);
                writer.write(textArea.getText());
                writer.close();
                JOptionPane.showMessageDialog(frame, "Файл типа " + document.getInfo() + " сохранён");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public File chooseFile(IDocument document) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(document.getInfo(),
                document.getExtensionInfo());
        fileChooser.setFileFilter(filter);
        int res = fileChooser.showSaveDialog(frame);

        if (res == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }
}