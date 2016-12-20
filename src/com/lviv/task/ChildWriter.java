package com.lviv.task;

import java.io.*;

public class ChildWriter extends Writer {

    @Override
    public void write() throws IOException {
        File file = new File(FILE_NAME);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, false))) {
            String stringFromUser = getInfoFromUser();
            bw.write(modifyText(stringFromUser));
        }
    }
}
