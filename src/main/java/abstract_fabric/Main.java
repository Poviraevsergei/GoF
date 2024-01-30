package abstract_fabric;

import abstract_fabric.fabric.FurnitureFabric;
import abstract_fabric.fabric.MetalFurnitureFabric;
import abstract_fabric.fabric.WoodFurnitureFabric;
import abstract_fabric.model.Chair;
import abstract_fabric.model.Sofa;
import abstract_fabric.model.Table;

public class Main {
    public static void main(String[] args) {
        FurnitureFabric fabric = new MetalFurnitureFabric();
        Chair chair = fabric.getChair();
        Sofa sofa = fabric.getSofa();
        Table table = fabric.getTable();

        System.out.println("Ваша мебель:");
        System.out.println("Стул:" + chair.getMaterial());
        System.out.println("Стол:" + table.getMaterial());
        System.out.println("Диван:" + sofa.getMaterial());
    }
}
