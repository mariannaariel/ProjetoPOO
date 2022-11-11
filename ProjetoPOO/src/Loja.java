import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtoDisponiveis;

    public Loja(){
        produtoDisponiveis = new ArrayList<Produto>();
    }

    public void addJogo(Jogo jogo) {
        produtoDisponiveis.add(jogo);
    }

    public void addAlbum(AlbumMusical albo) {
        produtoDisponiveis.add(albo);
    }
}
