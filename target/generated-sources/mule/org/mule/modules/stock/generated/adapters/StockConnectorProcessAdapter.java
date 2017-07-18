
package org.mule.modules.stock.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.stock.StockConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>StockConnectorProcessAdapter</code> is a wrapper around {@link StockConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-18T02:17:01-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class StockConnectorProcessAdapter
    extends StockConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<StockConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, StockConnectorCapabilitiesAdapter> getProcessTemplate() {
        final StockConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,StockConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, StockConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, StockConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
