package School.Manage.Teachers.schoolapp.service;

import School.Manage.Teachers.schoolapp.dao.exceptions.TeacherDAOException;
import School.Manage.Teachers.schoolapp.dto.TeacherInsertDTO;
import School.Manage.Teachers.schoolapp.dto.TeacherReadOnlyDTO;
import School.Manage.Teachers.schoolapp.dto.TeacherUpdateDTO;
import School.Manage.Teachers.schoolapp.exceptions.TeacherAlreadyExistsException;
import School.Manage.Teachers.schoolapp.exceptions.TeacherNotFoundException;

import java.util.List;

public interface ITeacherService {
    TeacherReadOnlyDTO insertTeacher(TeacherInsertDTO dto)
            throws TeacherDAOException, TeacherAlreadyExistsException;
    TeacherReadOnlyDTO updateTeacher(Integer id, TeacherUpdateDTO dto)
            throws TeacherDAOException, TeacherAlreadyExistsException, TeacherNotFoundException;
    void deleteTeacher(Integer id) throws TeacherDAOException, TeacherNotFoundException;
    TeacherReadOnlyDTO getTeacherById(Integer id) throws TeacherDAOException, TeacherNotFoundException;
    List<TeacherReadOnlyDTO> getAllTeachers() throws TeacherDAOException;
    List<TeacherReadOnlyDTO> getTeachersByLastname(String lastname) throws TeacherDAOException;
}
