package smithstone.components.forms;

import smithstone.forms.ports.ContactView;

public class FakeContactFormView implements ContactView {
    @Override
    public String getTitleLabel() {
        return "Title";
    }

    @Override
    public String getFirstNameLabel() {
        return "First Name";
    }

    @Override
    public String getLastNameLabel() {
        return "Last Name";
    }

    @Override
    public String getEmailAddressLabel() {
        return "Email Address";
    }

    @Override
    public String getTelephoneLabel() {
        return "Telephone";
    }

    @Override
    public String getMobileLabel() {
        return "Mobile";
    }

    @Override
    public String getSubmitButtonLabel() {
        return "Submit";
    }
}
