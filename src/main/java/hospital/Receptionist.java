package hospital;

public class Receptionist extends Administrator{

    private boolean isOnPhone;

    public Receptionist(String employoeeNumber, String name, String department, boolean isOnPhone){
        super(employoeeNumber, name, department);
        this.isOnPhone = isOnPhone;
    }
    @Override
    public int calculatePay(){
        return 50000;
    }
}
