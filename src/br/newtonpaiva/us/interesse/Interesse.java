/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.us.interesse;

import java.util.Objects;

/**
 *
 * @author leonardo moreira 
 */
public class Interesse {
    private Integer id_interesse;
    private String des_interesso;

    @Override
    public String toString() {
        return "Interesse{" + "id_interesse=" + id_interesse + ", des_interesso=" + des_interesso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id_interesse);
        hash = 79 * hash + Objects.hashCode(this.des_interesso);
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
        final Interesse other = (Interesse) obj;
        if (!Objects.equals(this.des_interesso, other.des_interesso)) {
            return false;
        }
        if (!Objects.equals(this.id_interesse, other.id_interesse)) {
            return false;
        }
        return true;
    }

    /**
     * @return the id_interesse
     */
    public Integer getId_interesse() {
        return id_interesse;
    }

    /**
     * @param id_interesse the id_interesse to set
     */
    public void setId_interesse(Integer id_interesse) {
        this.id_interesse = id_interesse;
    }

    /**
     * @return the des_interesso
     */
    public String getDes_interesso() {
        return des_interesso;
    }

    /**
     * @param des_interesso the des_interesso to set
     */
    public void setDes_interesso(String des_interesso) {
        this.des_interesso = des_interesso;
    }
}
