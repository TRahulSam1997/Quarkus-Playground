package Beans.BeanTypes;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class Producers {
//    @Produces
    double pi = Math.PI;

    @Produces
    List<String> names() {
        List<String> names = new ArrayList<>();
        names.add("Andy");
        names.add("Adalbert");
        names.add("Joachim");
        return names;
    }
}

@ApplicationScoped
class Consumer {

    @Inject
    double pi;

    @Inject
    List<String> names;

    // ...
}