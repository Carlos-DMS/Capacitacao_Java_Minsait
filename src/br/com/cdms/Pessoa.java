package br.com.cdms;

public class Pessoa {
    //atributos
    String nome;
    String endereco;
    String email;

    //construtor(es)

    //métodos
    public void trabalhar() {
        System.out.println(nome + ", ir para o trabalho");
    }

    public void estudar() {
        System.out.println(nome + ", ir para a escola");
    }

    /**
     * Método lazer
     * @param tipoLazer
     * <ul>
     *     <li><strong>0</strong> - Passear</li>
     *     <li><strong>1</strong> - Malhar</li>
     *     <li><strong>2</strong> - Jogar</li>
     *     <li><strong>Outros</strong> - Ficar de boa</li>
     * </ul>
     */
    public void lazer(int tipoLazer) {
        switch (tipoLazer) {
            case 0:
                System.out.println(nome + ", passear");
                break;
            case 1:
                System.out.println(nome + ", malhar");
                break;
            case 2:
                System.out.println(nome + ", jogar");
                break;
            default:
                System.out.println(nome + ", ficar de boa");
                break;
        }
    }
}
