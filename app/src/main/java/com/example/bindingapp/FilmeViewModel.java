package com.example.bindingapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FilmeViewModel extends ViewModel {
    private String titulo;
    private Integer ano;
    private MutableLiveData<Integer> likes;
    private MutableLiveData<String> interesse;

    public FilmeViewModel(){
        titulo = "Miranha";
        ano = 2019;
        likes = new MutableLiveData<>();
        interesse = new MutableLiveData<>();
        likes.setValue(0);
    }

    public void setInteresse(){
        if (likes.getValue()<10){
            interesse.setValue("Sem interesse");
        }else if (likes.getValue() >=10 && likes.getValue()< 50){
            interesse.setValue("Despertou interesse");
        }else {
            interesse.setValue("Hypado");
        }
    }

    public void onLike(){
        likes.setValue(likes.getValue()+1);
        setInteresse();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public MutableLiveData<Integer> getLikes() {
        return likes;
    }

    public void setLikes(MutableLiveData<Integer> likes) {
        this.likes = likes;
    }

    public MutableLiveData<String> getInteresse() {
        return interesse;
    }

    public void setInteresse(MutableLiveData<String> interesse) {
        this.interesse = interesse;
    }
}
