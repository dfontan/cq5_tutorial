package smithstone.osgi.ext;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import smithstone.services.DateTime;
import smithstone.services.DateTimeService;

import java.util.Properties;

public class DateTimeServiceActivator implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {

        DateTime service = new DateTimeService();
        bundleContext.registerService(DateTime.class.getName(), service, new Properties());
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {

    }
}
