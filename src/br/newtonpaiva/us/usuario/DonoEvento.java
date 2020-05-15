package br.newtonpaiva.us.usuario;

/**
 *
 * @author lucas pereira, leonardo moreira
 */
public class DonoEvento {
    private Integer id_usuario;
    private Integer id_dono_evento;
    private String num_cnpj;
    private String nom_estebalecimento;
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

    @Override
    public String toString() {
        return "DonoEvento{" + "id_usuario=" + id_usuario + ", id_dono_evento=" + id_dono_evento + ", num_cnpj=" + num_cnpj + ", nom_estebalecimento=" + nom_estebalecimento + '}';
    }

    /**
     * @return the num_cnpj
     */
    public String getNum_cnpj() {
        return num_cnpj;
    }

    /**
     * @param num_cnpj the num_cnpj to set
     */
    public void setNum_cnpj(String num_cnpj) {
        this.num_cnpj = num_cnpj;
    }

    /**
     * @return the nom_estebalecimento
     */
    public String getNom_estebalecimento() {
        return nom_estebalecimento;
    }

    /**
     * @param nom_estebalecimento the nom_estebalecimento to set
     */
    public void setNom_estebalecimento(String nom_estebalecimento) {
        this.nom_estebalecimento = nom_estebalecimento;
    }

    /**
     * @return the id_Usuario
     */
    public Integer getId_Usuario() {
        return id_usuario;
    }

    /**
     * @param id_Usuario the id_Usuario to set
     */
    public void setId_Usuario(Integer id_Usuario) {
        this.id_usuario = id_Usuario;
    }

}
