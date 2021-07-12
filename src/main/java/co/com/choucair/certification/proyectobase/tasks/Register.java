package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairJobPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
    public Register(String strUser, String strLastName, String strEmail, String strPhone) {
        this.strUser = strUser;
        this.strLastName= strLastName;
        this.strEmail = strEmail;
        this.strPhone = strPhone;


    }

    private String strUser;
    private String strLastName;
    private String strEmail;
    private String strPhone;

    public static Register onThePage(String strUser, String strLastName, String strEmail, String strPhone) {
        return Tasks.instrumented(Register.class,strUser,strLastName,strEmail,strPhone);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strUser).into(ChoucairJobPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(ChoucairJobPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(ChoucairJobPage.INPUT_EMAIL),
                Enter.theValue(strPhone).into(ChoucairJobPage.INPUT_PHONE),
                Click.on(ChoucairJobPage.FIELD_CHECK),
                Click.on(ChoucairJobPage.ENTER_BUTTON)

        );

    }
}
