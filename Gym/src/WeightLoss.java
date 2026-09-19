public abstract class WeightLoss implements IWeightLoss {
    String name;
    double weight;

    public WeightLoss(WeightLossModel model){
        this.name= model.CustomerName;
        this.weight= model.WeightLoss;
    }
    @Override
    public String getCustomerName(){
        return name;
    }
    @Override
    public double getWeightLoss(){
        return weight;
    }
}
