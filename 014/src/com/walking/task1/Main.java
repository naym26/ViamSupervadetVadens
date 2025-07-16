package com.walking.task1;

import com.walking.task1.figure.CorrectFigure;
import com.walking.task1.figure.Square;
import com.walking.task1.figure.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите тип фигуры: ");
        String figure = in.nextLine();

        System.out.print("¬ведите длину фигуры: ");
        int length = in.nextInt();
        in.close();
        /*Square square = new Square(5);
        Triangle triangle = new Triangle(5);
        System.out.println(square.picture_figure());
        System.out.println(triangle.picture_figure());*/

        CorrectFigure correctFigure;
        /*if (figure.equals(Square.type_square)) {
            correctFigure = new Square(length);
        }
        else if (figure.equals(Triangle.type_triangle)){
            correctFigure = new Triangle(length);
        }
        else
            System.out.println("¬ведена некорректна€ фигура");*/
        switch (figure){
            case Square.type_square:
                correctFigure = new Square(length);
                break;
            case Triangle.type_triangle:
                correctFigure = new Triangle(length);
                break;
            default:
                correctFigure = new CorrectFigure();
                System.out.println("¬ведена некорректна€ фигура");
        }

        System.out.println(correctFigure.picture_figure());

    }
}
