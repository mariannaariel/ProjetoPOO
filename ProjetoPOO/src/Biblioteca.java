public class Biblioteca {

    Sessao sessaoAtual;
    Loja loja;
    public Biblioteca(){
        Jogo doom = new Jogo("Doom", "Jogo de ação e aventura", 40);
        doom.setConquista("Primeiro chefão derrotado!", "Parabens! Você derrotou o primeiro BOSS.", 15);
        doom.setConquista("Metade do jogo concluido!", "Parabens! Você chegou na metade do jogo.", 50);
        doom.setConquista("JOGO FINALIZADO!", "Parabens! Você derrotou o BOSS final e zerou o jogo.", 100);

        loja = new Loja();
        loja.addJogo(doom);

        AlbumMusical albumDoom = new AlbumMusical("Album Doom", "Album do jogo Doom", 30);
        albumDoom.setMusica("The Only Thing They Fear Is You");
        albumDoom.setMusica("BFG Division");
        albumDoom.setMusica("Metahook");

        loja.addAlbum(albumDoom);

    }

    public void comprarJogo(Jogo jogo){
        if(sessaoAtual.getPlayerLogado() == null){
            System.out.println("Faça login primeiro!");
        } else {
            sessaoAtual.getPlayerLogado().comprarJogo(jogo);
        }

    }

    public void login(String username, String password){
        sessaoAtual.login(username, password);
    }
}
