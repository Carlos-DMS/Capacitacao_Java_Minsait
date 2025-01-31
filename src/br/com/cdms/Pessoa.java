package br.com.cdms;

public class Pessoa {
    //atributos
    private String nome;
    private String endereco;
    private String email;

    //construtor(es)

    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    //sobrecarga de métodos
    public Pessoa(String email, String nome) {
        this.email = email;
        this.nome = nome;
        this.endereco = "-";
    }

    //getters e setters

    public String getNome() {
        //Posso criar uma auditoria para ver quem está pegando o nome
        return nome;
    }

    public void setNome(String nome) {
        //Posso criar uma auditoria para ver quem está alterando o nome
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
     *     <li><strong>3</strong> - Dormir</li>
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
            case 3:
                dormir();
                break;
            default:
                System.out.println(nome + ", ficar de boa");
                break;
        }
    }

    private void dormir() {
        System.out.println(nome + ", ir dormir");
    }
}
