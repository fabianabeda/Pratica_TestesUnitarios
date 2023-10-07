package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AlunoTest {


    @Test
    public void naoDeveAceitarMatriculaComMaisDeOnzeDigitos() {
        Aluno aluno = new Aluno(1, "Fabiana", 35, "52124526256", "00176135625");
        Assertions.assertThrows(IllegalArgumentException.class, () -> aluno.setMatricula("123456789012"));
    }


    @Test
    public void naoDeveAceitarMatriculaNula() {
        Aluno aluno = new Aluno(1, "Fabiana", 35, "52124526256", "00176135625");
        Assertions.assertThrows(IllegalArgumentException.class, () -> aluno.setMatricula(null));
    }

    @Test
    public void naoDeveAceitarMatriculaComCaracteresEspeciais() {
        Aluno aluno = new Aluno(1, "Fabiana", 35, "52124526256", "00176135625");
        Assertions.assertThrows(IllegalArgumentException.class, () -> aluno.setMatricula("12345$678901"));
    }
}