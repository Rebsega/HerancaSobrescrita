package Correio;

public class Main {
    public static void main(String[] args) {
        Correio msg1 = new Correio();
        Central central = new Central();
        msg1.enviarMsg("Mensagem para Barbara", "Barbara");
        msg1.enviarMsg("Mensagem para Hilario","Hilario",true);

        msg1.enviarEncomenda("rua rua","1231");
        central.enviarEncomenda("bairro bairro","9999");
    }
}
