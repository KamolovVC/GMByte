package Lesson14;

public class ClassForLesson14 {
    private byte hdd = 0;
    private byte ram = 0;

    public byte getHDD() {
        if (hdd < 20) {
            System.out.println("Change value variable hdd");
        } else {
            return hdd;
        }
        return 0;
    }

    public void setHDD(byte hdd) {
        if (hdd < 20) {
            System.out.println("Incorrect value hdd");
        } else {
            this.hdd = hdd;
        }
    }

    public byte getRAM() {
        if (ram <= 32) {
            System.out.println("Change value variable ram");
        } else {
            return ram;
        }
        return 0;
    }

    public void setRAM(byte ram) {
        if (ram <= 32) {
            System.out.println("Incorrect value ram");
        } else {
            this.ram = ram;
        }
    }
}
