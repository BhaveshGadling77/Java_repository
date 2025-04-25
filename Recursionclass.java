interface myCamera {
    void takePic();

    void recordVid();
}

interface mywifi {
    String[] getnet();

    void connectToNet(String net);
}

class myCellPhone {
    void cellNum(int phNum) {
        System.out.println("Calling " + phNum);
    }

    void pickCall() {
        System.out.println("Connecting.......");
    }

}

class mySmartPhone extends myCellPhone implements mywifi, myCamera {

    public void takePic() {
        System.out.println("Taking picture.....");
    }

    public void recordVid() {
        System.out.println("Recording video.....");
    }

    public String[] getnet() {
        System.out.println("Getting list of networks");
        String[] netlist = { "Bhavesh", "Vi", "Idea", "BSNl" };
        return netlist;
    }

    @Override
    public void connectToNet(String net) {
        throw new UnsupportedOperationException("Unimplemented method 'connectToNet'");
    }
}

public class Recursionclass {
    public static void main(String[] args) {
        mySmartPhone obj = new mySmartPhone();
        String[] ar = obj.getnet();

    }
}