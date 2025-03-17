package ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageB;

abstract public class BigCatB extends AnimalB {
    public BigCatB(String name) {
        super(name);
    }

    protected abstract void roar();

}
