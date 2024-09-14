public class Main {
    public static void main(String[] args) throws Exception {

        int op = -1;
        do {
            op = Entrada.leiaInt("Escolha uma opção: \n 1- Reservatório de água\n 2- Ônibus\n 3- Caça letras\n 0- Sair");
            int op2;
            if (op == 1) {
                ReservatorioAgua res = new ReservatorioAgua(500,100);
                do {
                    double quantidade;
                    op2 = Entrada.leiaInt("Escolha uma opção: \n1-Encher \n2-Esvaziar\n3-Quantidade atual\n0-Voltar");
                    if (op2 == 1) {
                        quantidade = Entrada.leiaDouble("Quantos litros quer adicionar?");
                        res.encher(quantidade);
                    }
                    else if (op2 == 2) {
                        quantidade = Entrada.leiaDouble("Quantos litros quer remover?");
                        res.esvaziar(quantidade);
                    }
                    else if (op2 == 3) {
                        System.out.println(res.getQntdAtual());
                    }
                } while (op2 != 0);
            }
                if (op == 2) {
                    OnibusUrbano bus = new OnibusUrbano(5.0, 40);
                    do {
                        int qt;
                        op2 = Entrada.leiaInt("Escolha uma opção: \n1- Embarcar 1 passageiro \n2- Embarcar mais de um passageiro" +
                         "\n3- Desembarcar 1 passageiro\n4- Desembarcar mais de um passageiro \n5- Quantidade de passageiros " +
                        "\n6- Valor em caixa \n0-Voltar ");
                        if (op2 == 1){
                            bus.entraPassageiro();
                        }
                        else if(op2 == 2){
                            qt = Entrada.leiaInt("Quantos passageiros?");
                            bus.entraPassageiro(qt);
                        }
                        else if(op2 == 3){
                            bus.saiPassageiro();
                        }
                        else if(op2 == 4){
                            qt = Entrada.leiaInt("Quantos passageiros?");
                            bus.saiPassageiro(qt);
                        }
                        else if(op2 == 5){
                            System.out.println("Quantidade de passageiros: " + bus.getTotalPassageirosAtual());
                        }
                        else if(op2 == 6){
                            System.out.println(bus.getTotal());
                        }
                    } while (op2 != 0);
                }
                if (op == 3){
                    CacaLetras forca = new CacaLetras();
                    do {
                        op2 = Entrada.leiaInt("Escolha uma opção: \n1- Mostrar palavra \n2- Adivinhar letra \n3- Tentativas \n0- Sair");
                        if (op2 == 1){
                            forca.mostraPalavra();
                        }
                        else if(op2 == 2){
                            char letra = Entrada.leiaChar("Digite uma letra: ");
                            forca.pedeLetra(letra);
                        }
                        else if(op2 == 3){
                            System.out.println(forca.mostraNumeroTentativas());
                        }
                        
                    } while (op2 != 0);
                }

            
        } while (op != 0);
        System.exit(0);
    }
}
