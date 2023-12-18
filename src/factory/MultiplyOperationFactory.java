package factory;

public class MultiplyOperationFactory implements ComplexOperationFactory{
    @Override
    public ComplexOperation createOperation() {
        return new MultiplyOperation();
    }
}
