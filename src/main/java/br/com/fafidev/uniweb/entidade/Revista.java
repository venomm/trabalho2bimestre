
package br.com.fafidev.uniweb.entidade;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Venom
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Revista extends Publicacao implements Serializable {
    private Date publicacao;

    public Date getPublicacao() {
        return publicacao;
    }

    public Revista() {
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }
    
}
