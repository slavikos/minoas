/**
 * 
 */
package gr.sch.ira.minoas.model.core;

import gr.sch.ira.minoas.model.BaseIDModel;
import gr.sch.ira.minoas.model.employee.Employee;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author slavikos
 *
 */
@Entity
@Table(name = "PYSDE")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class PYSDE extends BaseIDModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "currentPYSDE")
	private Collection<Employee> employees;

	/**
	 * 
	 */
	@Basic
	@Column(name = "IS_LOCAL_PYSDE", nullable = false, updatable = true)
	private boolean localPYSDE;

	@OneToOne
	@JoinColumn(name = "REPRESENTED_UNIT_ID", nullable = true, updatable = false)
	private Unit representedByUnit;

	@Basic
	@Column(name = "TITLE", length = 64, nullable = false, updatable = true, unique = true)
	private String title;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pysde")
	private Collection<Unit> units;

	/**
	 * 
	 */
	public PYSDE() {
	}

	/**
	 * @return the employees
	 */
	public Collection<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @return the representedByUnit
	 */
	public Unit getRepresentedByUnit() {
		return representedByUnit;
	}

	public String getTitle() {
		return title;
	}

	/**
	 * @return the units
	 */
	public Collection<Unit> getUnits() {
		return units;
	}

	/**
	 * @return the localPYSDE
	 */
	public boolean isLocalPYSDE() {
		return localPYSDE;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Collection<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * @param localPYSDE the localPYSDE to set
	 */
	public void setLocalPYSDE(boolean localPYSDE) {
		this.localPYSDE = localPYSDE;
	}

	/**
	 * @param representedByUnit the representedByUnit to set
	 */
	public void setRepresentedByUnit(Unit representedByUnit) {
		this.representedByUnit = representedByUnit;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param units the units to set
	 */
	public void setUnits(Collection<Unit> units) {
		this.units = units;
	}

}
