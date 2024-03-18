package test.one;

public class Rectangle {
    int x1, y1, x2, y2;

    //기본생성자
    public Rectangle() {
    }

    //설정하는 생성자
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void set(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int square() {
        return (x2 - x1) * (y2 - y1);
    }

    public void show() {
        System.out.println("좌표1 : (" + x1 + ", " + y1 + ")");
        System.out.println("좌표2 : (" + x2 + ", " + y2 + ")");
        System.out.println("넓이 : " + square());
    }

    public boolean equals(Rectangle r) {
        if (square() == r.square()) {
            return true;
        }
        else {
            return false;
        }
    }
}

