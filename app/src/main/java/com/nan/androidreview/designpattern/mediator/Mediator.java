package com.nan.androidreview.designpattern.mediator;

/**
 * 中介者：协调各个同事角色，实现协作
 */
public abstract class Mediator {

    protected ConcreteColleague1 mColleague1;
    protected ConcreteColleague2 mColleague2;

    public abstract void doSomething1();

    public abstract void doSomething2();

    public ConcreteColleague1 getColleague1() {
        return mColleague1;
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        mColleague1 = colleague1;
    }

    public ConcreteColleague2 getColleague2() {
        return mColleague2;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        mColleague2 = colleague2;
    }
}
