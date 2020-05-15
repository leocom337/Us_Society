
package br.newtonpaiva.us.usuario;

import java.util.Objects;

/**
 *
 * @author lucas pereira
 */
public class Amigos {
  private Integer  id_Amigos;
  private Perfil amigos;

    public Amigos(Integer id_Amigos, Perfil amigos) {
        this.id_Amigos = id_Amigos;
        this.amigos = amigos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id_Amigos);
        hash = 83 * hash + Objects.hashCode(this.amigos);
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
        final Amigos other = (Amigos) obj;
        if (!Objects.equals(this.id_Amigos, other.id_Amigos)) {
            return false;
        }
        if (!Objects.equals(this.amigos, other.amigos)) {
            return false;
        }
        return true;
    }
  

    /**
     * @return the id_Amigos
     */
    public Integer getId_Amigos() {
        return id_Amigos;
    }

    /**
     * @param id_Amigos the id_Amigos to set
     */
    public void setId_Amigos(Integer id_Amigos) {
        this.id_Amigos = id_Amigos;
    }
  
    
     
    public void buscarAmigo (Perfil amigos){
     
     
        
    }
}
