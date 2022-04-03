package com.techreturners.class_diagram_and_encapsulation_activity.model;

public enum Grade {
    A {
        @Override
        public Grade before(){
            return this;
        }
    },
    B,
    C,
    D,
    E,
    F{
        @Override
        public Grade next(){
            return this;
        }
    };

    public Grade next(){
        return values()[ordinal() + 1];
    }

    public Grade before(){
        return values()[ordinal() - 1];
    }
}
