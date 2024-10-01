public class Baralho {
    // atributos
    private Carta[] cartas;

    public Baralho() {
        this.cartas = new Carta[52];
        int i = 0;
        for (int naipe = 1; naipe <= 4; naipe++) {
            for (int valor = 1; valor <= 13; valor++) {
                this.cartas[i++] = new Carta(valor, naipe);
            }
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.cartas.length; i++) {
            s += this.cartas[i] + " ";
        }
        return s;
    }

    public void embaralhar() {
        // repete o processo 200 vezes, pra ficar bem embaralhado :)
        for (int i = 0; i < 200; i++) {
            // escolhe uma carta aleatória
            int j = (int) (Math.random() * this.cartas.length);
            // troca essa carta de lugar com a primeira
            Carta temp = this.cartas[0];
            this.cartas[0] = this.cartas[j];
            this.cartas[j] = temp;
        }
    }
}
