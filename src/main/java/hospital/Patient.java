package hospital;

public class Patient {

    private int bloodLevel;
    private int healthLevel;


    public int getHealthLevel() {
        return healthLevel;

    }

    public int getBloodLevel() {
        return bloodLevel;

    }

    //overload constructor (constructors are very popular code blocks to overload}
    //if no parameters put in, program uses default patient, otherwise, this constructor is used.
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;
    }


    //default constructor for a patient object
        public Patient(){
            healthLevel = 10;  //default patient health level
            bloodLevel = 20;
        }

    public void increaseHealthLevel(int healthIncreasedAmount) {
        healthLevel += healthIncreasedAmount;
    }



    public void decreaseBloodLevel(int bloodDecreasedAmount) {
        bloodLevel -= bloodDecreasedAmount;
    }
}

