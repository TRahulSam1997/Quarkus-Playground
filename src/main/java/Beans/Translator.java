package Beans;

import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

class LocalizationService {

}

@ApplicationScoped
public class Translator {

    private final TranslatorHelper helper;

    public Translator(TranslatorHelper helper) {
        this.helper = helper;
    }

    public Translator(TranslatorHelper helper, Instance<Dictionary> dictionaries) {
        this.helper = helper;
        this.dictionaries = dictionaries;
    }

    @Inject
    void setDeps(Dictionary dictionary, LocalizationService locService) {
        //
    }

    @Inject
    Instance<Dictionary> dictionaries;

//    @Counted
//    String translate(String sentence) {
//        for (Dictionary dict : dictionaries) {
//            //
//        }
//
//        return "";
//    }

    String translate(String sentence) {
        //

        return "";
    }

}