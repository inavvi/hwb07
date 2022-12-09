public class Mechanic {
    private String fio;
    private String license;
    private String company;

    public Mechanic (String fio,String company, String license) {
        this.fio=fio;
        this.license=license;
        this.company=company;
    }


    public String getCompany() {return company;}

    public String getFio() {
        return fio;
    }

    public String getLicense() {
        return license;
    }

}
