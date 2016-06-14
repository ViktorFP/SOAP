
package by.epamlab.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCustomersResponse", namespace = "http://epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomersResponse", namespace = "http://epamlab.by/")
public class GetCustomersResponse {

    @XmlElement(name = "return", namespace = "")
    private List<by.epamlab.beans.reservations.customer.Customer> _return;

    /**
     * 
     * @return
     *     returns List<Customer>
     */
    public List<by.epamlab.beans.reservations.customer.Customer> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<by.epamlab.beans.reservations.customer.Customer> _return) {
        this._return = _return;
    }

}
