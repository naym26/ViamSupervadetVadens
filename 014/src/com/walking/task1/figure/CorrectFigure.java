package com.walking.task1.figure;

public class CorrectFigure {
    private String type_figure;
    private int length;

    public int getLength() {
        return length;
    }

    public CorrectFigure(){
        this.type_figure = "none";
        this.length = 0;
    }

    CorrectFigure(String p_type_figure, int p_length){
        this.type_figure = p_type_figure;
        this.length = p_length;
    }

    public String picture_figure(){
        return "unknown figure";
    }
}
