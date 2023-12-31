package com.proftelran.homework.homework16.searchengine;

import java.util.Map;
import java.util.function.Predicate;

public class StringPredicate implements Predicate<Product> {
    private Flavour referenceFlavour;
    private StringOperator operator;

    public StringPredicate(Flavour referenceFlavour, StringOperator operator) {
        this.referenceFlavour = referenceFlavour;
        this.operator = operator;
    }

    @Override
    public boolean test(Product product) {
        for (Map.Entry<Color, Flavour> entry : product.getStringProperties().entrySet()) {
            Flavour value = entry.getValue();
            if (value == null) {
                return false;
            }
            if (this.operator == StringOperator.EQUAL) {
                if (this.referenceFlavour.equals(value)) {
                    return true;
                }
            }
            if (this.operator == StringOperator.NOT_EQUAL) {
                if (!this.referenceFlavour.equals(value)) {
                    return true;
                }
            }

        }
        return false;
    }
}

