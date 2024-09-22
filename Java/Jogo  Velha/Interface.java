public class Interface {

    Jogo jv = new Jogo();

    public void Jogar(){
        int op;
        do {
            op = Entrada.leiaInt("Escolha uma opção: \n1- Jogar \n2- Mostrar tabuleiro \n3- Reiniciar \n0- Sair");
            if (op == 1){
                int pos = Entrada.leiaInt("Posição: ");        
                jv.Jogar(pos);
            }
            else if (op == 2){
                jv.MostraTabuleiro();
            }
            else if(op == 3){
                jv.Reiniciar();
            }
        } while (op != 0);
        System.exit(0);
    }
}
