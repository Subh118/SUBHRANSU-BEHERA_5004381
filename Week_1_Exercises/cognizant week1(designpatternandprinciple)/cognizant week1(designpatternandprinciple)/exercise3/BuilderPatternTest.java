package exercise3;

public class BuilderPatternTest {
    public static void main(String[] args) {
        try {
            // Create a Computer with all options
            Computer gamingComputer = new Computer.Builder("Intel Core i9", "32GB")
                    .setStorage("1TB SSD")
                    .setGPU("NVIDIA RTX 3080")
                    .setOperatingSystem("Windows 10")
                    .setBluetoothEnabled(true)
                    .setWifiEnabled(true)
                    .build();

            System.out.println(gamingComputer);

            // Create a Computer with only required parameters
            Computer basicComputer = new Computer.Builder("Intel Core i5", "8GB")
                    .build();

            System.out.println(basicComputer);

            // Create a Computer with some optional parameters
            Computer officeComputer = new Computer.Builder("Intel Core i7", "16GB")
                    .setStorage("512GB SSD")
                    .setOperatingSystem("Linux")
                    .setWifiEnabled(true)
                    .build();

            System.out.println(officeComputer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
