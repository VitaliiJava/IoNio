package com.lviv.task;

import java.io.IOException;
import java.util.Scanner;


public abstract class Writer implements Writable {

    public static final String FILE_NAME = "./Poem.txt";
    public static final Scanner scanner = new Scanner(System.in);

    public String getInfoFromUser() {
        System.out.println("Input text please!");
        return scanner.nextLine();
    }

    public String modifyText(String stringForFile) {
        return stringForFile.concat(" I'm ready for writting to file");
    }

}
