package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    /* Autowired
    1. 기본적으로 타입으로 찾는다. ex) Food
    2. 이름으로 찾는다. ex) pizza, chicken
    * */
    // Primary가 추가되면 Bean이 여러개라도 우선적으로 찾아준다.
    // Qualifier 별칭으로 찾아준다.
    /* Primary vs Qualifier
    Primary : 범용적으로 사용
    Qealifier : 지역적으로 사용 / 우선순위 더 높음 / Qualifier이라고 명시해줘야 사용가능
     */

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("primary와 Qualifier 우선순위 확인")
    void test1() {
        food.eat();
    }
}
