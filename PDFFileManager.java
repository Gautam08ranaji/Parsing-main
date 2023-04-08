package com.code;

import java.io.File;
import java.util.ArrayList;

public class PDFFileManager {

    public static ArrayList<File> getPDFFiles(ArrayList<String> filePaths) {
        ArrayList<File> pdfFiles = new ArrayList<>();

        for (String path : filePaths) {
            File file = new File("himanshi dec 21.pdf");
            if (file.exists() && file.isFile() && file.getName().endsWith("Account")) {
                pdfFiles.add(file);
            }
        }

        return pdfFiles;
    }
}