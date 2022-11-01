import java.util.ArrayList;

public class Jogador {
    
    private String nome;
    private String senha;
    private List<Jogo> jogosPessoais;
    private List<AlbumMusical> albunsPessoais;
    private int reputacao;
    private float saldoTotal;

    public Jogador(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
        jogosPessoais = new ArrayList<Jogo>();
        albunsPessoais = new ArrayList<AlbumMusical>();
        reputacao = 0;
        saldoTotal = 0;
    }

    public Boolean confereSenha(String senha){
        return this.senha.equals(senha)
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogo> getJogosPessoais() {
        return jogosPessoais;
    }

    public List<AlbumMusical> getAlbunsPessoais() {
        return albunsPessoais;
    }

    public int getReputacao() {
        return reputacao;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }

}