import com.skit.VaccineDosageCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DosageCalculatorTest {

    @Test
    void testCalculateDosage_TableRow1() {
        int age = 85;
        double weight = 45.0;
        boolean isHighRisk = true;
        boolean hasAllergy = true;

        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);
        // Condition false (hasAllergy == true): return 45.0 * 1.2 + 85 * 0.1 = 54.0 + 8.5 = 62.5
        assertEquals(62.5, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow2() {
        int age = 75;
        double weight = 44.0;
        boolean isHighRisk = true;
        boolean hasAllergy = false;

        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);
        // Condition is true: return weight * 0.8 = 44.0 * 0.8 = 35.2
        assertEquals(35.2, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow4() {
        int age = 80;
        double weight = 55.0;
        boolean isHighRisk = true;
        boolean hasAllergy = false;

        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);
        // Condition false (weight >= 50): return weight * 1.2 + age * 0.1 = 55.0 * 1.2 + 80 * 0.1 = 66.0 + 8.0 = 74.0
        assertEquals(74.0, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow5() {
        int age = 68;
        double weight = 46.0;
        boolean isHighRisk = false;
        boolean hasAllergy = true;

        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);
        // Condition false (hasAllergy == true): 46.0 * 1.2 + 68 * 0.1 = 55.2 + 6.8 = 62.0
        assertEquals(62.0, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow6() {
        int age = 70;
        double weight = 45.0;
        boolean isHighRisk = false;
        boolean hasAllergy = false;


        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);


        assertEquals(36.0, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow8() {
        int age = 70;
        double weight = 60.0;
        boolean isHighRisk = false;
        boolean hasAllergy = false;

        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);
        // Condition false (weight >= 50): return 60.0 * 1.2 + 70 * 0.1 = 72.0 + 7.0 = 79.0
        assertEquals(79.0, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow9() {
        int age = 35;
        double weight = 49.0;
        boolean isHighRisk = true;
        boolean hasAllergy = true;

        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);
        // Condition false (hasAllergy == true): 49.0 * 1.2 + 35 * 0.1 = 58.8 + 3.5 = 62.3
        assertEquals(62.3, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow10() {

        int age = 30;
        double weight = 42.0;
        boolean isHighRisk = true;
        boolean hasAllergy = false;


        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);

        assertEquals(33.6, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow12() {
        int age = 50;
        double weight = 55.0;
        boolean isHighRisk = true;
        boolean hasAllergy = false;

        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);
        // Condition false (weight >= 50): return 55.0 * 1.2 + 50 * 0.1 = 66.0 + 5.0 = 71.0
        assertEquals(71.0, result, 0.0001);
    }

    @Test
    void testCalculateDosage_TableRow14() {

        int age = 40;
        double weight = 48.0;
        boolean isHighRisk = false;
        boolean hasAllergy = false;

        double result = VaccineDosageCalculator.calculateDosage(age, weight, isHighRisk, hasAllergy);


        assertEquals(61.6, result, 0.0001);
    }




}