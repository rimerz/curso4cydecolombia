/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 *
 * @author administrator
 */
public class MyTypeAdapter<T> extends TypeAdapter<T> {

    @Override
    public T read(JsonReader reader) throws IOException {
        return null;
    }

    @Override
    public void write(JsonWriter writer, T obj) throws IOException {
        if (obj == null) {
            writer.nullValue();
            return;
        }
        writer.value(obj.toString());
    }

}
