package School.Manage.Teachers.schoolapp.dao;

import School.Manage.Teachers.schoolapp.model.City;

import java.sql.SQLException;
import java.util.List;

public interface ICityDAO {
    List<City> getAll() throws SQLException;
}
