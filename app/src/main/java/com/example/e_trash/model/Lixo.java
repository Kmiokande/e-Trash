package com.example.e_trash.model;

import com.example.e_trash.helper.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;

public class Lixo {
    private String id;
    private String idUsuario;
    private String nome;
    private String informacoes;
    private Double latitude;
    private Double longitude;
    private String endereco;
    private String caminhoFoto;

    public Lixo() {
        DatabaseReference firebaseRef = ConfiguracaoFirebase.getFirebase();
        DatabaseReference lixoRef = firebaseRef.child("lixos");
        String idLixo = lixoRef.push().getKey();
        setId( idLixo);
    }
    public boolean salvar(){
        DatabaseReference firebaseRef = ConfiguracaoFirebase.getFirebase();
        DatabaseReference lixosRef = firebaseRef.child("lixos")
                .child(getIdUsuario())
                .child(getId());
        lixosRef.setValue(this);
        return true;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }
}
