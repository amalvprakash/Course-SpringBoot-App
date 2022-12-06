package com.NEST.CourseappBackend.DAO;

import com.NEST.CourseappBackend.model.CourseModel;
import org.springframework.data.repository.CrudRepository;

public interface CourseDAO extends CrudRepository<CourseModel, Integer> {
}
