public class OnibusUrbano {
    private double valorPassagem;
    private double totalPassagem;
    private int totalPassageirosAtual;
    private int totalLugares;

    // --Construtores
    public OnibusUrbano() {
    }

    public OnibusUrbano(double valorPassagem, int totalLugares) {
        if (valorPassagem < 0){
            throw new IllegalArgumentException("O valor da passagem deve ser maior que 0");
        }
        if (totalLugares < 0){
            throw new IllegalArgumentException("O ônibus deve ter ao menos um lugar");
        }
        this.valorPassagem = valorPassagem;
        this.totalLugares = totalLugares;
    }
    // --

    // --Getters and Setters
    public double getTotal() {
        return this.totalPassagem;
    }
    
    public int getTotalPassageirosAtual() {
        return totalPassageirosAtual;
    }

    public void setTotalLugares(int totalLugares) {
        if (totalLugares > 0 && totalLugares <= 40) {
            this.totalLugares = totalLugares;
        }
    }

    public void setValorPassagem(double valorPassagem) {
        if (valorPassagem > 0) {
            this.valorPassagem = valorPassagem;
        }
    }
    // --

    // --Métodos
    public void entraPassageiro(int numeroPassageiros) {
        if (this.totalLugares > (this.totalPassageirosAtual + numeroPassageiros)) {
            this.totalPassageirosAtual += numeroPassageiros;
            this.totalPassagem += this.valorPassagem * numeroPassageiros ;
        } else {
            Mensagem.informacao("Ônibus lotado");
        }
    }
    
    public void entraPassageiro() {
        if (this.totalLugares > (this.totalPassageirosAtual + 1)) {
            this.totalPassageirosAtual++;
            this.totalPassagem += this.valorPassagem;
        } else {
            Mensagem.informacao("Ônibus lotado");
        }
    }

    public void saiPassageiro(int numeroPassageiros) {
        if (this.totalPassageirosAtual >= numeroPassageiros) {
            this.totalPassageirosAtual -= numeroPassageiros;
        } else {
            Mensagem.informacao("Não há mais passageiros");
        }
    }
    
    public void saiPassageiro() {
        if (this.totalPassageirosAtual > 0) {
            this.totalPassageirosAtual--;
        } else {
            Mensagem.informacao("Não há mais passageiros");
        }
    }
    // --

}
