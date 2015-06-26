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
public class Aluno extends PessoaFisica implements Serializable {

    private String registroAcademico;

    public Aluno() {
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

}
