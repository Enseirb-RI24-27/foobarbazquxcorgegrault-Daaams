package com.jad;

import java.util.ArrayList;

public class Foo {

    private Bar bar;
    private ArrayList<Baz> bazs = new ArrayList<Baz>();
    private Qux qux;
    private Corge corge;
    private ArrayList<Grault> graults = new ArrayList<>();
    Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
        this.corge = new Corge();
    }

    public void addBaz(Baz baz) {
        if (baz == null) {
            return;
        }
        this.bazs.add(baz);
    }

    public void addGrault() {
        return;
    }
}
