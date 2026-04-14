package trabalho;

public class celular {

    private String marca;
    private String modelo;
    private bateria bateria;

    public celular() {
    }

    public celular(String marca, String modelo, bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public bateria getBateria() {
        return bateria;
    }

    public void setBateria(bateria bateria) {
        this.bateria = bateria;
    }


    @Override
    public String toString() {
        return "celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria.toString() +
                '}';
    }

    public void usarCelular(int consumo){
        this.bateria.gastarBateria(consumo);
    }

    public void carregarCelular() {
        this.bateria.carregarBateria();
        System.out.println("Carga completa");
    }

}
