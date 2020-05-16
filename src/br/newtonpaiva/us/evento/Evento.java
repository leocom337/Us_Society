package br.newtonpaiva.us.evento;
//Paulo César
import java.util.Date;
import java.util.Objects;

public class Evento {
private Integer id_evento;
private Integer id_dono_evento;
private String nomeEvento;
private Date dataEvento;
private String desEndereco;
private String desEvento;

    public Evento(Integer id_evento, Integer id_dono_evento) {
        this.id_evento = id_evento;
        this.id_dono_evento = id_dono_evento;
    }

   

    /**
     * @return the nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento the nomeEvento to set
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return the dataEvento
     */
    public Date getDataEvento() {
        return dataEvento;
    }

    /**
     * @param dataEvento the dataEvento to set
     */
    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    /**
     * @return the desEndereco
     */
    public String getDesEndereco() {
        return desEndereco;
    }

    /**
     * @param desEndereco the desEndereco to set
     */
    public void setDesEndereco(String desEndereco) {
        this.desEndereco = desEndereco;
    }

    /**
     * @return the desEvento
     */
    public String getDesEvento() {
        return desEvento;
    }

    /**
     * @param desEvento the desEvento to set
     */
    public void setDesEvento(String desEvento) {
        this.desEvento = desEvento;
    }

    @Override
    public String toString() {
        return "Evento{" + "id_evento=" + id_evento + ", id_dono_evento=" + id_dono_evento + ", nomeEvento=" + nomeEvento + ", dataEvento=" + dataEvento + ", desEndereco=" + desEndereco + ", desEvento=" + desEvento + '}';
    }

    

    public Evento(String nomeEvento, Date dataEvento, String desEndereco, String desEvento) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.desEndereco = desEndereco;
        this.desEvento = desEvento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id_evento);
        hash = 47 * hash + Objects.hashCode(this.id_dono_evento);
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.id_evento, other.id_evento)) {
            return false;
        }
        if (!Objects.equals(this.id_dono_evento, other.id_dono_evento)) {
            return false;
        }
        return true;
    }

   

    /**
     * @return the id_evento
     */
    public Integer getId_evento() {
        return id_evento;
    }

    /**
     * @param id_evento the id_evento to set
     */
    public void setId_evento(Integer id_evento) {
        this.id_evento = id_evento;
    }

    /**
     * @return the id_dono_evento
     */
    public Integer getId_dono_evento() {
        return id_dono_evento;
    }

    /**
     * @param id_dono_evento the id_dono_evento to set
     */
    public void setId_dono_evento(Integer id_dono_evento) {
        this.id_dono_evento = id_dono_evento;
    }
}
