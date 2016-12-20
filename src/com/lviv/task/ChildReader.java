package com.lviv.task;

import java.io.*;

public class ChildReader extends Reader {

    @Override
    public void read() throws IOException {
        // This special facility for the construction of the line
        StringBuilder sb = new StringBuilder();

        // Specify file
        File file = new File(FILE_NAME);
        try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {

            // The loop reads a file line by line
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        }
        System.out.println(modifyText(sb.toString()));
    }


}
