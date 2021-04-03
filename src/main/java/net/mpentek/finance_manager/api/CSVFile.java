package net.mpentek.finance_manager.api;

public interface CSVFile {
    void openFile(String fileName);
    String readAll();
}
