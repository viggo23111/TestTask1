package NumeralConverter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
public class StepDefinition {
    public long arabicNumber;
    public String romanNumeral;

    @Given("I have the roman numeral {string}")
    public void i_have_the_roman_numeral(String romanNumeral) {
        this.romanNumeral = romanNumeral;
    }
    @When("I convert it to arabic")
    public void i_convert_it_to_arabic() {
       arabicNumber= NumeralConverter.convertToArabicFromRoman(romanNumeral);
    }
    @Then("I should get {int}")
    public void i_should_get(int test1) {
        Long longTest = Long.valueOf(test1);
       assert(longTest.equals(arabicNumber));
    }

}
