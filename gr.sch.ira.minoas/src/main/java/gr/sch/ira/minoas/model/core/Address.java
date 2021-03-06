/**
 * 
 */
package gr.sch.ira.minoas.model.core;

import gr.sch.ira.minoas.model.BaseIDModel;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.jboss.seam.annotations.Name;

/**
 * @author <a href="mailto:filippos@slavik.gr">Filippos Slavik</a>
 * 
 */
@Entity
@Name("address")
@Table(name = "ADDRESS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Address extends BaseIDModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Basic
	@Column(name = "ADDRESS", length = 128, nullable = false)
	private String address;

	@Basic
	@Column(name = "ADDRESS_ADDITIONAL", length = 128, nullable = true)
	private String addressAdditional;

	@Basic
	@Column(name = "CITY", length = 15, nullable = true)
	private String city;

	@Basic
	@Column(name = "LATITUDE", nullable = true)
	private Double latitude;

	@Basic
	@Column(name = "LONGITUDE", nullable = true)
	private Double longitude;

	@Basic
	@Column(name = "NUMBER", length = 8, nullable = true)
	private String number;

	@Basic
	@Column(name = "POSTAL_CODE", length = 10, nullable = true)
	private String postCode;

	/**
	 * 
	 */
	public Address() {
		super();
	}
	
	/**
	 * Constructor to be used when cloning an Address. Note, the cloning is simple and no
	 * complex referenced beans are cloned as well.
	 * @param a
	 */
	public Address(Address a) {
		this();
		if (a != null) {
			this.setId(a.getId());
			this.setAddress(a.getAddress());
			this.setAddressAdditional(a.getAddressAdditional());
			this.setCity(a.getCity());
			this.setInsertedBy(a.getInsertedBy());
			this.setInsertedOn(a.getInsertedOn());
			this.setLatitude(a.getLatitude());
			this.setLongitude(a.getLongitude());
			this.setNumber(a.getNumber());
			this.setPostCode(a.getPostCode());
		}
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the addressAdditional
	 */
	public String getAddressAdditional() {
		return addressAdditional;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param addressAdditional the addressAdditional to set
	 */
	public void setAddressAdditional(String addressAdditional) {
		this.addressAdditional = addressAdditional;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

}
