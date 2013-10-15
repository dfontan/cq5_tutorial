package smithstone.pages;

import org.apache.sling.api.resource.ValueMap;
public class CQPageHeader implements PageHeader {

    private ValueMap properties;

    public void setProperties(ValueMap properties) {
        this.properties = properties;
    }

    @Override
    public String getTitle() {
        return properties.get("title", String.class);
    }
}
