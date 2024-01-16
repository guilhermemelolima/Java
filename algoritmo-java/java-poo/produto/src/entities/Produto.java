package entities;


public class Produto{

    public String nome;
    public double preco;
    public int quantidade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double ValorTotalEmEstoque(){
        return preco * quantidade;
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void AddProduto(int quantidade){
        setQuantidade(getQuantidade() + quantidade);
    }

    public void RemoveProduto(int quantidade){
        setQuantidade(getQuantidade() - quantidade);
    }

    public String toString(){
        return nome 
        + ", $ " + String.format("%.2f", preco)
        + ", " + quantidade
        + " unidades, valor total em estoque: "
        + String.format("%.2f", ValorTotalEmEstoque());
    }

}
