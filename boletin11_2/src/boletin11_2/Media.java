/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Media {

    private String nom;
    private String autor;
    private int duradaSegons;

    public Media() {
    }

    public Media(String nom) {
        this.nom = nom;
    }

    public Media(String autor, int duradaSegons) {
        this.autor = autor;
        this.duradaSegons = duradaSegons;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuradaSegons() {
        return duradaSegons;
    }

    public void setDuradaSegons(int duradaSegons) {
        this.duradaSegons = duradaSegons;
    }

}
