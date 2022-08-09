package Beans.Qualifiers;

import Beans.Dictionary;
import Beans.Translator;
import Beans.TranslatorHelper;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;

@Superior
@ApplicationScoped
public class SuperiorTranslator extends Translator {
    public SuperiorTranslator(TranslatorHelper helper, Instance<Dictionary> dictionaries) {
        super(helper, dictionaries);
    }

    String translate(String sentence) {
        return "";
    }
}
