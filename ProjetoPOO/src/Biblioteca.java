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

        Jogo bloodborne = new Jogo("Bloodborne", "Soulslike e horror", 50);
        bloodborne.setConquista("Father Gascoigne foi derrotado", "Parabens! Você derrotou o primeiro BOSS.", 15);
        bloodborne.setConquista("Você morreu 200 vezes", "Não se preocupe é normal", 30);
        bloodborne.setConquista("Oh! Good Hunter", "Parabens! Você terminou o jogo", 100);

        loja = new Loja();
        loja.addJogo(bloodborne);


        AlbumMusical albumDoom = new AlbumMusical("Álbum Doom", "Album do jogo Doom", 30);
        albumDoom.setMusica("The Only Thing They Fear Is You");
        albumDoom.setMusica("BFG Division");
        albumDoom.setMusica("Metahook");

        loja.addAlbum(albumDoom);

        AlbumMusical albumBloodborne = new AlbumMusical("Bloodborne Original Soundtrack", "Album do jogo Bloordborne", 30);
        albumBloodborne.setMusica("Omen");
        albumBloodborne.setMusica("The Night Unfurls");
        albumBloodborne.setMusica("Hunter's Dream");
        albumBloodborne.setMusica("The Hunter");
        albumBloodborne.setMusica("Cleric Beast");
        albumBloodborne.setMusica("Blood-starved Beast");
        albumBloodborne.setMusica("Watchers");
        albumBloodborne.setMusica("Hail The Nightmare");
        albumBloodborne.setMusica("Darkbeast");
        albumBloodborne.setMusica("The Witch Of Hemwick");
        albumBloodborne.setMusica("Rom, The Vacuous Spider");
        albumBloodborne.setMusica("Moonlit Melody");

        loja.addAlbum(albumBloodborne);

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
