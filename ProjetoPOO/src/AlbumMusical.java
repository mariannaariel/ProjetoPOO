import java.util.ArrayList;
import java.util.List;

public class AlbumMusical extends Produto {

    private List<Musica> musicas = new ArrayList<Musica>();

    public AlbumMusical(String nome, String descricao, float preco) {
        super(nome, descricao, preco);
    }

    public void setMusica(String nome){
        Musica musica = new Musica(nome);
        musicas.add(musica);
    }
    public List<Musica> getMusicas() {
        return musicas;
    }


}
