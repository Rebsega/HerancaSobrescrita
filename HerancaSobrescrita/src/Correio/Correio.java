package Correio;

public class Correio extends Central{

    /**
     * 2 metodos diferentes com sobreescrita
     * 2 metodos diferentes com sobrecarga
     * nomeDoMetodos(parametro, parametro)
     */

    public Correio(){}

    void enviarMsg(String mensagem, String usuario) {
        System.out.println("Enviando "+mensagem+ " para "+usuario);
    }

    void enviarMsg(String mensagem, String usuario, Boolean isAdm) {
        System.out.println("Enviando "+mensagem+ " para o ADMIN "+ usuario);
    }

    @Override
    public void enviarEncomenda(String endereco, String cep){
        System.out.println("Enviando para o endereco "+endereco+ " no cep "+cep+ " dentro dos correios");
    }
}
