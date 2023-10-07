package org.example;

public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private String matricula;
    private String cpf;

    public Aluno(int id, String nome, int idade, String matricula, String cpf) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.cpf = cpf;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        // Verifica se a matrícula é nula
        if (matricula == null) {
            throw new IllegalArgumentException("Matrícula não pode ser nula");
        }

        // Verifica se a matrícula possui exatamente 11 dígitos
        if (matricula.length() != 11) {
            throw new IllegalArgumentException("A matrícula deve conter exatamente 11 dígitos");
        }

        // Verifica se a matrícula contém apenas dígitos (0-9)
        if (!matricula.matches("^[0-9]*$")) {
            throw new IllegalArgumentException("A matrícula deve conter apenas dígitos");
        }

        this.matricula = matricula;
    }



    public String getCpf() {
            return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
