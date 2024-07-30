package exercise2;


public interface Document {
    void open();
    void close();
    void save();
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Word document.");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document.");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document.");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document.");
    }
}

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Excel document.");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel document.");
    }
}
