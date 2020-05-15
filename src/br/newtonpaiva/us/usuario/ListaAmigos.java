
package br.newtonpaiva.us.usuario;

import java.util.Objects;


/**
 *
 * @author lucas pereira e leonardo Moreira 
 */
public class ListaAmigos {
  private Integer id_Lista_Amigos;
  private Integer id_perfil;

    @Override
    public String toString() {
        return "ListaAmigos{" + "id_Lista_Amigos=" + id_Lista_Amigos + ", id_perfil=" + id_perfil + '}';
    }

    /**
     * @return the id_Lista_Amigos
     */
    public Integer getId_Lista_Amigos() {
        return id_Lista_Amigos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id_Lista_Amigos);
        hash = 29 * hash + Objects.hashCode(this.id_perfil);
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
        final ListaAmigos other = (ListaAmigos) obj;
        if (!Objects.equals(this.id_Lista_Amigos, other.id_Lista_Amigos)) {
            return false;
        }
        if (!Objects.equals(this.id_perfil, other.id_perfil)) {
            return false;
        }
        return true;
    }

    /**
     * @param id_Lista_Amigos the id_Lista_Amigos to set
     */
    public void setId_Lista_Amigos(Integer id_Lista_Amigos) {
        this.id_Lista_Amigos = id_Lista_Amigos;
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
  
}
