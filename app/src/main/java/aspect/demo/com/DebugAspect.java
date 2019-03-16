package aspect.demo.com;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DebugAspect {

    @Pointcut("execution(@aspect.demo.com.Debug * *(..))")
    public void isDebug() {

    }

    @Around("isDebug()")
    public void around(ProceedingJoinPoint point) {
        if(App.isDebug) {
            Log.i("TLog","is debug model");
            return;
        }

        try {
            point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
