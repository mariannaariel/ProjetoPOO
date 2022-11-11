public class Conquista {

    private String nome;
    private String descricao;
    private int progressoAObter;

    public Conquista(String nome, String descricao, int progressoAObter){
        this.nome = nome;
        this.descricao = descricao;
        this.progressoAObter = progressoAObter;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getProgressoAObter() {
        return progressoAObter;
    }
    public void setProgressoAObter(int progressoAObter) {
        this.progressoAObter = progressoAObter;
    }

}