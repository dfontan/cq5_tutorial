package smithstone.components.forms;

import smithstone.forms.ports.ContactModel;

public class FakeContactFormModel implements ContactModel {
    @Override
    public String getFormAction() {
        return "-";
    }
}
