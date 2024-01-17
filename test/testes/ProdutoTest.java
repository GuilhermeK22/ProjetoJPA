package testes;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Curso;
import domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {
    private IProdutoDAO produtoDAO;
    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }
    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("PRODUTO DESCRIÇÃO");
        produto.setNome("Produto 1");
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
