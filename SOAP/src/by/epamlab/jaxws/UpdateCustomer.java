
package by.epamlab.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateCustomer", namespace = "http://epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCustomer", namespace = "http://epamlab.by/")
public class UpdateCustomer {

    @XmlElement(name = "arg0", namespace = "")
    private by.epamlab.beans.reservations.customer.Customer arg0;

    /**
     * 
     * @return
     *     returns Customer
     */
    public by.epamlab.beans.reservations.customer.Customer getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(by.epamlab.beans.reservations.customer.Customer arg0) {
        this.arg0 = arg0;
    }

}
