import java.util.logging.Logger;
import factory.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexOperationFactory addFactory = new AddOperationFactory();
        ComplexOperationFactory multiplyFactory = new MultiplyOperationFactory();
        ComplexOperationFactory divideFactory = new DivideOperationFactory();

        ComplexCalculator addCalculator = new ComplexCalculator(addFactory, logger);
        ComplexCalculator multiplyCalculator = new ComplexCalculator(multiplyFactory, logger);
        ComplexCalculator divideCalculator = new ComplexCalculator(divideFactory, logger);

        addCalculator.performOperation(num1, num2);
        multiplyCalculator.performOperation(num1, num2);
        divideCalculator.performOperation(num1, num2);


    }
}