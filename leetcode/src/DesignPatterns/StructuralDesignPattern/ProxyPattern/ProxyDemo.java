public class ProxyDemo {
    public static void main(String[] args) {
       Employee em = new EmployeeProxy("John Doe", "ID1", "Software Engineer",false);
       System.out.println(em.create());
         em = new EmployeeProxy("John Geo","ID2", "Software Engineer",true);
        System.out.println(em.create());
    }
}