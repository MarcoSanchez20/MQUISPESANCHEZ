package edu.elp.MQUISPE.Dao;

import edu.elp.MQUISPE.Entify.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estudiante,String> {

    @Query("SELECT p FROM Estudiante p WHERE p.nombre = ?1")
    Estudiante buscarEstudiante(String nombre);

    Estudiante findBynombre(String codigo);
}
