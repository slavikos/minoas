

package gr.sch.ira.minoas.model.employement;

import gr.sch.ira.minoas.model.BaseIDModel;
import gr.sch.ira.minoas.model.core.SchoolYear;
import gr.sch.ira.minoas.model.core.Unit;
import gr.sch.ira.minoas.model.employee.Employee;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "SERVICE_ALLOCATION")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class ServiceAllocation extends BaseIDModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Basic
	@Column(name = "IS_ACTIVE", nullable = true)
	private Boolean active;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "PARENT_EMPLOYMENT_ID", nullable = true)
	private Employment affectedEmployment;

	@Basic
	@Column(name="COMMENT", nullable=true, length=255)
	private String comment;
	
	@Basic
	@Column(name = "DUE_TO", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dueTo;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EMPLOYEE_ID", nullable = false)
	private Employee employee;
	
	@Basic
	@Column(name = "ESTABLISHED", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date established;
	
	@Enumerated(EnumType.STRING)
	@Column(name="SERVICE_TYPE")
	private ServiceAllocationType serviceType;

	@Basic
	@Column(name = "PYSDE_ORDER", nullable = true, length = 25)
	private String pysdeOrder;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "SCHOOL_YEAR_ID", nullable = false)
	private SchoolYear schoolYear;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SERVICE_UNIT_ID", nullable = false)
	private Unit serviceUnit;
	
	@Basic
	@Column(name = "WORKING_HOURS_ON_REGULAR", nullable = true)
	private Integer workingHoursOnRegularPosition;

	@Basic
	@Column(name = "WORKING_HOURS_ON_SERVICE", nullable = true)
	private Integer workingHoursOnServicingPosition;

	public ServiceAllocation() {
		super();
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @return the affectedEmployment
	 */
	public Employment getAffectedEmployment() {
		return affectedEmployment;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @return the dueTo
	 */
	public Date getDueTo() {
		return dueTo;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @return the established
	 */
	public Date getEstablished() {
		return established;
	}

	/**
	 * @return the pysdeOrder
	 */
	public String getPysdeOrder() {
		return pysdeOrder;
	}

	/**
	 * @return the schoolYear
	 */
	public SchoolYear getSchoolYear() {
		return schoolYear;
	}

	/**
	 * @return the serviceUnit
	 */
	public Unit getServiceUnit() {
		return serviceUnit;
	}

	/**
	 * @return the workingHoursOnRegularPosition
	 */
	public Integer getWorkingHoursOnRegularPosition() {
		return workingHoursOnRegularPosition;
	}

	/**
	 * @return the workingHoursOnServicingPosition
	 */
	public Integer getWorkingHoursOnServicingPosition() {
		return workingHoursOnServicingPosition;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * @param affectedEmployment the affectedEmployment to set
	 */
	public void setAffectedEmployment(Employment affectedEmployment) {
		this.affectedEmployment = affectedEmployment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @param dueTo the dueTo to set
	 */
	public void setDueTo(Date dueTo) {
		this.dueTo = dueTo;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @param established the established to set
	 */
	public void setEstablished(Date established) {
		this.established = established;
	}

	/**
	 * @param pysdeOrder the pysdeOrder to set
	 */
	public void setPysdeOrder(String pysdeOrder) {
		this.pysdeOrder = pysdeOrder;
	}

	/**
	 * @param schoolYear the schoolYear to set
	 */
	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}

	/**
	 * @param serviceUnit the serviceUnit to set
	 */
	public void setServiceUnit(Unit serviceUnit) {
		this.serviceUnit = serviceUnit;
	}

	/**
	 * @param workingHoursOnRegularPosition the workingHoursOnRegularPosition to set
	 */
	public void setWorkingHoursOnRegularPosition(
			Integer workingHoursOnRegularPosition) {
		this.workingHoursOnRegularPosition = workingHoursOnRegularPosition;
	}

	/**
	 * @param workingHoursOnServicingPosition the workingHoursOnServicingPosition to set
	 */
	public void setWorkingHoursOnServicingPosition(
			Integer workingHoursOnServicingPosition) {
		this.workingHoursOnServicingPosition = workingHoursOnServicingPosition;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceAllocation [");
		if (employee != null) {
			builder.append("employee=");
			builder.append(employee);
			builder.append(", ");
		}
		if (serviceUnit != null) {
			builder.append("serviceUnit=");
			builder.append(serviceUnit);
			builder.append(", ");
		}
		if (workingHoursOnRegularPosition != null) {
			builder.append("workingHoursOnRegularPosition=");
			builder.append(workingHoursOnRegularPosition);
			builder.append(", ");
		}
		if (workingHoursOnServicingPosition != null) {
			builder.append("workingHoursOnServicingPosition=");
			builder.append(workingHoursOnServicingPosition);
		}
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the serviceType
	 */
	public ServiceAllocationType getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(ServiceAllocationType serviceType) {
		this.serviceType = serviceType;
	}
}
