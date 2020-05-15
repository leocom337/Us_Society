
package br.newtonpaiva.us.evento;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lucas pereira
 */
public class DonoEvento  { 
    private Integer id_Dono;
    private Evento eventos;

    public DonoEvento(Integer id_Dono, Evento eventos) {
        this.id_Dono = id_Dono;
        this.eventos = eventos;
    }

   
    /**
     * @return the id_Dono
     */
    public Integer getId_Dono() {
        return id_Dono;
    }

    @Override
    public String toString() {
        return "DonoEvento{" + "id_Dono=" + id_Dono + ", eventos=" + eventos + '}';
    }

   

  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id_Dono);
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
        final DonoEvento other = (DonoEvento) obj;
        if (!Objects.equals(this.id_Dono, other.id_Dono)) {
            return false;
        }
        return true;
    }

    /**
     * @param id_Dono the id_Dono to set
     */
    public void setId_Dono(Integer id_Dono) {
        this.id_Dono = id_Dono;
    }
    public void registrarEvento (Integer id_Dono, Evento eventos ) {
     this.id_Dono = id_Dono;
      this.eventos = eventos;
     
  
    
}
}
