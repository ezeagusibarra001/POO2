package model;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Employee;

import java.util.Calendar;
import java.util.Date;

class EmployeeTests {

    private Employee employee;

    @BeforeEach
    void setUp() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.AUGUST, 25);
        Date birthDate = calendar.getTime();
        employee = new Employee("Empleado 1", "Patricios 450", "Soltero", birthDate, 1000);
    }

    @Test
    void testGetAge() {
        Calendar today = Calendar.getInstance();
        int currentYear = today.get(Calendar.YEAR);
        int expectedAge = currentYear - 1990;

        // Ajustar la edad esperada si aún no ha sido el cumpleaños este año
        if (today.get(Calendar.DAY_OF_YEAR) < 237) { // 237 es el día del año para el 25 de agosto
            expectedAge--;
        }

        assertEquals(expectedAge, employee.getAge(), "The calculated age should match the expected age.");
    }
}
