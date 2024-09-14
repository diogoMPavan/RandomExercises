public class CacaLetras {
    private String[] palavras = {
            "casa", "carro", "computador", "telefone", "livro",
            "janela", "mesa", "cadeira", "floresta", "rio",
            "sol", "lua", "estrela", "mar", "montanha",
            "cidade", "paisagem", "viagem", "amigo", "cachorro",
            "trabalho", "escola", "aprendizado", "felicidade", "amor",
            "tempo", "saturno", "sonho", "chocolate", "guitarra"
    };
    private char[] palavraAcertos;
    private int indexEscolhido;
    private int numeroTentativas;

    // Constructor
    public CacaLetras() {
        this.indexEscolhido = (int) (Math.random() * (30)) + 0;
        this.palavraAcertos = new char[this.palavras[this.indexEscolhido].length()];
        for (int i = 0; i < this.palavras[this.indexEscolhido].length(); i++) {
            this.palavraAcertos[i] = '_';
        }
    }

    // Methods
    public void pedeLetra(char letra) {
        if (!this.palavraEstaCompleta()) {
            for (int i = 0; i < this.palavras[this.indexEscolhido].length(); i++) {
                if (Character.toLowerCase(this.palavras[this.indexEscolhido].charAt(i)) == Character.toLowerCase(letra)) {
                    this.palavraAcertos[i] = letra;
                }
            }
            this.numeroTentativas++;
        }
    }

    public void mostraPalavra() {
        System.out.print("Palavra atual: ");
        Mensagem.informacao(new String(this.palavraAcertos));
        //return new String(this.palavraAcertos);
    }

    public int mostraNumeroTentativas() {
        System.out.print("Tentativas até agora: ");
        return this.numeroTentativas;
    }

    public boolean palavraEstaCompleta() {
        for (int i = 0; i < this.palavras[this.indexEscolhido].length(); i++) {
            if (this.palavraAcertos[i] == '_') {
                return false;
            }
        }
        return true;
    }

}
