import java.util.ArrayList;
import java.util.List;

public class Jogo extends Produto {

    private int Progresso = 0;
    private int HorasJogadas = 0;

    private List<Conquista> conquistas = new ArrayList<Conquista>();

    public Jogo(String nome, String descricao, float preco) {

        super(nome, descricao, preco);
    }
    
    public void Jogar(int horasJogadas){
        if (Progresso <= 100) {
            Progresso += horasJogadas;
        }
        this.HorasJogadas += horasJogadas;
    }

    public void setConquista(String nome, String descricao, int progressoAObter){
        Conquista novaConquista = new Conquista(nome, descricao, progressoAObter);
        conquistas.add(novaConquista);
    }
}
