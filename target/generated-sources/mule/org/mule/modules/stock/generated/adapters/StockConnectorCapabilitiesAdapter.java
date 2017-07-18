
package org.mule.modules.stock.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.stock.StockConnector;


/**
 * A <code>StockConnectorCapabilitiesAdapter</code> is a wrapper around {@link StockConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-18T02:17:01-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class StockConnectorCapabilitiesAdapter
    extends StockConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
