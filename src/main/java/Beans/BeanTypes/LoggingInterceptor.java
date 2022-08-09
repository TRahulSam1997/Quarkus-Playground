package Beans.BeanTypes;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Logged
@Priority(2020)
@Interceptor
public class LoggingInterceptor {
    @Inject
    Logger logger;

    @AroundInvoke
    Object logInvocation(InvocationContext context) throws Exception {
        Object ret = context.proceed();
        return ret;
    }
}
