package com.walking.task1.figure;

public class Square extends CorrectFigure{
    public static final String type_square = "square";
    public static final String C_LENGTH = "-";
    public static final String C_WIDTH = "|";
    public static final String C_CORNER = "#";
    public static final String C_SPACE = " ";

    public Square(){
        super(type_square, 0);
    }

    public Square(int p_length){
        super(type_square, p_length);
    }

    @Override
    public String picture_figure(){
        int length_figure = getLength();

        //первая и последня строка
        String length_string = C_LENGTH;
        for (int i=1; i <= length_figure-1; i++){
            length_string += C_LENGTH;
        }
        length_string = C_CORNER + length_string + C_CORNER;

        //строка пробелов
        String clear_string = C_SPACE;
        for (int i=1; i <= length_figure-1; i++){
            clear_string += C_SPACE;
        }

        //середина
        String body_string = C_WIDTH + clear_string + C_WIDTH + '\n';
        for (int i=1; i <= length_figure-3; i++){
            body_string += body_string;
        }

        String full_string = length_string + '\n' + body_string + length_string;

        return full_string;
    }
}
