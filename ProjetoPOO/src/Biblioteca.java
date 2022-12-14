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
        ghost.setConquista("Fashion", "Obtenha 30 peças de equipamentos cosméticos", 15);
        ghost.setConquista("Estudante", "Aprenda as posturas de combate da Pedra, da Água, do Vento e da Lua", 30);
        ghost.setConquista("Libertação", "Liberte toda a ilha de Tsushima", 100);

        loja.addJogo(ghost);

        
        Jogo undertale = new Jogo("Undertale", " Undertale se passa em Underground (em tradução livre, uma enorme caverna subterrânea para onde monstros, que uma vez viviam harmoniosamente com os humanos na superfície, foram banidos depois de perder uma guerra contra a humanidade.", 50);
        undertale.setConquista("Boa Sorte", "Você chegou no último ponto de salvamento antes do jogo terminar", 100);
        undertale.setConquista("Dutututu", "Você encontrou o SANS", 80);
        undertale.setConquista("Que piada horrível", "Você ouviu a ideia do papyrus", 50);

        loja.addJogo(undertale);

        Jogo deltarune = new Jogo("Deltarune", " O jogador controla um humano, Kris, em um mundo onde os monstros vivem na superfície da Terra. Kris e uma colega de classe chamada Susie caem da Terra em um lugar chamado Mundo das Trevas", 50);
        deltarune.setConquista("Finalmente", "Você levantou para ir pra escola", 15);
        deltarune.setConquista("Fluffy Boy", "Você conheceu Ralsei", 30);
        deltarune.setConquista("Susie ", "Você fez um trabalho em grupo com susie", 70);

        loja.addJogo(deltarune);

        Jogo nier = new Jogo("Nier Replicant", "O ano é 3465, Mostros das sombras e uma doença fatal ameaçam a sobrevivência da humanidade.Enquanto um mundo devastado tenta se reconstruir, um jovem faz uma promessa dolorosa para sua irmã, e três companheiros improváveis revelarão o verdadeiro custo da verdade.", 70);
        nier.setConquista("O livro da lenda", "Grimoire Weiss se juntou ao seu grupo", 50);
        nier.setConquista("Combo Master", "Faça um combo de 100 hits", 100);
        nier.setConquista("Obrigada", "Veja o terceiro final (Final C)", 200);

        loja.addJogo(nier);


        
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

        AlbumMusical albumUndertale = new AlbumMusical("Undertale Soundtrack", "Album do Undertale", 30);
        albumUndertale.setMusica("Once Upon a Time");
        albumUndertale.setMusica("Start Menu");
        albumUndertale.setMusica("Your Best Friend");
        albumUndertale.setMusica("Fallen Down");
        albumUndertale.setMusica("Ruins");
        albumUndertale.setMusica("Uwa!! So Temperate");
        albumUndertale.setMusica("Anticipation");
        albumUndertale.setMusica("Unnecessary Tension");
        albumUndertale.setMusica("Enemy Approaching");

        loja.addAlbum(albumUndertale);

        AlbumMusical albumDeltarune = new AlbumMusical("Deltarune soundtrack", "Album do Deltarune", 30);
        albumUndertale.setMusica("Field of Hopes and Dreams");
        albumUndertale.setMusica("Vs. Susie");
        albumUndertale.setMusica("THE WORLD REVOLVING");
        albumUndertale.setMusica("Empty Town");
        albumUndertale.setMusica("Lancer");
        albumUndertale.setMusica("You Can Always Come Home");

        loja.addAlbum(albumDeltarune);

        AlbumMusical albumNier = new AlbumMusical("NieR Replicant ver.1.22474487139... Original Soundtrack", "Álbum do Nier", 30);
        albumNier.setMusica("ShadowLord");
        albumNier.setMusica("Gods Bound By Rules");
        albumNier.setMusica("Kaine Salvation");
        albumNier.setMusica("Song of the Ancients");
        albumNier.setMusica("The Ultimate Weapon");


        loja.addAlbum(albumNier);

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
