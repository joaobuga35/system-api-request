package br.com.system.Generate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.system.record.Address;

public class GenerateFile {
    public void saveJson(List<Address> allAddress) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter wrote = new FileWriter(allAddress + ".json");
        wrote.write(gson.toJson(allAddress));
        wrote.close();
    }
}
