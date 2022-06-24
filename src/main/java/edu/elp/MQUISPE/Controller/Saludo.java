package edu.elp.MQUISPE.Controller;

import edu.elp.MQUISPE.Entify.Asignatura;
import edu.elp.MQUISPE.Entify.Estudiante;
import edu.elp.MQUISPE.Entify.Persona;
import edu.elp.MQUISPE.Entify.Profesor;
import edu.elp.MQUISPE.Service.IAsignaturaService;
import edu.elp.MQUISPE.Service.IEstudianteService;
import edu.elp.MQUISPE.Service.IPersonaService;
import edu.elp.MQUISPE.Service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
public class Saludo {

    @Autowired
    private IPersonaService personaService;



    @GetMapping("/listaPersona")
    public List<Persona> listaPersona() {
        return this.personaService.listaPersonas();
    }

    @GetMapping("/buscarPersona")
    public Persona buscarPersona(@RequestParam("nombre") String nombre) {
        return this.personaService.obtenerPersonaBynombre(nombre);

    }

    @Autowired
    private IEstudianteService estudianteService;
    @GetMapping("/listaEstudiantes")
    public List<Estudiante> listaEstudiantes(){
        return this.estudianteService.listaEstudiantes();
    }
    @GetMapping("/buscarEstudiante")
    public Estudiante buscarEstudiante(@RequestParam("nombre") String nombre) {
        return this.estudianteService.obtenerEstudianteByNombre(nombre);
    }

    @Autowired
    private IProfesorService profesorService;
    @GetMapping("/listaProfesor")
    public List<Profesor>listaProfesor() {
        return this.profesorService.listaProfesor();
    }
    @Autowired
    private IAsignaturaService asignaturaService;
    @GetMapping("/listaCurso")
    public List<Asignatura>listaCurso(){
        return this.asignaturaService.curso();
    }

}
