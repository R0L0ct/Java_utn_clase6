import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void test1() {
        final double resultado = calculadora.multiplicar(80, 3);
        double esperado = 240;
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void test2() {
        double suma = calculadora.sumar(150, 180);
        final double resultado = calculadora.dividir(suma,3);
        double esperado = 110;
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void test3() {
        double restar = calculadora.restar(90, 50);
        final double resultado = calculadora.multiplicar(restar,15);
        double esperado = 605;
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void test4() {
        double sumar = calculadora.sumar(70, 40);
        final double resultado = calculadora.multiplicar(sumar,25);
        double esperado = 2700;
        Assertions.assertEquals(esperado, resultado);
    }
}
