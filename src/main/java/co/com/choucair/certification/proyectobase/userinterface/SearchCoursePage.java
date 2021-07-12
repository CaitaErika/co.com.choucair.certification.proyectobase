package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage{
    public static final Target TAKE_NAME_AREA = Target.the("clic for name the job area").located(By.xpath("//div[@class='signup-country-container__logo']"));

}
