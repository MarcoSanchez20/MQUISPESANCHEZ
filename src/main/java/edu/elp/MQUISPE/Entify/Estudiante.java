package edu.elp.MQUISPE.Entify;

import javax.persistence.*;

@Entity
@Table(name = "ESTUDIANTE")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Estudiante extends Persona{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="codigo",length = 10,nullable = false)
    private  String codigo;

    @Column(name="serie",length = 8)
    private  String serie;

    @Column(name="nombre",length = 15,nullable = false)
    private  String nombre;

    public Estudiante() {
    }

    public Estudiante(Long id, String codigo, String serie, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.serie = serie;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
