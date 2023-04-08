package com.code;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Spliterator;

import static org.junit.Assert.assertArrayEquals;


public class Fun {
    public static void main(String[] args) throws IOException {
        myCall("Payee Name");
        myCall("Amount");

    }
    public  static String[] myCall(String s1) throws IOException {
        File file = new File("anurag dec 21.pdf");
        FileInputStream fis = new FileInputStream(file);

        PDDocument pdfDocument = PDDocument.load(fis);
//        System.out.println(pdfDocument.getPages().getCount());
        PDFTextStripper  pdfTextStripper = new PDFTextStripper();
        String text =  pdfTextStripper.getText(pdfDocument);
//        String[] text1 = text.split("\\s");
        String[] text2 = text.split("\r");
//        System.out.println(text2.length);
//
        for(int i = 0; i <text2.length ; i++){
            if (text2[i].contains(s1)){
//                String text3 = Arrays.toString(text2);
//                String text3 = new String();
                String[] text4  = text2[i].split(": ");
//                System.out.println(Arrays.toString(text2));
//                System.out.println(Arrays.toString(text4) );
                for (int j = 0; j < text4.length; j++) {
                    if (text4[j].contains(s1)){
                        System.out.println(text4[1]);
                    }
                }
            }

//            }
        pdfDocument.close();
    }
        return text2;
    }}

