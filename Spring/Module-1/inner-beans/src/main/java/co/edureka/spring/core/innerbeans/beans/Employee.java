package co.edureka.spring.core.innerbeans.beans;

public class Employee {
	private Integer empId;
	private String empName;
	private Address empAddress;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [ID= " + empId + "| NAME= " + empName + "| ADDRESS= " + empAddress + "]";
	}

}
