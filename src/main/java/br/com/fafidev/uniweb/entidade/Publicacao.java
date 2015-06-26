package br.com.fafidev.uniweb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Venom
 */
@Entity
public class Publicacao implements Serializable {

    public Publicacao() {
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codigo;
    private String titulo;
    private Integer paginas;
    @Enumerated(EnumType.STRING)
    private TipoPublicacao tipoPublicacao;
    @ManyToOne
    private Categoria categoria;
    @ManyToOne
    private AssuntoPublicacao assuntoPublicacao;
    @ManyToOne
    private Editora editora;

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    

    public AssuntoPublicacao getAssuntoPublicacao() {
        return assuntoPublicacao;
    }

    public void setAssuntoPublicacao(AssuntoPublicacao assuntoPublicacao) {
        this.assuntoPublicacao = assuntoPublicacao;
    }
    

    public TipoPublicacao getTipoPublicacao() {
        return tipoPublicacao;
    }

    public void setTipoPublicacao(TipoPublicacao tipoPublicacao) {
        this.tipoPublicacao = tipoPublicacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacao)) {
            return false;
        }
        Publicacao other = (Publicacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fafidev.uniweb.entidade.Publicacao[ id=" + id + " ]";
    }

}
