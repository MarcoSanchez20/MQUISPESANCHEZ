package edu.elp.MQUISPE.Entify;

import javax.persistence.*;

@Entity
@Table(name = "PRO_ASIGNATURA")
public class Profesor_Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprofasignatura;
    private  String idprofesor;
    private String idasignatura;
    private String semestre;

    @OneToOne
    private Direccion Persona;
}
