package smithstone.forms;

import smithstone.forms.ports.ContactModel;
import smithstone.forms.ports.ContactView;

public class ContactForm {

    private ContactView view;
    private ContactModel model;

    public ContactForm() {
    }


    public ContactForm(ContactView view, ContactModel model) {
        this.view = view;
        this.model = model;
    }

    public ContactView getView() {
        return view;
    }

    public void setView(ContactView view) {
        this.view = view;
    }

    public ContactModel getModel() {
        return model;
    }

    public void setModel(ContactModel model) {
        this.model = model;
    }
}
