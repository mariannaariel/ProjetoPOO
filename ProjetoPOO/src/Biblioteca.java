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

        loja.addJogo(bloodborne);

        Jogo ghost = new Jogo("Ghost Of Tsushima", " A história acompanha Jin Sakai, um samurai que precisa proteger a Ilha de Tsushima durante a primeira invasão mongol do Japão.", 50);
        bloodborne.setConquista("Fashion", "Obtenha 30 peças de equipamentos cosméticos", 15);
        bloodborne.setConquista("Estudante", "Aprenda as posturas de combate da Pedra, da Água, do Vento e da Lua", 30);
        bloodborne.setConquista("Libertação", "Liberte toda a ilha de Tsushima", 100);

        loja.addJogo(ghost);

        
        Jogo undertale = new Jogo("Undertale", " Undertale se passa em Underground (em tradução livre, uma enorme caverna subterrânea para onde monstros, que uma vez viviam harmoniosamente com os humanos na superfície, foram banidos depois de perder uma guerra contra a humanidade.", 50);
        undertale.setConquista("Boa Sorte", "Você chegou no último ponto de salvamento antes do jogo terminar", 100);
        undertale.setConquista("Dutututu", "Você encontrou o SAMS", 80);
        undertale.setConquista("Que piada horrível", "Você ouviu a ideia do papyrus", 50);

        loja.addJogo(undertale);
        
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

        AlbumMusical albumGhost = new AlbumMusical("Ghost of Tsushima Original Soundtrack", "Album do jogo Ghost Of Tsushima", 30);
        albumGhost.setMusica("The Way of the Ghost");
        albumGhost.setMusica("Jin Sakai");
        albumGhost.setMusica("Komoda Beach");
        albumGhost.setMusica("The Way of the Samurai");
        albumGhost.setMusica("Lord Shimura");
        albumGhost.setMusica("No Mercy");

        loja.addAlbum(albumGhost);




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
