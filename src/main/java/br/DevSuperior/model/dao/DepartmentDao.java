package br.DevSuperior.model.dao;

import br.DevSuperior.model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert (Department obj);
    void updaate(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
