package step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmptyStep {

    @When("^sout my name$")
    public void soutMyName() {
        System.out.println("Liza");
    }

    @And("sout my family")
    public void soutMyFamily() {
        System.out.println("Smyrnova");
    }

    @Then("sout my age")
    public void soutMyAge() {
        System.out.println("36");
    }

    @When("sout my name {string}")
    public void soutMyName(String name) {
        System.out.println("my name is " + name);
    }

    @And("sout my family {string} and family my husband {string}")
    public void soutMyFamilyAndFamilyMyHusband(String myFamily, String husbandFamily) {
        System.out.println("My family name is " + myFamily + " and my husband's family name is " + husbandFamily);
    }
}
