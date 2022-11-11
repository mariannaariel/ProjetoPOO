import java.util.Objects;

public class Sessao {
    private Jogador playerLogado;
    private final String nickDefinido = "terra";
    private final String senhaDefinida = "2022";


    public void login(String nome, String senha){

        if (Objects.equals(nickDefinido, nome) && Objects.equals(senhaDefinida, senha)) {
            playerLogado = new Jogador();
    }
    }

    public void jogar(Jogo jogo, int horasJogadas){
        if(playerLogado == null){
            System.out.println("Faça login primeiro!");
        } else{
            jogo.Jogar(horasJogadas);
        }

    }

    public Jogador getPlayerLogado() {
        return playerLogado;
    }


}
