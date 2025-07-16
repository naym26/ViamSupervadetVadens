package com.walking.task1.figure;

public class Triangle extends CorrectFigure{
    public static final String type_triangle = "triangle";
    public static final String C_LEFT = "/";
    public static final String C_RIGHT = "\\";
    public static final String C_BOTTOM = "_";
    public static final String C_SPACE = " ";

    public Triangle(){
        super(type_triangle, 0);
    }

    public Triangle(int p_length){
        super(type_triangle, p_length);
    }

    @Override
    public String picture_figure() {
        int length_figure = getLength();

        //построение треугольника:
        //пробелы до + / + пробелы + \
        String string_triangle = "";
        for (int i=length_figure; i!=0; i--){
            //пробелы до
            String prefix_whitespace = "";
            for (int w=1; w<i; w++){
                prefix_whitespace += C_SPACE;
            }

            //пробелы внутри
            String inner_whitespace = "";
            for (int w=(length_figure-i)*2; w!=0; w--){
                //низ треугольника
                if (i == 1)
                    inner_whitespace += C_BOTTOM;
                else
                    inner_whitespace += C_SPACE;

            }

            string_triangle += prefix_whitespace + C_LEFT + inner_whitespace + C_RIGHT + '\n';


        }
        return string_triangle;
    }
}
