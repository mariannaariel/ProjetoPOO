public class Produto {
    
    private String nome;
    private String descricao;
    private int id;
    final private float preco;

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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Produto(String nome, String descricao, Float preco) {
        this.nome = nome;
        this.descricao = descricao;

        if(preco < 20){
            this.preco = 20;
        } else {
            this.preco = preco;
        }
        
    }
    public float getPreco() {
        return preco;
    }
    
}