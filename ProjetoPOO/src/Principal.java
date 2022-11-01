public class Principal {
    public static void main(String[] args) {

        Jogador teste = new Jogador("A", "1");
        Sessao sesteste = new Sessao();
        sesteste.cadastrarPlayer("tata", "1");
        System.out.println(teste.confereSenha("1"));

    }
}
