package br.edu.ifpe.oxefood.api.cliente;

import org.hibernate.annotations.SQLRestriction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.edu.ifpe.oxefood.util.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EnderecoCliente")
@SQLRestriction("habilitado = true")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoCliente extends EntidadeAuditavel {

    @JsonIgnore
    @ManyToOne
    private Cliente cliente;

    @Column
    private String rua;

    @Column
    private String numero;

    @Column
    private String bairro;

    @Column
    private String cep;

    @Column
    private String cidade;

    @Column
    private String estado;

    @Column
    private String complemento;

}