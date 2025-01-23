package dayseventh.collections.comparatorpersonproject;

class ComparatorPerson {
    String name;
    int age;

    ComparatorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
