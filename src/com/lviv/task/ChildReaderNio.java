package com.lviv.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class ChildReaderNio extends Reader {

    @Override
    public void read() throws Exception {
        Path path = FileSystems.getDefault().getPath("./Poem.txt");
        List<String> strings = Files.readAllLines(path);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(modifyText(line));
            }
        }
    }

}

