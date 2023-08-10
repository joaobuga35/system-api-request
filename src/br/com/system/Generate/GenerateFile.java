package br.com.system.Generate;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.system.record.Address;

public class GenerateFile {
    public void saveJson(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter wrote = new FileWriter(address.cep() + ".json");
        wrote.write(gson.toJson(address));
        wrote.close();
    }
}
