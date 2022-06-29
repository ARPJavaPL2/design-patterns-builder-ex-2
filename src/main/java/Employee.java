public class Employee {

    private final String name;
    private final String surname;
    private final Address address;

    private Employee(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private String name;
        private String surname;
        private Address address;

        private EmployeeBuilder() {
        }

        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public EmployeeBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public Employee build() {
            return new Employee(name, surname, address);
        }

        public String toString() {
            return "Employee.EmployeeBuilder(name=" + this.name + ", surname=" + this.surname + ", address=" + this.address + ")";
        }
    }
}
