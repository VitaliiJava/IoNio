package com.lviv.task;

/**
 * Создать класс родителя Writer c методом modifyText, который реализует интерфейс Writable
 * c абстрактными методом write. Создать потомка, который будет писать данные в текстовый файл Poem.txt.
 * Данные вводит юзер с консоли. К данным введенным юзером в методе modifyText добавлять строку "I'm ready for writting to file".
 * Создать класс родителя Reader c методом modifyText, который реализует интерфейс Readable c абстрактным
 * методом read. Создать потомка, который будет читать данные из текстового файла Poem.txt и вывести данные в консоль.
 * Перед выводом в консоль в методе modifyText заменить строку "I'm ready for writting to file" на "I'm from file".
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ChildWriter childWriter = new ChildWriter();
        childWriter.write();

        ChildReader childReader = new ChildReader();
         childReader.read();

        ChildWriterNio childWriterNio = new ChildWriterNio();
        childWriterNio.write();

       ChildReaderNio childReaderNio =new ChildReaderNio();
        childReaderNio.read();
    }
}
