import com.skit.VaccineDosageCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.DisplayName;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DosageCalculatorTest {

    record TestCase(String name, int age, double weight, boolean isHighRisk, boolean hasAllergy, double expected) {

        @Override
            public String toString() {
                return name;
            }
        }

    static Stream<TestCase> dosageTestCases() {
        return Stream.of(
                new TestCase("TableRow1", 85, 45.0, true, true, 62.5),
                new TestCase("TableRow2", 75, 44.0, true, false, 35.2),
                new TestCase("TableRow4", 80, 55.0, true, false, 74.0),
                new TestCase("TableRow5", 68, 46.0, false, true, 62.0),
                new TestCase("TableRow6", 70, 45.0, false, false, 36.0),
                new TestCase("TableRow8", 70, 60.0, false, false, 79.0),
                new TestCase("TableRow9", 35, 49.0, true, true, 62.3),
                new TestCase("TableRow10", 30, 42.0, true, false, 33.6),
                new TestCase("TableRow12", 50, 55.0, true, false, 71.0),
                new TestCase("TableRow14", 40, 48.0, false, false, 61.6)
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("dosageTestCases")
    @DisplayName("VaccineDosageCalculator.calculateDosage parameterized test")
    void testCalculateDosage(TestCase testCase) {
        double result = VaccineDosageCalculator.calculateDosage(
                testCase.age,
                testCase.weight,
                testCase.isHighRisk,
                testCase.hasAllergy
        );
        assertEquals(testCase.expected, result, 0.0001, "Failed on " + testCase.name);
    }
}
