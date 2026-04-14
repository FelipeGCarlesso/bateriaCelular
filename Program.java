import trabalho.bateria;
import trabalho.celular;

void main() {

    bateria bateria = new bateria(60, 4000);
    celular celular = new celular("Xiaomi", "Japones", bateria);

    celular.carregarCelular();
    celular.usarCelular(100);

    celular.carregarCelular();
    celular.usarCelular(20);

    celular.usarCelular(-10);

    celular.usarCelular(90);

    System.out.println(celular);


}