package Beans;

import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

class Dictionary {

}

@ApplicationScoped
public class Translator {

    @Inject
    Dictionary dictionary;

    @Counted
    String translate(String sentence) {

        return "";
    }

}
