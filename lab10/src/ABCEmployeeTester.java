public class ABCEmployeeTester {

    public static void main(String[] args) {
        new ABCEmployeeTester().runApp();
    }

    public void runApp(){
        ABCEmployee employee1 = new ABCEmployee();
        employee1.setName("Susan Meyers");
        employee1.setId(47899);
        employee1.setDept("Accounting");
        employee1.setPosition("Vice President");

        ABCEmployee employee2 = new ABCEmployee("Mark Jones",39119);
        employee2.setDept("IT");
        employee2.setPosition("Programmer");

        ABCEmployee employee3 = new ABCEmployee("Joy Rogers",81774,"Manufacturing","Engineer");

        System.out.println("Name: "+employee1.getName());
        System.out.println("ID NO.:"+employee1.getId());
        System.out.println("Department: "+employee1.getDept());
        System.out.println("Position: "+employee1.getPosition());

        System.out.println();
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }

}
