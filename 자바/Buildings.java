public class Buildings {
    private String address;
    private int zip;
    private String owner;
    private double height;
    private int maxi;

    public Buildings(){

    }
    public void setAddress(String address){
        this.address= address;
    }
    public void setZip(int zip){
        this.zip=zip;
    }
    public void setOwner(String owner){
        this.owner= owner;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setMaxi(int maxi){
        this.maxi=maxi;
    }
    public String getAddress(){
        return this.address;
    }
    public int getZip(){
        return this.zip;
    }
    public String getOwner(){
        return this.owner;
    }
    public double getHeight(){
        return this.height;
    }
    public int getMaxi(){
        return this.maxi;
    }
}
