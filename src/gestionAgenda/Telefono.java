package gestionAgenda;
 class Telefono {
    private String numero;
    private TipoTelefono tipo;

    protected Telefono(String numero, TipoTelefono tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.tipo + ": " + this.numero;
    }
}