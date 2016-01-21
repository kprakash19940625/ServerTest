import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Main.class);
      System.out.println("Total Test Cases Runned : "+result.getRunCount());
      System.out.println("Total Test Cases Failed : "+result.getFailureCount());
      System.out.println("Total Test Cases Successful : "+(result.getRunCount()-result.getFailureCount()));
   }
}
