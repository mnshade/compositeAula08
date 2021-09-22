public class Produto extends Catalogo{
    private String nome;
    private double preco;
    public Produto (String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    @Override
    public String getNome() {
        return  this.nome;
    }
    @Override
    public double getPreco() {
        return this.preco;
    }
    @Override
    public void print(){
        System.out.println("Nome do produto: "+nome+" e preço: "+preco);
    }
}