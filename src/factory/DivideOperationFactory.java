package factory;

public class DivideOperationFactory implements ComplexOperationFactory{
    @Override
    public ComplexOperation createOperation() {
        return new DivideOperation();
    }
}
