public class Question3_IfElseVsSwitch {
    public static void main(String[] args) {
        String vehicle = "mobil";

        // if-else
        if (vehicle.equals("motor")) {
            System.out.println("Kendaraan roda dua");
        } else if (vehicle.equals("mobil")) {
            System.out.println("Kendaraan roda empat");
        } else {
            System.out.println("Jenis kendaraan lainnya");
        }

        // switch-case
        switch (vehicle) {
            case "motor":
                System.out.println("Kendaraan roda dua");
                break;
            case "mobil":
                System.out.println("Kendaraan roda empat");
                break;
            default:
                System.out.println("Jenis kendaraan lainnya");
        }
    }
}
