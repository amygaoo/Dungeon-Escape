package com.example.dungeonescape;

import java.io.File;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.nio.file.Files;

/**
 * This class save and load players' data.
 * The code in this file is from https://www.youtube.com/watch?v=-xW0pBZqpjU&t=207s
 */

public class SaveData implements Serializable {

    static void save(Serializable data, File f) throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(f.toPath()))) {
            oos.writeObject(data);

        }
    }

    static Object load(File f) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(f.toPath()))) {
            return ois.readObject();
        }
    }
}