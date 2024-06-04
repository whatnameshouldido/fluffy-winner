package com.studymavernspringboot.study001;

import com.studymavernspringboot.study001.MathExam.MathExam;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exam001Test {
    @Test
    public void subtract001() throws Exception{
        // given    테스트하기 위한 준비 동작
//        int num1 = -50001;
//        int num2 = 3;
//        int expected = -50004;
        MathExam math = new MathExam();
        // when     테스트를 실시
//        int actual = subTest001(num1, num2);
        // then     실제값과 기대값을 비교해서 테스트한다.
        assertThat(-1).isEqualTo(math.subTest001(2, 3));
        assertThat(98).isEqualTo(math.subTest001(100, 2));
        assertThat(11).isEqualTo(math.subTest001(18, 7));
        assertThat(29).isLessThan(math.subTest001(100, 70));
        assertThat(301).isGreaterThan(math.subTest001(1000, 700));

        //Exception 예외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.subTest001(70000, 7)).isInstanceOf(Exception.class);
        //RuntimeException 예외가 발생해야지만 정상 동작으로 인신한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.subTest001(77, 77777);
        });
        if (exception instanceof RuntimeException) {
        }
        System.out.println(exception.toString());
    }

    @Test
    public void multiply001() throws Exception {
        //given
        MathExam math = new MathExam();
        //when
        //then
        assertThat(12).isEqualTo(math.mathTest002(3, 4));
        assertThat(513).isEqualTo(math.mathTest002(27, 19));
        assertThatThrownBy(() -> math.mathTest002(-1, 10)).isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest002(10, 101)).isInstanceOf(Exception.class);
    }

    @Test
    public void compare001() throws Exception {
        //given
        MathExam math = new MathExam();
        //when
        //then
        assertThat(-1).isEqualTo(math.mathTest004(2, 3));
        assertThat(1).isEqualTo(math.mathTest004(11, 11));
        assertThat(-1).isEqualTo(math.mathTest004(7, 99));
    }

    @Test
    public void exam120585() throws Exception {
        System.out.println("exam120585");
        MathExam math = new MathExam();
        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120585(new int[] {}, 150));
        System.out.println(ex1.toString());
        Throwable ex2 = assertThrows(Exception.class, () -> math.exam120585(new int[] {150, 201}, 130));
        System.out.println(ex2.toString());
        Throwable ex3 = assertThrows(Exception.class, () -> math.exam120585(new int[] {150, 180}, 201));
        System.out.println(ex3.toString());

        assertThat(math.exam120585(new int[] {149, 180, 192, 170}, 167)).isEqualTo(3);
        assertThat(math.exam120585(new int[] {180, 120, 140}, 190)).isEqualTo(0);
        assertThat(math.exam120585(new int[] {169, 177, 181, 190, 157, 159, 182}, 170)).isEqualTo(4);
    }
}