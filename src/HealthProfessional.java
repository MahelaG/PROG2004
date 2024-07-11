public class HealthProfessional {
    private int id;
    private String name;
    private String specialization;

    public HealthProfessional(int id,String name, String specialization){
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public boolean setId(int id){
        if (id >0){
            this.id = id;
        }else {
            return false;
        }
        return true;
    }
    public boolean setName(String name){
        if ((name.length()>2) && (name.length()<10)){
            this.name = name;
        }else{
            return false;
        }
        return true;
    }
    public boolean setSpecialization(String specialization){
        if(specialization != null && !specialization.trim().isEmpty()){
            this.specialization = specialization;
        }else {
            return false;
        }
        return true;
    }
    public String toString(){
        return String.format("professionals [id:%d, name:%s, specialization:%s]",id,name,specialization);
    }
    public static void main (String[] args){
        HealthProfessional professionals1 = new HealthProfessional(1,"Dr.Sam","Dietitian");
        HealthProfessional professionals2 = new HealthProfessional(2,"Dr.Jem","General Practitioner");
        HealthProfessional professionals3 = new HealthProfessional(3,"Dr.Valere","Psychologist");
        HealthProfessional professionals4 = new HealthProfessional(4,"Dr.Mia","Physiotherapist");

        System.out.println(professionals1.toString());
        System.out.println(professionals2.toString());
        System.out.println(professionals3.toString());
        System.out.println(professionals4.toString());


        HealthProfessional[] professionalsList = new HealthProfessional[4];
        professionalsList[0] = new HealthProfessional(1,"Dr.Sam","Dietitian");
        professionalsList[1] = new HealthProfessional(2,"Dr.Jem","General Practitioner");
        professionalsList[2] = new HealthProfessional(3,"Dr.Valere","Psychologist");
        professionalsList[3] = new HealthProfessional(4,"Dr.Mia","Physiotherapist");

        for (HealthProfessional professionals: professionalsList){
            System.out.println(professionals.toString());
        }

    }
}
