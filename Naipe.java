class Naipe {
    private int numero;

    public Naipe(int numero) {
        this.numero = numero;
    }

    public String toString() {
        if (this.numero == 1) { // ouros
            return "\u2666";
        } else if (this.numero == 2) { // espadas
            return "\u2660";
        } else if (this.numero == 3) { // copas
            return "\u2665";
        } else { // paus
            return "\u2663";
        }
    } 
}