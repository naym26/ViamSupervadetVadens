/*
����������� �����-�������. ������ ������ ������ ��������� �������� �������� �, ���������������, ������������� �������.

����������� ��� ���������� ������ ����������� � ����� �����������, � ����� (�������� �������� � ����� ������ ���������������� ��� 0),
������ ���������� � ���������� ��������� �� 1 � �� �������� ������������� ����� ��������. ������ ������ ���������� ���������� �������� ��������.

��������� ��������� �����, ��������� ���������� ������ � ���������� �������� ����� � ���� �� 1 �� 100. �������� ���������� ��������� ������� � �������.

������ ������ � �������:
   �������� �����: 50
   ������ �����: 50
 */
public class task1 {
    public static void main(String[] args){
        counter positive = new counter("������ �����");
        counter negative = new counter("�������� �����");
        for (int i = 1; i <= 100; i++){
            if (i%2 == 0){
                positive.increase();
            }
            else{
                negative.increase();
            }
        }
        positive.displayInfo();
        negative.displayInfo();

    }

}
class counter{
    String name;
    int value;

    counter(String name, int value){
        this.name = name;
        this.value = value;
    }

    counter(String name){
        this(name, 0);
    }

    int increase(){
        this.value += 1;
        return this.value;
    }

    int increase(int value){
        this.value += value;
        return this.value;
    }

    int decrease(){
        this.value -= value;
        return this.value;
    }

    int decrease(int value){
        this.value -= value;
        return this.value;
    }

    void displayInfo(){
        System.out.printf("%s:\t %d\n", name, this.value);
    }

}
