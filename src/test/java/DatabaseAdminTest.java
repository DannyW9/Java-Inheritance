import org.junit.Before;
import org.junit.Test;
import staff.Management.Manager;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("John", "LP0987", 29000);
    }

    @Test
    public void hasName() {
        assertEquals("John", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("LP0987", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(29000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000);
        assertEquals(31000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(290, databaseAdmin.payBonus(), 0.1);
    }

}
