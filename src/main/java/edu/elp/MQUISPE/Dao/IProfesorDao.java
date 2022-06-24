package edu.elp.MQUISPE.Dao;

import edu.elp.MQUISPE.Entify.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor,String> {
}
