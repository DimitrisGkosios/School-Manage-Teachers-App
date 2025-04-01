package School.Manage.Teachers.schoolapp.service;

import School.Manage.Teachers.schoolapp.dao.ICityDAO;
import School.Manage.Teachers.schoolapp.model.City;

import java.sql.SQLException;
import java.util.List;

public class CityServiceImpl implements ICityService {
    private final ICityDAO dao;

    public CityServiceImpl(ICityDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<City> getAllCities() throws SQLException {
        try {
            return dao.getAll();
        } catch (SQLException e) {
            // e.printStackTrace();
            throw e;
        }
    }
}
