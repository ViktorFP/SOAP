
package by.epamlab.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateCustomerResponse", namespace = "http://epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCustomerResponse", namespace = "http://epamlab.by/")
public class UpdateCustomerResponse {

    @XmlElement(name = "return", namespace = "")
    private by.epamlab.beans.reservations.customer.Customer _return;

    /**
     * 
     * @return
     *     returns Customer
     */
    public by.epamlab.beans.reservations.customer.Customer getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(by.epamlab.beans.reservations.customer.Customer _return) {
        this._return = _return;
    }

}
