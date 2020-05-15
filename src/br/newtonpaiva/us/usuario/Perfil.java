/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.us.usuario;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author leonardo moreira
 */
public class Perfil{
    private Integer id_perfil;
    private Integer id_Usuario;
    private Integer id_lista_amigos;
    private String nom_nick;
    private String des_endereco;

    @Override
    public String toString() {
        return "Perfil{" + "id_perfil=" + id_perfil + ", id_Usuario=" + id_Usuario + ", id_lista_amigos=" + id_lista_amigos + ", nom_nick=" + nom_nick + ", des_endereco=" + des_endereco + ", dta_nascimento=" + dta_nascimento + '}';
    }
    private Date dta_nascimento;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id_perfil);
        hash = 53 * hash + Objects.hashCode(this.id_Usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perfil other = (Perfil) obj;
        if (!Objects.equals(this.id_perfil, other.id_perfil)) {
            return false;
        }
        if (!Objects.equals(this.id_Usuario, other.id_Usuario)) {
            return false;
        }
        return true;
    }

    /**
     * @return the nom_nick
     */
    public String getNom_nick() {
        return nom_nick;
    }

    /**
     * @param nom_nick the nom_nick to set
     */
    public void setNom_nick(String nom_nick) {
        this.nom_nick = nom_nick;
    }

    /**
     * @return the des_endereco
     */
    public String getDes_endereco() {
        return des_endereco;
    }

    /**
     * @param des_endereco the des_endereco to set
     */
    public void setDes_endereco(String des_endereco) {
        this.des_endereco = des_endereco;
    }

    /**
     * @return the dta_nascimento
     */
    public Date getDta_nascimento() {
        return dta_nascimento;
    }

    /**
     * @param dta_nascimento the dta_nascimento to set
     */
    public void setDta_nascimento(Date dta_nascimento) {
        this.dta_nascimento = dta_nascimento;
    }

    /**
     * @return the id_perfil
     */
    public Integer getId_perfil() {
        return id_perfil;
    }

    /**
     * @param id_perfil the id_perfil to set
     */
    public void setId_perfil(Integer id_perfil) {
        this.id_perfil = id_perfil;
    }

    /**
     * @return the id_Usuario
     */
    public Integer getId_Usuario() {
        return id_Usuario;
    }

    /**
     * @param id_Usuario the id_Usuario to set
     */
    public void setId_Usuario(Integer id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    /**
     * @return the id_lista_amigos
     */
    public Integer getId_lista_amigos() {
        return id_lista_amigos;
    }

    /**
     * @param id_lista_amigos the id_lista_amigos to set
     */
    public void setId_lista_amigos(Integer id_lista_amigos) {
        this.id_lista_amigos = id_lista_amigos;
    }
}
