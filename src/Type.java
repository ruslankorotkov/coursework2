public enum Type {
    WORK(" рабочие задачи. "),
    PERSONAL(" личные задачи. ");
    private final String type;
    Type(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return  type ;
    }
}
