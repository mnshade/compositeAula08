import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatalogoTest {
    @Test
    public void testPrint() throws Exception {

        Catalogo camisaMasculina=new Produto("Camisa Simples H", 100.00);

        Catalogo catalogoFeminino = new ProdutoCatalogo("Roupas Femininas");
        Catalogo camisaFemina=new Produto("Camisa Simples M", 165.00);
        Catalogo calcaFemina=new Produto("Calça Simples F", 245.00);
        catalogoFeminino.add(camisaFemina);
        catalogoFeminino.add(calcaFemina);

        Catalogo catalogoKids = new ProdutoCatalogo("Roupas de Criança");
        Catalogo shortKid=new Produto("Short Simples", 40.00);
        Catalogo camisaKid = new Produto("Camisa Ben 10", 60.00);
        catalogoKids.add(shortKid);
        catalogoKids.add(camisaKid);

        Catalogo catalogoPrincipal=new ProdutoCatalogo("Catalogo Principal");
        catalogoPrincipal.add(camisaMasculina);
        catalogoPrincipal.add(catalogoFeminino);
        catalogoPrincipal.add(catalogoKids);

        catalogoPrincipal.print();
    }
}