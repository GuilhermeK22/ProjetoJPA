package testes;

import org.junit.Test;

import domain.Matricula;

import dao.IMatriculaDAO;
import dao.MatriculaDAO;
import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {
    private IMatriculaDAO matriculaDAO;

    public MatriculaTest() {
        matriculaDAO = new MatriculaDAO();
    }
    @Test
    public void cadastrar() {
        Matricula mat = new Matricula();
        mat.setCodigo("A1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat = matriculaDAO.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());
    }
}
