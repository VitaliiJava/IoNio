package com.lviv.task;

import java.io.*;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.*;

/**
 * Создать класс родителя Writer c методом modifyText, который реализует интерфейс Writable
 * c абстрактными методом write. Создать потомка, который будет писать данные в текстовый файл Poem.txt.
 * Данные вводит юзер с консоли. К данным введенным юзером в методе modifyText добавлять строку "I'm ready for writting to file".
 * Создать класс родителя Reader c методом modifyText, который реализует интерфейс Readable c абстрактным
 * методом read. Создать потомка, который будет читать данные из текстового файла Poem.txt и вывести данные в консоль.
 * Перед выводом в консоль в методе modifyText заменить строку "I'm ready for writting to file" на "I'm from file".
 */
public class ChildWriterNio extends Writer {
    @Override
    public void write() throws Exception {
        Path path = FileSystems.getDefault().getPath("./Poem.txt");
        String infoFromUser = modifyText(getInfoFromUser());
        Files.write(path, infoFromUser.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(infoFromUser);
        }

    }
}

