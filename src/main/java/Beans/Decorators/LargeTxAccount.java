package Beans.Decorators;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import java.math.BigDecimal;

interface Account {
    void withdraw(BigDecimal amount);
}

@Priority(10)
@Decorator
public class LargeTxAccount implements Account {
    @Inject
    @Any
    @Delegate
    Account delegate;

    @Inject
    LogService logService;

    public void withdraw(BigDecimal amount) {
        delegate.withdraw(amount);
        if(amount.compareTo(BigDecimal.valueOf(1000)) > 0) {
            logService.logWithdrawal(delegate, amount);
        }
    }
}
