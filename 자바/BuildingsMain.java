import java.util.Vector;

public class BuildingsMain {
    public static void main(String[] args) {
        Buildings building1 = new Buildings();
        Buildings building2 = new Buildings();
        Buildings building3 = new Buildings();

        building1.setAddress("서울");
        building1.setHeight(100);
        building1.setMaxi(6);
        building1.setOwner("효민");
        building1.setZip(02);

        building2.setZip(03);
        building2.setOwner("효민민효");
        building2.setMaxi(8);
        building2.setHeight(120.2);
        building2.setAddress("서초");

        building3.setZip(06);
        building3.setOwner("민효");
        building3.setMaxi(9);
        building3.setHeight(160.2);
        building3.setAddress("서울");

        Vector <Buildings> vector = new Vector<>();
        vector.add(building1);
        vector.add(building2);
        vector.add(building3);

        for(int i= 0;i<3;i++){
            System.out.println(vector.get(i).getZip());
        }
    }
}
