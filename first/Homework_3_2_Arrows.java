package first;

import java.util.Random;

public class Homework_3_2_Arrows {

    public String arrows;
    private final String[] symvoly = {">", "<", "-"};
    String rightArrow = ">>-->";
    String leftArrow = "<--<<";
    private Random strely = new Random();

    //Создаем строку из символов длиной 106 символов
    public Homework_3_2_Arrows() {
        StringBuilder sb = new StringBuilder(106);
        for (int i = 0; i < 106; i++) {
            String randomSym = symvoly[strely.nextInt(symvoly.length)];
            sb.append(randomSym);
        }
        this.arrows = sb.toString();
    }

    public String getArrows() {
        return arrows;
    }

    //Считаем стрелы
    public int[] countArrows() {
        int rightCount = 0;
        int leftCount = 0;
        int index = 0;

        //Проверяем каждые пять символов на наличие нужной последовательности
        while (index <= arrows.length() - 5) {
            String substring = arrows.substring(index, index + 5);

            if (substring.equals(rightArrow)) {
                rightCount++;
                index += 5;  // Если стрела найдена, то пропускаем 5 символов, чтобы не перекрывать стрелы
            } else if (substring.equals(leftArrow)) {
                leftCount++;
                index += 5;
            } else {
                index++;  // Если стрела не найдена, двигаемся на 1 символ
            }
        }

        return new int[]{rightCount, leftCount};
    }

    //Создаем экземпляр в main и выводим количество найденных стрел
    public static void main(String[] args) {
        Homework_3_2_Arrows arrowsStringGen = new Homework_3_2_Arrows();
        String sgenStroka = arrowsStringGen.getArrows();

        int[] counts = arrowsStringGen.countArrows();
        System.out.println("Количество стрел >>-->: " + counts[0] + ", " + "Количество стрел <--<<: " + counts[1]);
    }
}