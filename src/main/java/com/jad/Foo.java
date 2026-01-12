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
    }

    public void addBaz(Baz baz) {
        if (baz == null) {
            return;
        }
        this.bazs.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }

    public Bar getBar() {
        return this.bar;
    }

    public ArrayList<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public ArrayList<Grault> getGraults() {
        return this.graults;
    }

    public void setCorge(Corge corge) {
        if (this.corge != null) {
            this.corge.setFoo(null);
        }
        this.corge = corge;
    }
}
