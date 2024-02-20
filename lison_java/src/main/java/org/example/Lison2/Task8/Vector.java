package org.example.Lison2.Task8;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @apiNote метод вычисляющий длинну вектора
     * @return результат
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @apiNote метод вычисляющий скалярное произведение
     * @param vector2
     * @return результат
     */
    public double scalar(Vector vector2) {
        return x * vector2.getX() + y * vector2.getY() + z * vector2.getZ();
    }

    /**
     * @apiNote метод вычисляющий векторное произведение с другим вектором
     * @param vector2
     * @return результат выведеный в вектор
     */
    public Vector proizved(Vector vector2) {
        return new Vector(
                y * vector2.getZ() - z * vector2.getY(),
                z * vector2.getX() - x * vector2.getZ(),
                x * vector2.getY() - y * vector2.getX());
    }

    /**
     * @apiNote метод, вычисляющий угол между векторами (или косинус угла): косинус угла
     * между векторами равен скалярному произведению векторов, деленному на
     * произведение модулей (длин) векторов:
     * @param vector2
     * @return результат
     */
    public double cosinus(Vector vector2) {
        return scalar(vector2) / (length() * vector2.length());
    }

    /**
     * @apiNote метод суммы
     * @param vector2
     * @return результат выведеный в вектор
     */
    public Vector sum(Vector vector2) {
        return new Vector(x + vector2.getX(), y + vector2.getY(), z + vector2.getZ());
    }

    /**
     * @apiNote метод разности
     * @param vector2
     * @return результат выведеный в вектор
     */
    public Vector derge(Vector vector2) {
        return new Vector(x - vector2.getX(), y - vector2.getY(), z - vector2.getZ());
    }
}
