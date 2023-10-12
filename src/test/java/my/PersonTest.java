package my;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonTest {
    @Test
    void testPersonName() {

        //Given
        String expected = "Bob";

        //When
        Person person = new Person(expected);
        //Then
        assertEquals(expected, person.getName());

    }

    @Test
    void testPersonAge() {

        //Given
        int expected = 5;

        //When
        Person person = new Person(expected);
        //Then
        assertEquals(expected, person.getAge());

    }

    @Test
    void testPersonNameAge() {

        //Given
        String expectedName = "Bob";
        int expectedAge = 5;

        //When
        Person person = new Person(expectedName,expectedAge);
        //Then
        assertEquals(expectedName, person.getName());
        assertEquals(expectedAge, person.getAge() );

    }



    @Test
    void setName() {
        Person person = new Person();

        //Given
        String expected = "Bob";

        //When
        person.setName(expected);
        String actual = person.getName();
        //Then
        assertEquals(expected,actual);

    }

    @Test
    void setAge() {
        Person person = new Person();

        //Given
        int expected = 5;
        //When
        person.setAge(expected);
        int actual = person.getAge();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void getName() {


        //Given
        String expected = "Bob";
        //When
        Person person = new Person(expected);
        //Then
        assertEquals(expected, person.getName());
    }

    @Test
    void getAge() {

        //Given
        int expected = 5;
        //When
        Person person = new Person(expected);
        //Then
        assertEquals(expected, person.getAge());
    }

    @Test
    void addName() {
        Person person = new Person();

        //Given
        int expected = 2;
        //When
        person.addName("Bob");
        person.addName("Billy");
        //Then
        assertEquals(expected, person.getSizeOfList());
    }

    @Test
    void removeName() {
        Person person = new Person();

        //Given
        person.addName("Bob");
        person.addName("Billy");
        int expected = 1;
        //When
        person.removeName("Billy");
        //Then\
        assertEquals(expected, person.getSizeOfList());

    }

    @Test
    void getSizeOfList() {
        Person person = new Person();

        //Given
        int expected = 2;
        //When
        person.addName("Bob");
        person.addName("Billy");
        //Then
        assertEquals(expected, person.getSizeOfList());
    }
}