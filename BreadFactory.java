package practice1;

import practice1.Employeefactory.EmployeeCriteria;

public class BreadFactory {
	enum EmployeeCriteria {
		EMPLOYEE1, EMPLOYEE2
	}

	private  BreadFactory() {

	}

	public static AbstractItemAPI getObject(EmployeeCriteria criteria) {
		AbstractItemAPI obj = null;
		if (criteria == EmployeeCriteria.EMPLOYEE1) {
			obj = new Employee1();
		} else if (criteria ==  EmployeeCriteria. EMPLOYEE2) {
			obj = new Employee2();
		}
		return obj;
	}

	public static AbstractPersonAPI getObject(EmployeeCriteria criteria, int id, String firstName, String lastName,
			int age, String position) {
		AbstractPersonAPI obj = null;
		if (criteria == EmployeeCriteria.EMPLOYEE1) {
			obj = new Employee1(id, firstName, lastName, age, position);
		} else if (criteria == EmployeeCriteria.EMPLOYEE2) {
			obj = new Employee2(id, firstName, lastName, age, position);
		}
		return obj;
	}

}
