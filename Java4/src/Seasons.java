public enum Seasons {
    WINTER(-12),
    SPRING(8),
    SUMMER(20){
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    },
    AUTUMN(10);
    private double temperature;
    Seasons(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription(){
        return "Холодное время года";
    }
}
