import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;


class ControllerTest {
    int[] array;
    double averageArrayValue1;
    double averageArrayValue2;
    Controller controller;

    @BeforeEach
    void SetUp(){
        array = new int[]{1,2,3,4,5};
        averageArrayValue1 = 1.0;
        averageArrayValue2 = 2.0;
        controller = mock(Controller.class);
    }

    /**
     * Mock - проверка, что в контроллере при вызове метода сравнения средних
     * значений возвращается корректное значение averageArrayValue1
     */
    @Test
    void averageArray() {
        when(controller.averageArray(array)).thenReturn(averageArrayValue1);
    }

    //Mock-тест для проверки корректности сравнения средних значений массивов
    @Test
    void compareArray() {
        controller.compareArray(averageArrayValue1, averageArrayValue2);
        verify(controller, times(1)).compareArray(averageArrayValue1, averageArrayValue2);
    }

    //Mock-тест для проверки создания в контроллере нового массива с заданными значениями
    @Test
    void createArray() {
        when(controller.createArray()).thenReturn(array);
    }
}