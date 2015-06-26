package br.com.fafidev.uniweb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Venom
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Monografia extends Publicacao implements Serializable {
    private String referencia;

    public Monografia() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
    
}
