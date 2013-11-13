package smithstone.components.forms.adapter;

import org.apache.sling.api.resource.ValueMap;
import smithstone.forms.ports.ContactView;

public class CQContactFormView implements ContactView {

    private ValueMap properties;

    public CQContactFormView() {
    }

    public void setProperties(ValueMap properties) {
        this.properties = properties;
    }

    @Override
    public String getTitleLabel() {
        return properties.get("titleLabel", "Title");
    }

    @Override
    public String getFirstNameLabel() {
        return properties.get("firstNameLabel", "First Name");
    }


    @Override
    public String getLastNameLabel() {
        return properties.get("lastNameLabel", "Last Name");
    }

    @Override
    public String getEmailAddressLabel() {
        return properties.get("emailLabel", "Email Address");
    }

    @Override
    public String getTelephoneLabel() {
        return properties.get("telephoneLabel", "Telephone");
    }

    @Override
    public String getMobileLabel() {
        return properties.get("mobileLabel", "Mobile");
    }

    @Override
    public String getSubmitButtonLabel() {
        return properties.get("submitButtonLabel", "Submit ...");
    }
}
