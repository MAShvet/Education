package Vector;

public class Main
{
    public static void main(String[] args)
    {
        // необходимо вводить четное число
        int nVectors = 2;
        Vector[] vectors = Vector.generate(nVectors);

        System.out.println();
        for (int i = 0; i < vectors.length; i += 2)
        {
            System.out.println(vectors[i]);
            System.out.println(vectors[i + 1]);

            System.out.println("Длина вектора: " + vectors[i].lengthVector());

            System.out.println("Скалярное произведение: " + vectors[i].scalarProduct(vectors[i + 1]));

            System.out.println("Векторное произведение: " + vectors[i].crossProduct(vectors[i + 1]));

            System.out.println("Угол между векторами: " + vectors[i].cos(vectors[i + 1]));

            System.out.println("Сумма векторов: " + vectors[i].addition_Vectors(vectors[i + 1]));

            System.out.println("Разность векторов: " + vectors[i].subtraction_Vectors(vectors[i + 1]));

            System.out.println("======================================");
            System.out.println();
        }
    }
}
