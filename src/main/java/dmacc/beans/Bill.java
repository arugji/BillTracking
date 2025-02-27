/**
 * @author Bryner Gibson - bpgibson1
 * CIS175 - Fall 2021
 * Nov 16, 2021
 */
package dmacc.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bill {

	@Id
	@GeneratedValue
	private long id;
	private int total;
	private float tax;
	private String description;
	private String activity;
	private int paid = 0;
	// private Customer customer; customer will inherit from person
	// date variable *** look at input page for further guidance on variable name
	// ***

	@ManyToOne(fetch = FetchType.LAZY)
	private Employee employee;
	private long empId;
	private int approved;
	private String dueDate;
	private Date createdDate;
	

	public Bill(long id, int total, float tax, String description, String activity, int paid, Employee employee,
			long empId, int approved, String dueDate, Date createdDate) {
		super();
		this.id = id;
		this.total = total;
		this.tax = tax;
		this.description = description;
		this.activity = activity;
		this.paid = paid;
		this.employee = employee;
		this.empId = empId;
		this.approved = approved;
		this.dueDate = dueDate;
		this.createdDate = createdDate;
	}

	// TODO: constructors
	public Bill(long id, int total, float tax, String desc, String activity, int approved) {
		super();
		this.id = id;
		this.total = total;
		this.tax = tax;
		this.description = desc;
		this.activity = activity;
		this.approved = approved;
	}

	public Bill(int total, float tax, String desc, String activity) {
		super();
		this.total = total;
		this.tax = tax;
		this.description = desc;
		this.activity = activity;
	}

	public Bill(int total, float tax) {
		super();
		this.total = total;
		this.tax = tax;
		this.paid = 0;
	}

	public Bill(int total) {
		this.total = total;
	}

	public Bill() {
		super();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
		this.setEmpId(employee.getId());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public int getApproved() {
		return approved;
	}

	public void setApproved(int approved) {
		this.approved = approved;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
