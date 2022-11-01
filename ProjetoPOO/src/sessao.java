import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private List<Jogador> playersCadastrados;
    private Jogador playerAtual;

    public Sessao(){
        playersCadastrados = new ArrayList<Jogador>();
    }

    public void cadastrarPlayer(String nome, String senha){

        if (playersCadastrados.isEmpty()) {
            playersCadastrados.add(new Jogador(nome, senha));
        } else {

            Boolean jaExiste = false;
            for (Jogador jogador : playersCadastrados) {
                if (jogador.getNome().equals(nome)) {
                    System.out.tprintln("Já existe um player com este nome. Escolha outro!");
                    jaExiste = true;
                }
            }

            if (jaExiste.equals(false)) {
                playersCadastrados.add(new Jogador(nome, senha));
            }

        }
        
    }

    public void login(String nome, String senha){
        for (Jogador jogador : playersCadastrados) {
            if (jogador.getNome().equals(nome)) {
                if (jogador.confereSenha(senha)) {
                    playerAtual = jogador;
                }
            }

        }
    }

    public void logout(){
        playerAtual = null;
    }


}
