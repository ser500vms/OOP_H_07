package factory;
import java.util.logging.Logger;
public class ComplexCalculator {
    private ComplexOperationFactory complexOperationFactory;
    private Logger logger;

    public ComplexCalculator(ComplexOperationFactory complexOperationFactory, Logger logger) {
        this.complexOperationFactory = complexOperationFactory;
        this.logger = logger;
    }

    public ComplexNumber performOperation(ComplexNumber a, ComplexNumber b) {
        ComplexOperation complexOperation = complexOperationFactory.createOperation();
        ComplexNumber result = complexOperation.operate(a, b);
        log("Operation: " + a + " + " + b + " = " + result);
        return result;
    }

    private void log(String message) {
        logger.info(message);
    }
}
