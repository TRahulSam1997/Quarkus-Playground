package Beans;

import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

class Dictionary {

}

@ApplicationScoped
public class Translator {

    @Inject
    Instance<Dictionary> dictionaries;

    @Counted
    String translate(String sentence) {
        for (Dictionary dict : dictionaries) {
            //
        }

        return "";
    }

}
