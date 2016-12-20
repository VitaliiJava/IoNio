package com.lviv.task;


import java.lang.*;

public abstract class Reader implements Readable {
    public static final String FILE_NAME = "./Poem.txt";

    public String modifyText(String str) {
        String strAfter = str.replace("I'm ready for writting to file", "I'm from file");
        return strAfter;
    }
}
