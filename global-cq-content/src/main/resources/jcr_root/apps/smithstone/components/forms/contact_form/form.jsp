<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<%@taglib prefix="smithstone" uri="http://www.smithstone.com/global-factory-tags" %>

<smithstone:contactFormFactory/>

<jsp:useBean id="form" type="smithstone.forms.ContactForm" scope="request"/>


<div id="contact_form">
    <form action="${form.model.formAction}" method="post"> <!-- <2> -->
        <fieldset>
            <legend>Personal Information</legend>
            <div>
                <label for="title"><c:out value="${form.view.titleLabel}"/> </label>
                <select name="title" id="title">
                    <option>Mr</option>
                    <option>Mrs</option>
                    <option>Miss</option>
                    <option>Dr</option>
                </select>
            </div>

            <div>
                <label for="firstname">
                    <c:out value="${form.view.firstNameLabel}"/>
                </label>
                <input type="text" name="firstname" id="firstname"/>
            </div>

            <div>
                <label for="lastname">
                    <c:out value="${form.view.lastNameLabel}"/>
                </label>
                <input id="lastname" name="lastname" type="text"/>
            </div>
        </fieldset>

        <fieldset>
            <legend>Contact Information</legend>
            <div>
                <label for="email">
                    <c:out value="${form.view.emailAddressLabel}"/>
                </label>
                <input type="email" name="email" id="email"/>
            </div>
            <div>
                <label for="telephone">
                    <c:out value="${form.view.telephoneLabel}"/>
                </label>
                <input type="tel" name="telephone" id="telephone"/></div>
            <div>
                <label for="mobile">
                    <c:out value="${form.view.mobileLabel}"/>
                </label>
                <input name="mobile" id="mobile" type="tel"/>
            </div>
        </fieldset>

        <fieldset>
            <div>
                <input class="form_submit_button" type="submit"
                       value="<c:out value="${form.view.submitButtonLabel}"/>"/>
            </div>
        </fieldset>

    </form>
</div>

