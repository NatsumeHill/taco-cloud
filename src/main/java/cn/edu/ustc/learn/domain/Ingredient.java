package cn.edu.ustc.learn.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author fangkui
 * Lombok 自动生成getter，setter等方法；
 *
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        /**
         *
         */
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
