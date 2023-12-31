package com.proftelran.homework.homework16.searchengine;

import java.util.HashSet;
import java.util.Map;
import java.util.function.Predicate;

public class IntegerPredicate implements Predicate<Product> {

    private int referenceValue;
    private IntegerOperator operator;

    public IntegerPredicate(int referenceValue, IntegerOperator operator) {
        this.referenceValue = referenceValue;
        this.operator = operator;
    }

    @Override
    public boolean test(Product product) {
        Integer value = product.getIntegerProperties().get("weight");
         if (value == null) {
             return false;
       }
        if (this.operator == IntegerOperator.EQUAL) {
            if (this.referenceValue == value) {
                return true;
            }
        }
        if (this.operator.equals(IntegerOperator.NOT_EQUAL)) {
            if (this.referenceValue != value) {
                return true;
            }
        }
        if (this.operator.equals(IntegerOperator.GREATER_THAN)) {
            if (this.referenceValue < value) {
                return true;
            }
        }
        if (this.operator.equals(IntegerOperator.LESS_THAN)) {
            if (this.referenceValue > value) {
                return true;
            }
        }
        if (this.operator.equals(IntegerOperator.LESS_OR_EQUAL_THAN)) {
            if (this.referenceValue >= value) {
                return true;
            }
        }
        if (this.operator.equals(IntegerOperator.GREATER_OR_EQUAL_THAN)) {
           if (this.referenceValue <= value) {
               return true;
           }
        }
       return false;
    }
}
