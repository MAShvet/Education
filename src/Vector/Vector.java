package Vector;

public class Vector
{
    // Порядковый номер объекта
    private int numberObject;
    static int i = 1;
    // Три приватных поля координат
    private double x;
    private double y;
    private double z;

    // При создании объектна на основе класса Vector сработает данный конструктор
    public Vector(double x,double y,double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.numberObject = i;
        i++;
    }

    // Данный метод считает длину вектора, и возвращает значение
    public double lengthVector()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /*
    Данный метод, определяет скалярное произведение 2-х векторов
    name_Vector1.scalarProduct(name_Vector2)
    name_Vector1 (x,y,z) ,а name_Vector2 (new_object.x, new_object.y, new_object.z)
    */
    public double scalarProduct(Vector new_object)
    {
        return x * new_object.x + y * new_object.y + z * new_object.z;
    }

    /*
    Данный метод, определяет векторное произведение 2-х векторов
    name_Vector1.crossProduct(name_Vector2)
    name_Vector1 (x,y,z) ,а name_Vector2 (new_object.x, new_object.y, new_object.z)
    метод возвращает новый объект
    */
    public Vector crossProduct(Vector new_object)
    {
        return new Vector(
                y * new_object.z - z * new_object.y,
                z * new_object.x - x * new_object.z,
                x * new_object.y - y * new_object.x);
    }

    /*
        Данный метод, вычисляет косинус угла между 2-мя векторами
        name_Vector1.cos(name_Vector2)
        length() - name_Vector1
        new_object.length() - name_Vector2
     */
    public double cos(Vector new_object)
    {
        return scalarProduct(new_object) / (lengthVector() * new_object.lengthVector());
    }

    /*
        Данный метод вычиссляет сумму векторов
    */
    public Vector addition_Vectors(Vector new_object)
    {
        return new Vector(
                x + new_object.x,
                y + new_object.y,
                z + new_object.z
        );
    }

    /*
        Данный метод вычисляет разность векторов
    */
    public Vector subtraction_Vectors(Vector new_object)
    {
        return new Vector(
                x - new_object.x,
                y - new_object.y,
                z - new_object.z
        );
    }

    /*
        Данный метод генерирует n-ое количество векторов
    */
    public static Vector[] generate(int n)
    {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++)
        {
            vectors[i] = new Vector(
                    Math.floor(Math.random() * 10),
                    Math.floor(Math.random() * 10),
                    Math.floor(Math.random() * 10));
        }
        return vectors;
    }

    @Override
    public String toString()
    {
        return "Vector #"+ this.numberObject + " {" +
                "x=" + this.x +
                ", y=" + this.y +
                ", z=" + this.z +
                '}';
    }

}
