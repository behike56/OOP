package abstpolymorphism.after;

/**
 *
 */
public class AfterMain {

    public static void main(String[] args){

        AfterEmployee emp;
        emp = new AfterEmployee();

        int result = emp.payAmount();

        System.out.println(result);
    }
}
