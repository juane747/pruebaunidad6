package edu.galileo.alumnos.service;

import edu.galileo.alumnos.model.Alumno;
import edu.galileo.alumnos.model.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    String titulo = "titulo";
    @Autowired
    private AlumnoRepository alumnoRepository;
    public Alumno add(Alumno alumno) {
        return this.alumnoRepository.save(alumno);
    }
    public List<Alumno> list(){
        return this.alumnoRepository.findAll();
    }
}
