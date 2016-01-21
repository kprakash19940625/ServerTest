import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Main.class);
      System.out.println("Total Test Cases Runned : "+getRunCount());
      System.out.println("Total Test Cases Failed : "+getFailureCount());
      System.out.println("Total Test Cases Successful : "+(getRunCount()-getFailureCount()));
   }
}
