package clases;

import java.util.List;

import entities.Musica;
import interfaces.IMusicaRepository;

public class LeerFuncional {
    private final IMusicaRepository musicaRepository;
    public LeerFuncional(IMusicaRepository musicaRepository){
        this.musicaRepository = musicaRepository;
    }

    public void primerosDiez(){
        List<Musica> musicas = musicaRepository.obtenMusicas();
        System.out.println(musicas.size());
        musicas.stream()
        .limit(10)
        .forEach(musica-> System.out.println(musica));
    }
    
}
