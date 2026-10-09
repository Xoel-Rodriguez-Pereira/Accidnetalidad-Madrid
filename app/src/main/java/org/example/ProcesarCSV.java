package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.example.model.Accidente;

public class ProcesarCSV {

    public List<Accidente> leerCSV(Path csv) throws IOException {
        
        return Files.lines(csv).skip(1).map(e -> crearAccidente(e)).toList();
    }
    
    public Accidente crearAccidente(String linea) {
        return new Accidente(linea.split(";", -1));
    }
}