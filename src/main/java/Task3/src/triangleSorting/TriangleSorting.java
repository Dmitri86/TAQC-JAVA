package Task3.src.triangleSorting;

/*
Разработать консольную программу, выполняющую вывод треугольников в порядке убывания их площади.
После добавления каждого нового треугольника программа спрашивает, хочет ли пользователь добавить ещё один.
Если пользователь ответит “y” или “yes” (без учёта регистра), программа попросит ввести данные для ещё одного
треугольника, в противном случае – выводит результат в консоль.

•	Расчёт площади треугольника должны производится по формуле Герона.
•	Каждый треугольник определяется именем и длинами его сторон.
Формат ввода (разделитель - запятая):
<имя>, <длина стороны>, <длина стороны>, <длина стороны>
• Приложение должно обрабатывать ввод чисел с плавающей точкой.
• Ввод должен быть нечувствителен к регистру, пробелам, табам.
• Вывод данных должен быть следующем примере:
============= Triangles list: ===============
1. [Triangle first]: 17.23 сm
2. [Triangle 22]: 13 cm
3. [Triangle 1]: 1.5 cm
 */

import java.util.Set;
import java.util.TreeSet;

public class TriangleSorting {
    private static String[] data;
    private static String answer;

    public static void main(String[] args){
        Set<Triangle> triangleSet = new TreeSet<>();
        do{
            do{
                data = InputData.getDataForTriangle();
            }while(!ValidateData.checkData(data));
            Triangle triangle = new Triangle(data);
            triangleSet.add(triangle);
            answer = InputData.getContinue();
        }while(answer.equals("y") || answer.equals("yes"));
        InputData.closeScanner();
        Display.displaySetTriangle(triangleSet);


    }
}