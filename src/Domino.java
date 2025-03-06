public class Domino {
    private int top;
    private int bottom;

    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return this.top;
    }

    public int getBottom() {
        return this.bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString() {
        return this.top + "/" + this.bottom;
    }

    public void flip() {
        int temp = this.top;
        this.top = this.bottom;
        this.bottom = temp;
    }

    public void settle() {
        if (this.top > this.bottom) {
            flip();
        }
    }

    public int compareTo(Domino other) {
        this.settle();
        other.settle();

        if (this.top < other.getTop()) {
            return -1;
        } else if (this.top > other.getTop()) {
            return 1;
        } else {
            if (this.bottom < other.getBottom()) {
                return -1;
            } else if (this.bottom > other.getBottom()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other) {
        int thisTotal = this.top + this.bottom;
        int otherTotal = other.getTop() + other.getBottom();
        if (thisTotal < otherTotal) {
            return -1;
        } else if (thisTotal> otherTotal) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean canConnect(Domino other) {
        return (this.top == other.getTop() || this.top == other.getBottom() || this.bottom == other.getTop() || this.bottom == other.getBottom());
    }
}