package homework31;

public class Register {
    private String name;
    private String job;

    public Register(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Register() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
