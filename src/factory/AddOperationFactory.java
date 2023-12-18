package factory;

public class AddOperationFactory implements ComplexOperationFactory{
    @Override
    public ComplexOperation createOperation() {
        return new AddOperation();
    }
}
