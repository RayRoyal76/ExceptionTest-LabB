package com.RayvonScott.LabExceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileInputStream input = null;

        try {
            input = new FileInputStream("NotHere");
        } catch (FileNotFoundException e) {
            System.out.println("Wait!");
        } catch (Exception e) {
            System.out.println("Uh-Oh!");
        }
        finally {
            if (input!= null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
