package src.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        // create a new row
        System.out.println("Created new row in the emplyee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        // delete a row
        System.out.println("Delete row with employeeID " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        // fetch row from db
        System.out.println("Fetching data from DB");
        return new EmployeeDo();
    }
}
