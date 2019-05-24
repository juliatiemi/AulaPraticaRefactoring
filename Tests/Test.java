import org.junit.jupiter.api.Test;

import jdk.internal.jline.internal.TestAccessible;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @Test
    void testStatment() {

        Customer c = new Customer("testCostumer");

        Movie m1 = new Movie("testMovie1", 1);
        Movie m2 = new Movie("testMovie2", 2);

        Rental r1 = new Rental(m1,1);
        Rental r2 = new Rental(m2,2);

        c.addRental(r1);
        c.addRental(r2);

        String expectedResult = "Rental Record for testCostumer\n\ttestMovie1\t3.0\n\ttestMovie2\t1.5\nAmount owed is 4.5\nYou earned 2 frequent renter points";
        String result = c.statement();

        assertEquals(expectedResult, result);
    }
}
