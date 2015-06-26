package br.com.fafidev.uniweb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Venom
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Livro extends Publicacao implements Serializable {

    private String isbn;
    private String referencia;

    public String getIsbn() {
        return isbn;
    }

    public Livro() {
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
