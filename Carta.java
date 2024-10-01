class Carta {
    // atributos
    private Naipe naipe;
    private Valor valor;

    // construtor
    public Carta(int umValor, int umNaipe) {
        this.valor = new Valor(umValor);
        this.naipe = new Naipe(umNaipe);
    }

    // toString
    public String toString() {
        return "" + this.valor + this.naipe;
    }
}