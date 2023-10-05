public class Factory {

    double start;
    double finish;

    String name;

    public Factory(String name, double start, double finish) {
        this.start = start;
        this.finish = finish;
        this.name = name;
    }

    public double mark(){
        return (this.finish / this.start * 100) - 100;
    }

    @Override
    public String toString() {
        return this.name + " доход в начале года: " + this.start + " ;доход в конце года: " + this.finish;
    }
}
