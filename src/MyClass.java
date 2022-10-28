public class MyClass {
    public int quotient(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Y cannot be zero");
        }

        return x / y;
    }

    public float quotfloat(int x, int y) {
        if (y == 0 || x == 0) {
            throw new IllegalArgumentException("Values cannot be zero");
        }

        return (float) (x / y * 0.5);
    }

    public boolean quotbool(int x, int y) {
        if (y != 0 && x != 0) {
            return  true;
        } else {
            return false;
        }
    }

    public Object quotnull(int x) {
        if (x != 0) {
            return null;
        }
        return true;
    }
}
