package inherit;

class Tank {

    protected String type = "Tiger";

    public void blast() {
        System.out.println("duaaarrrrrra");
    }
}

class Cannon extends Tank {

    private String modelName = "Samsung";

    public static void main(String[] args) {
        Cannon myCannon = new Cannon();

        myCannon.blast();

        System.out.println(myCannon.type + " " + myCannon.modelName);
    }
}
