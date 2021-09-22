import java.util.ArrayList;
public class ProdutoCatalogo extends Catalogo{
    private ArrayList<Catalogo> items=new ArrayList<>();
    private String nome;
    public ProdutoCatalogo(String nome){
        this.nome=nome;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void print(){
        for(Catalogo comp : items)
        {
            comp.print();
        }
    }
    @Override
    public void add(Catalogo catalogo){
        items.add(catalogo);
    }
    @Override
    public void remove(Catalogo catalogo){
        items.remove(catalogo);
    }
}