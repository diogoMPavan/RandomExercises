public class ReservatorioAgua {
    private int capacidade;
    private double qntdAtual;

    // Constructor
    public ReservatorioAgua(int capacidade, double qntdAtual) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade do reservatório precisa ser maior que 0.");
        }

        if (qntdAtual < 0) {
            throw new IllegalArgumentException("A quantidade atual do reservatório precisa ser maior ou igual a 0.");
        }

        this.capacidade = capacidade;
        this.qntdAtual = qntdAtual;
    }

    public ReservatorioAgua(int capacidade) {
        if (capacidade < 0) {
            throw new IllegalArgumentException("A capacidade do reservatório precisa ser maior que 0.");
        }
        this.capacidade = capacidade;
        this.qntdAtual = 0;
    }

    // Getters and Setters
    public int getCapacidade() {
        return this.capacidade;
    }

    public double getQntdAtual() {
        return this.qntdAtual;
    }

    // Methods
    public void encher(double qntd) {
        if (qntd <= 0) {
            Mensagem.erro("Esse valor não é válido!");
        } else if ((this.qntdAtual + qntd) > this.capacidade) {
            Mensagem.erro(
                    "A quantidade adicionada excede a capacidade máxima do reservatório. Atualmente há capacidade para "
                            + (this.capacidade - this.qntdAtual) + " litro(s).");
        } else {
            this.qntdAtual += qntd;
            System.out.println(qntd + " litros adicionados ao reservatório!");
        }
    }

    public void esvaziar(double qntd) {
        if (qntd <= 0) {
            Mensagem.erro("Esse valor não é válido!");
        } else if ((this.qntdAtual - qntd) < 0) {
            Mensagem.erro("A quantidade retirada excede a litragem atual do reservatório. Atualmente há "
                    + (this.qntdAtual) + " litro(s).");
        } else {
            this.qntdAtual -= qntd;
            Mensagem.informacao(qntd + " litros retirados do reservatório!");
        }
    }

}