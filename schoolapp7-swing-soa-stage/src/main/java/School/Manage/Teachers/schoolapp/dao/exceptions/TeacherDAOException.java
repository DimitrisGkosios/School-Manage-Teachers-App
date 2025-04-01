package School.Manage.Teachers.schoolapp.dao.exceptions;

import java.io.Serial;

public class TeacherDAOException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public TeacherDAOException(String s) {
        super(s);
    }
}
