public class QueryUtil {


    public static String insertEmployee() {

        return "INSERT INTO EMPLOYEE_INFO (EMP_NO,EMP_NAME,EMP_SALARY) VALUES (?,?,?)";
    }
}
