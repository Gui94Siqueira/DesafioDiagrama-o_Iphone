public class App {
    public static void main(String[] args) throws Exception {

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar();
        telefone.atender();
        telefone.correioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.adicionarAba();

        ReprodutorMusica player = new ReprodutorMusica();
        player.tocar();
        player.pausar();
        player.selecionarMusica();
        
    }
}
