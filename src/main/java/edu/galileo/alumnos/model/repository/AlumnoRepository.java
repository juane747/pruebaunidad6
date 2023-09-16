package edu.galileo.alumnos.model.repository;

import edu.galileo.alumnos.model.Alumno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {

    List<Alumno> findAll();
}
