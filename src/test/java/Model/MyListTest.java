package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

class MyListTest {

    int[] arr1;
    int[] arr2;
    int[] arr3;
    MyList myList;
    MyList myListMock;
    double avgArrayValue1;
    double avgArrayValue2;

    @BeforeEach
    void setUp() {
        myList = new MyList();
        myListMock = mock(MyList.class);
        arr1 = new int[]{1,2,3,4,5};
        arr2 = new int[]{1,1,1,1,1};
        arr3 = new int[]{1,2,0,0,0};
        avgArrayValue1 = 1.0;
        avgArrayValue2 = 3.0;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compareArray() {
        double avg1 = myList.averageArray(arr1);
        double avg2 = myList.averageArray(arr2);
        myList.compareArray(avg1, avg2);
    }

    @Test
    void averageArray() {
        assertThat(myList.averageArray(arr1)).isEqualTo(3.0);
        //проверка с помощью Mock
        when(myListMock.averageArray(arr1)).thenReturn(avgArrayValue1);
    }

    @Test
    void createArray() {
        //проверка на длину списка
        assertThat(myList.createArray().length).isEqualTo(10);
        //проверка с помощью Mock
        when(myListMock.createArray()).thenReturn(arr1);
    }
}