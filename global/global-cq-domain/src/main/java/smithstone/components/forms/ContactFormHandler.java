package smithstone.components.forms;

import com.day.cq.mailer.MailService;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.apache.sling.api.scripting.SlingScriptHelper;

import javax.servlet.http.HttpServletRequest;

public class ContactFormHandler {

    private SlingScriptHelper scriptHelper;
    private HttpServletRequest request;

    public ContactFormHandler(SlingScriptHelper scriptHelper, HttpServletRequest request) {
        this.scriptHelper = scriptHelper;
        this.request = request;
    }

    private Email createEmail() throws EmailException {
        SimpleEmail email = new SimpleEmail();
        StringBuilder builder = new StringBuilder();

        builder.append("Title: " + request.getParameter("title"));
        builder.append("First Name: " + request.getParameter("firstname"));
        builder.append("Last Name: " + request.getParameter("lastname"));
        builder.append("Telephone: " + request.getParameter("telephone"));
        builder.append("Mobile: " + request.getParameter("mobile"));

        email.setFrom(request.getParameter("email"));

        email.setMsg(builder.toString()); 
        email.addTo("stephen@smithstone.co.uk");
        return email;
    }

    public void sendEmail() {

        try {
            Email email = createEmail();
            MailService service = scriptHelper.getService(MailService.class);
            service.send(email);
        } catch (EmailException e) {
            e.printStackTrace(System.err);
        }
    }
}
