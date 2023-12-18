package factory;

public class AddOperation implements ComplexOperation{
    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}
