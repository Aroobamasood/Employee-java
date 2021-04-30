public class Main implements Interface {
   
    @Override
    public void behaviour() {
    
    }
    public static void main(String[] args) {
     Employee emp = new Employee();
     emp.behaviour();

     Ninja ninja = new Ninja();
     ninja.behaviour();

     NinjaEmployee obj = new NinjaEmployee();
     obj.behaviour();

    }

}
