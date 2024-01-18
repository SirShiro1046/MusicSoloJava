package clases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Musica;
import interfaces.IMusicaRepository;

public class CsvReader  implements IMusicaRepository{
    private static final String SEPARATOR = ",";
    private final String ruta;

    public CsvReader(String ruta){
        this.ruta = ruta;
    }

    private Musica mapearMusica(String [] campos){
        return new Musica();
    }

    @Override
    public List<Musica> obtenMusicas() {
        Path path = Path.of(ruta);
        try{
            return Files.lines(path)
            .skip(1)
            .map(linea -> linea.split(SEPARATOR))
            .map(this::mapearMusica)
            .collect(Collectors.toList());

        }catch(IOException e){
            e.printStackTrace();
            return Collections.emptyList();
        }
        
    }



    
}
