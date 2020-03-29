package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 20:35
 **/
@Aspect
public class TestAspect {

    @Pointcut("execution(* transfer(..))") // the pointcut expression
    private void anyOldTransfer() {} // the pointcut signature
}
