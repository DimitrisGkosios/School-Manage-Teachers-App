package School.Manage.Teachers.schoolapp.service;

import School.Manage.Teachers.schoolapp.model.City;

import java.sql.SQLException;
import java.util.List;

public interface ICityService {
    List<City> getAllCities() throws SQLException;
}
