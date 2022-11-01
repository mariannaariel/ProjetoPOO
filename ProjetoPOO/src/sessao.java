import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private List<Jogador> playersCadastrados;
    private Jogador playerAtual;

    public sessao(){
        playersCadastrados = new ArrayList<>();
    }

    public void cadastrarPlayer(String nome, String senha){
        playersCadastrados.add(new Jogador(nome, senha));
    }

    public void iniciarSessao(String nome, String senha){
        for (Jogador jogador : playersCadastrados) {
            if (jogador.getNome().equals(nome)) {
                
            }
        }
    }
}
