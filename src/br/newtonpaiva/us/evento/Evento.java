package br.newtonpaiva.us.evento;
//Paulo César
import java.util.Date;
import java.util.Objects;

public class Evento {
    
private String nomeEvento;
private Date dataEvento;
private String desEndereco;
private String desEvento;

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
        return "Evento{" + "nomeEvento=" + nomeEvento + ", dataEvento=" + dataEvento + ", desEndereco=" + desEndereco + ", desEvento=" + desEvento + '}';
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
        hash = 31 * hash + Objects.hashCode(this.nomeEvento);
        hash = 31 * hash + Objects.hashCode(this.dataEvento);
        hash = 31 * hash + Objects.hashCode(this.desEndereco);
        hash = 31 * hash + Objects.hashCode(this.desEvento);
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
        if (!Objects.equals(this.nomeEvento, other.nomeEvento)) {
            return false;
        }
        if (!Objects.equals(this.desEndereco, other.desEndereco)) {
            return false;
        }
        if (!Objects.equals(this.desEvento, other.desEvento)) {
            return false;
        }
        if (!Objects.equals(this.dataEvento, other.dataEvento)) {
            return false;
        }
        return true;
    }

public void buscarNome (String nomeEvento) throws Exception{  
    try{
        
        
        
        
    }catch(Exception e){
        throw new Exception("Nome invalido");
        
    }
        
    
    
    
}
}
