package entities;

public class Funcionario {
    
    private String nome;
    private double salarioBruto;
    private double desconto;

    public String getNome(){ 
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalarioBruto(){
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public double getDesconto(){
        return desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public Funcionario(String nome, double salarioBruto, double desconto){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.desconto = desconto;
    }

    public double salarioLiquido(){
        return getSalarioBruto() - getDesconto();
    }

    public void aumentoSalario(double porcentagem){
        double automento = getSalarioBruto() * (porcentagem / 100);
        setSalarioBruto(getSalarioBruto() + automento) ;
    }

    public String toString(){
        return "\nNome: " + getNome()
        + "\n Salário liquido: " + salarioLiquido();
    }
}
