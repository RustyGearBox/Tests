public abstract class Doctor {

    private String name;
    private Specialty specialty;
    private ConsultRoom consultRoom;

    public Doctor(String name, Specialty specialty, ConsultRoom consultRoom) {
        this.name = name;
        this.specialty = specialty;
        this.consultRoom = consultRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public ConsultRoom getConsultRoom() {
        return consultRoom;
    }

    public void setConsultRoom(ConsultRoom consultRoom) {
        this.consultRoom = consultRoom;
    }

    public abstract String specialStudies();

}

// ENUM for the specialition

enum Specialty {
    GENERAL_MEDICINE, TRAUMATOLOGY, NEUROLOGY;
}

enum ConsultRoom {
    GENERAL_MEDICINE, TRAUMATOLOGY, NEUROLOGY;
}

// Type of doctors and his special actions

class Neurologist extends Doctor {

    public Neurologist(String name, Specialty specialty, ConsultRoom consultRoom) {
        super(name, specialty, consultRoom);
    }

    @Override
    public String specialStudies(){
        return "Making a radiography";
    }

}

class Traumatolosgist extends Doctor {

    public Traumatolosgist(String name, Specialty specialty, ConsultRoom consultRoom) {
        super(name, specialty, consultRoom);
    }

    @Override
    public String specialStudies(){
        return "Making a radiography";
    }

}

class General_Doctor extends Doctor {

    public General_Doctor(String name, Specialty specialty, ConsultRoom consultRoom) {
        super(name, specialty, consultRoom);
    }

    @Override
    public String specialStudies(){
       return null;
    }

}