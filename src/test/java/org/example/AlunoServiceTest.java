package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class AlunoServiceTest {
    @InjectMocks
    private AlunoService alunoService;

    @Mock
    private AlunoDAO alunoDAO;

    @Test
    public void NaoPodeCadastrarAlunoComAMesmaMatricula() {
        Aluno alunonovo = new Aluno(1, "Fabiana", 35, "52124526256", "00176135625");
        Mockito.doReturn(true).when(alunoDAO).existeMatriculaAtiva("52124526256"); // Corrija o argumento aqui
        Assertions.assertThrows(IllegalArgumentException.class, () -> alunoService.inserirAluno(alunonovo));
    }


    @Test
    public void NaoPodeCadastrarAlunoComMesmoCPF(){
        Aluno alunonovo = new Aluno(1, "Fabiana", 35, "52124526256", "00176135625");
        Mockito.doReturn(true).when(alunoDAO).existeAlunoComCPF("00176135625");
        Assertions.assertThrows(IllegalArgumentException.class, () -> alunoService.inserirAluno(alunonovo));
    }
    @Test void NaoPodeCadastrarAlunoMenorIdade(){
        Aluno alunonovo = new Aluno(1, "Fabiana", 13, "52124526256", "00176135625");
        Assertions.assertThrows(IllegalArgumentException.class, () -> alunoService.inserirAluno(alunonovo));
    }
}
