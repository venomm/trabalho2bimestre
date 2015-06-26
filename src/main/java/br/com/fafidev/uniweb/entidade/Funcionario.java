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
public class Funcionario extends PessoaFisica implements Serializable {

    private String funcao;

    public String getFuncao() {
        return funcao;
    }

    public Funcionario() {
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
