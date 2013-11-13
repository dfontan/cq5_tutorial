<%@include file="/libs/foundation/global.jsp"%> <!-- <1> -->

<c:set var="titleLabel" value="<%= properties.get("titleLabel" , "Title")%>" />
<c:set var="firstNameLabel" value="<%= properties.get("firstnameLabel" , "First Name")%>" />
<c:set var="lastNameLabel" value="<%= properties.get("lastnameLabel" , "Last Name")%>" />
<c:set var="emailLabel" value="<%= properties.get("emailLabel" , "Email Address")%>" />
<c:set var="telephoneLabel" value="<%= properties.get("telephoneLabel" , "Telephone")%>" />
<c:set var="mobileLabel" value="<%= properties.get("mobileLabel" , "Mobile Number")%>" />
<c:set var="submitButtonLabel" value="<%= properties.get("submitButtonLabel" , "Submit")%>" />

<div id="contact_form">
    <form action="<%= resource.getPath()%>.submit.html" method="post"> <!-- <2> -->
        <fieldset>
            <legend>Personal Information</legend>
            <div>
                <label for="title"><c:out value="${titleLabel}"/> </label>
                <select name="title" id="title">
                    <option>Mr</option>
                    <option>Mrs</option>
                    <option>Miss</option>
                    <option>Dr</option>
                </select>
            </div>

            <div>
                <label for="firstname"><c:out value="${firstNameLabel}"/></label>
                <input type="text" name="firstname" id="firstname"/>
            </div>

            <div>
                <label for="lastname"><c:out value="${lastNameLabel}"/></label>
                <input id="lastname" name="lastname" type="text"/>
            </div>
        </fieldset>

        <fieldset>
            <legend>Contact Information</legend>
            <div><label for="email"><c:out value="${emailLabel}"/></label><input type="email" name="email" id="email"/></div>
            <div><label for="telephone"><c:out value="${telephoneLabel}"/></label><input type="tel" name="telephone" id="telephone"/></div>
            <div><label for="mobile"><c:out value="${mobileLabel}"/></label><input name="mobile" id="mobile" type="tel"/></div>
        </fieldset>

        <fieldset>
            <div><input class="form_submit_button" type="submit" value="<c:out value="${submitButtonLabel}"/>"/></div>
        </fieldset>

    </form>
</div>
