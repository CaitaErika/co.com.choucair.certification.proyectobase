package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJobPage {
    public static final Target INPUT_FIRST_NAME = Target.the("were do we write the first name").located(By.id("candidate_first_name"));
    public static final Target INPUT_LAST_NAME = Target.the("were do we write the last name").located(By.id("candidate_last_name"));
    public static final Target INPUT_EMAIL = Target.the("were do we write the email").located(By.id("candidate_email"));
    public static final Target INPUT_PHONE = Target.the("were do we write the phone").located(By.id("candidate_phone"));
    public static final Target FIELD_CHECK = Target.the("were do we write the phone").located(By.id("candidate_accept_terms"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//button[contains(@type,'submit')]"));
}



