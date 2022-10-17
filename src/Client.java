class Client {
    private int index;
    private int year;
    private int age;
    private String name;
    private String movie;

    public Client(int index, int year, int age, String name, String movie){
        setIndex(index);
        setYear(year);
        setAge(age);
        setName(name);
        setMovie(movie);
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getIndex() {
        return index;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getMovie() {
        return movie;
    }

}

