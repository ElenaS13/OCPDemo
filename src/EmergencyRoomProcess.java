public class EmergencyRoomProcess {
    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();
        Employee peg = new Nurse(1, "Peg", "emergency", true);

        ERDirector.callUpon(peg);


        Employee suz = new Doctor(1, "Suz", "emergency", true);
        ERDirector.callUpon(suz);

    }
}
