package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String tituto;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTituto() {
        return tituto;
    }

    public void setTituto(String tituto) {
        this.tituto = tituto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "tituto='" + tituto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
