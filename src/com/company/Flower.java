package com.company;

public class Flower {
    private petal petals;
    private String name;

    public Flower(String name) {
        this.name = name;
        this.petals = new petal();
    }

    public void blossom() {
        System.out.print("Flower1 " + name + " is blossoming");
        petals.use();
    }

    public void wither() {
        System.out.println("Flower2 " + name + " is withering");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (!petals.equals(flower.petals)) return false;
        return name.equals(flower.name);

    }

    @Override
    public int hashCode() {
        int result = petals.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flower : '" + name + "'";
    }
}

