package edu.galileo.alumnos.controller;

import edu.galileo.alumnos.model.Alumno;
import edu.galileo.alumnos.service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoController {

    private AlumnoService alumnoService;
    AlumnoController(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }
    @GetMapping
    public List<Alumno> getAll(){
        return this.alumnoService.list();
    }
    @PostMapping
    public Alumno add(@RequestBody(required = true)Alumno alumno){
        return this.alumnoService.add(alumno);
    }
}
