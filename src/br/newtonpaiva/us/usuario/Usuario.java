/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.us.usuario;

import java.util.Objects;

/**
 *
 * @author leonardo moreira
 */
public class Usuario {
   private Integer id_usario;
   private String login;
   private String senha;
   private String email;
   private String telefone;
    /**
     * @return the id_usario
     */
    public Integer getId_usario() {
        return id_usario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usario=" + id_usario + ", login=" + login + ", senha=" + senha + ", email=" + email + ", telefone=" + telefone + '}';
    }

    /**
     * @param id_usario the id_usario to set
     */
    public void setId_usario(Integer id_usario) {
        this.id_usario = id_usario;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id_usario);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id_usario, other.id_usario)) {
            return false;
        }
        return true;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
