package exercise3;

public class Computer {
    // Attributes
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String GPU;
    private final String operatingSystem;
    private final boolean isBluetoothEnabled;
    private final boolean isWifiEnabled;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.operatingSystem = builder.operatingSystem;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isWifiEnabled = builder.isWifiEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                ", isWifiEnabled=" + isWifiEnabled +
                '}';
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private final String CPU;
        private final String RAM;

        // Optional parameters
        private String storage;
        private String GPU;
        private String operatingSystem;
        private boolean isBluetoothEnabled;
        private boolean isWifiEnabled;

        // Constructor with required parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Methods to set optional parameters
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Builder setWifiEnabled(boolean isWifiEnabled) {
            this.isWifiEnabled = isWifiEnabled;
            return this;
        }

        // Build method to return an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}
