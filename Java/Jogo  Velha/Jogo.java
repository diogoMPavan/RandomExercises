public class Jogo {

    private char[][] tabuleiro = new char[3][3];
    private int jogador;
    private char[] simbolo = { 'X', 'O' };

    private int TrocaJogador() {
        if (jogador == 0) {
            jogador = 1;
        } else {
            jogador = 0;
        }
        return jogador;
    }

    public void Jogar(int posicao) {
        if (posicao > 0 && posicao < 10) {
            int jog = TrocaJogador();
            if (posicao == 1 && tabuleiro[0][0] != simbolo[jog])
                tabuleiro[0][0] = simbolo[jog];

            else if (posicao == 2 && tabuleiro[0][1] != simbolo[jog])
                tabuleiro[0][1] = simbolo[jog];

            else if (posicao == 3 && tabuleiro[0][2] != simbolo[jog])
                tabuleiro[0][2] = simbolo[jog];

            else if (posicao == 4 && tabuleiro[1][0] != simbolo[jog])
                tabuleiro[1][0] = simbolo[jog];

            else if (posicao == 5 && tabuleiro[1][1] != simbolo[jog])
                tabuleiro[1][1] = simbolo[jog];

            else if (posicao == 6 && tabuleiro[1][2] != simbolo[jog])
                tabuleiro[1][2] = simbolo[jog];

            else if (posicao == 7 && tabuleiro[2][0] != simbolo[jog])
                tabuleiro[2][0] = simbolo[jog];

            else if (posicao == 8 && tabuleiro[2][1] != simbolo[jog])
                tabuleiro[2][1] = simbolo[jog];

            else if (posicao == 9 && tabuleiro[2][2] != simbolo[jog])
                tabuleiro[2][2] = simbolo[jog];
        } else {
            Mensagem.aviso("Posição Inválida");
        }
    }

    public void MostraTabuleiro() {
        System.out.println("- - - - ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("- - - - ");
        ConfereTabuleiro();
    }

    private void ConfereTabuleiro() {
        if (tabuleiro[0][0] == simbolo[jogador] && tabuleiro[0][1] == simbolo[jogador]
                && tabuleiro[0][2] == simbolo[jogador]) {
            Mensagem.aviso("Você ganhou!");
        } else if (tabuleiro[1][0] == simbolo[jogador] && tabuleiro[1][1] == simbolo[jogador]
                && tabuleiro[1][2] == simbolo[jogador]) {
            Mensagem.aviso("Você ganhou!");
        } else if (tabuleiro[2][0] == simbolo[jogador] && tabuleiro[2][1] == simbolo[jogador]
                && tabuleiro[2][2] == simbolo[jogador]) {
            Mensagem.aviso("Você ganhou!");
        } else if (tabuleiro[0][0] == simbolo[jogador] && tabuleiro[1][0] == simbolo[jogador]
                && tabuleiro[2][0] == simbolo[jogador]) {
            Mensagem.aviso("Você ganhou!");
        } else if (tabuleiro[0][1] == simbolo[jogador] && tabuleiro[1][1] == simbolo[jogador]
                && tabuleiro[2][1] == simbolo[jogador]) {
            Mensagem.aviso("Você ganhou!");
        } else if (tabuleiro[0][2] == simbolo[jogador] && tabuleiro[1][2] == simbolo[jogador]
                && tabuleiro[2][2] == simbolo[jogador]) {
            Mensagem.aviso("Você ganhou!");
        } else if (tabuleiro[0][0] == simbolo[jogador] && tabuleiro[1][1] == simbolo[jogador]
                && tabuleiro[2][2] == simbolo[jogador]) {
            Mensagem.aviso("Você ganhou!");
        } else if (tabuleiro[0][2] == simbolo[jogador] && tabuleiro[1][1] == simbolo[jogador]
                && tabuleiro[2][0] == simbolo[jogador]) {
            Mensagem.aviso("Você ganhou!");
        }

    }

    public void Reiniciar(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tabuleiro[i][j] = ' ';
            }
        }
    }
}