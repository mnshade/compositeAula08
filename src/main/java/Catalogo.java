public abstract class Catalogo {

    public void add(Catalogo catalogo){
        throw new UnsupportedOperationException("Não é possível adicionar");
    }
    public void remove(Catalogo catalogo){
        throw new UnsupportedOperationException("Não é possível remover");
    }
    public String getNome(){
        throw new UnsupportedOperationException("Não é possível retornar nome");
    }
    public double getPreco(){
        throw new UnsupportedOperationException("Não é possível retornar preço");
    }
    public void print(){
        throw new UnsupportedOperationException("Não é possível printar.");
    }
}