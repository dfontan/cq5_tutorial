<%@include file="/libs/foundation/global.jsp"%> <!-- <1> -->


<div id="contact_form">
    <form action="<%= resource.getPath()%>.submit.html" method="post"> <!-- <2> -->
        <fieldset>
            <legend>Personal Information</legend>
            <div>
                <label for="title">Title</label>
                <select name="title" id="title">
                    <option>Mr</option>
                    <option>Mrs</option>
                    <option>Miss</option>
                    <option>Dr</option>
                </select>
            </div>

            <div>
                <label for="firstname">First Name</label>
                <input type="text" name="firstname" id="firstname"/>
            </div>

            <div>
                <label for="lastname">Last Name</label>
                <input id="lastname" name="lastname" type="text"/>
            </div>
        </fieldset>

        <fieldset>
            <legend>Contact Information</legend>
            <div><label for="email">Email Address</label><input type="email" name="email" id="email"/></div>
            <div><label for="telephone">Telephone</label><input type="tel" name="telephone" id="telephone"/></div>
            <div><label for="mobile">Mobile</label><input name="mobile" id="mobile" type="tel"/></div>
        </fieldset>

        <fieldset>
            <div><input class="form_submit_button" type="submit"/></div>
        </fieldset>

    </form>
</div>
