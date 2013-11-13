package smithstone.cq.domain;

import org.apache.sling.api.scripting.SlingScriptHelper;

public class DateTime {


    private final smithstone.services.DateTime service;

    public DateTime(SlingScriptHelper scriptHelper) {
        service = scriptHelper.getService(smithstone.services.DateTime.class);
    }

    public String getDateTime(){
        return service.getFormattedDateTime();
    }
}
