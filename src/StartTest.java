import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StartTest {

    public static void start(Class c){
        List<Method> methods = new ArrayList<>();
        Method[] classMethods = c.getDeclaredMethods();

        for (Method classMethod : classMethods) {
            if (classMethod.isAnnotationPresent(Test.class)){
                methods.add(classMethod);
            }
        }

        methods.sort(Comparator.comparingInt((Method i)-> i.getAnnotation(Test.class).priority()).reversed());

        for (Method classMethod : classMethods) {
            if (classMethod.isAnnotationPresent(BeforeSuite.class)){
                if (methods.size()>0&& methods.get(0).isAnnotationPresent(BeforeSuite.class)){
                    throw new RuntimeException("@BeforeSuite annotation method>1");
                }
                methods.add(0,classMethod);
            }
        }

        for (Method classMethod : classMethods) {
            if (classMethod.isAnnotationPresent(AfterSuite.class)){
                if (methods.size()>0&& methods.get(methods.size()-1).isAnnotationPresent(AfterSuite.class)){
                    throw new RuntimeException("@AfterSuite annotation method>1");
                }
                methods.add(0,classMethod);
            }
        }

        for (Method classMethod : classMethods) {
            try{
                classMethod.invoke(null);
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }catch (InvocationTargetException e){
                e.printStackTrace();
            }
        }

    }
}
