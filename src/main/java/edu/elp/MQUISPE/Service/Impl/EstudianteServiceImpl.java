package edu.elp.MQUISPE.Service.Impl;


import edu.elp.MQUISPE.Dao.IEstudianteDao;
import edu.elp.MQUISPE.Entify.Estudiante;
import edu.elp.MQUISPE.Service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl extends IEstudianteService {


    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listaEstudiantes() {

        List<Estudiante> EstudianteList = this.estudianteDao.findAll();

        for(Estudiante Estudiante:EstudianteList) {
            System.out.println(Estudiante.toString());
        }

        return EstudianteList;
    }

    @Override
    public Estudiante obtenerEstudianteByNombre(String nombre) {
        return this.estudianteDao.buscarEstudiante(nombre);
    }
}
