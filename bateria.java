package trabalho;

public class bateria {
    private Integer porcetagemAtual;
    private Integer capacidadeMah;


    public bateria() {
        this.porcetagemAtual = 60;
    }

    public bateria(Integer porcetagemAtual, Integer capacidadeMah) {
        this.porcetagemAtual = porcetagemAtual;
        this.capacidadeMah = capacidadeMah;
    }

    public Integer getPorcetagemAtual() {
        return porcetagemAtual;
    }

    public void setPorcetagemAtual(Integer porcetagemAtual) {
        this.porcetagemAtual = porcetagemAtual;
    }

    public Integer getCapacidadeMah() {
        return capacidadeMah;
    }

    public void setCapacidadeMah(Integer capacidadeMah) {
        this.capacidadeMah = capacidadeMah;
    }

    @Override
    public String toString() {
        return "bateria{" +
                "porcetagemAtual=" + porcetagemAtual +
                ", capacidadeMah=" + capacidadeMah +
                '}';
    }

    public void carregarBateria(){
        this.porcetagemAtual = 100;
    }
    public void gastarBateria(int consumo){
        if (consumo >= this.porcetagemAtual){
            this.porcetagemAtual = 0;
            System.out.println("A bateria está acabando.");
        } else if(consumo < 0){
            System.out.println("não é permitido negativo");
        } else{
            this.porcetagemAtual -= consumo;
        }

    }



}
