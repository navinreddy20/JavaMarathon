public class Job {
    // properties
    // id, profile, desc, technology

    private int id;
    private String profile;
    private String tech;

    public Job() {
    }

    public Job(int id, String profile, String tech) {
        this.id = id;
        this.profile = profile;
        this.tech = tech;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", profile='" + profile + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
