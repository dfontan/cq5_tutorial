package smithstone.components.forms;

import smithstone.forms.ports.ContactView;

public class FakeContactFormView implements ContactView {
    @Override
    public String getTitleLabel() {
        return "-title-";
    }

    @Override
    public String getFirstNameLabel() {
        return "-";
    }

    @Override
    public String getLastNameLabel() {
        return "-";
    }

    @Override
    public String getEmailAddressLabel() {
        return "-";
    }

    @Override
    public String getTelephoneLabel() {
        return "-";
    }

    @Override
    public String getMobileLabel() {
        return "-";
    }

    @Override
    public String getSubmitButtonLabel() {
        return "-";
    }
}
