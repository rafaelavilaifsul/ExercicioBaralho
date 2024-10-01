class Valor {
    private int numero;

    public Valor(int numero) {
        this.numero = numero;
    }

    public String toString() {
        if (this.numero == 1) { // ás
            return "A";
        } else if (this.numero == 11) { // valete
            return "J";
        } else if (this.numero == 12) { // dama
            return "Q";
        } else if (this.numero == 13) { // rei
            return "K";
        } else { // 2 a 10
            return "" + this.numero;
        }

    }
}