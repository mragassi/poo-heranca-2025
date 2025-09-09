package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PessoaJuridica{

    //private String nome;
    //private String endereco;
    //private LocalDate dataCriacao;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataCriacao = LocalDate.now();
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
/*

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
*/
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String exibirInformacoes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "--- Informações da Pessoa Jurídica ---\n" + 
                "Nome: " + this.getNome() + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "CNPJ: " + this.getCnpj() + "\n" +
                "--------------------------------------";
    }

}


