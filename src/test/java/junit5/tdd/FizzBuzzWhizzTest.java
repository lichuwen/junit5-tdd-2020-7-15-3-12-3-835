package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWhizzTest {

    @Test
    void should_return_1_when_play_fizz_buzz_whizz_given_1(){
        //given
        int number = 1;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("1",actual);
    }

    @Test
    void should_return_Fizz_when_play_fizz_buzz_whizz_given_3(){
        //given
        int number = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("Fizz",actual);
    }

    @Test
    void should_return_Buzz_when_play_fizz_buzz_whizz_given_5(){
        //given
        int number = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("Buzz",actual);
    }
}
