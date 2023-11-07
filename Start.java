public class Start {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        
        //  Добавим нужное количество игрушек в магазин
        
        toyStore.put(1, "Constructor", 2);
        toyStore.put(2, "Robot", 2);
        toyStore.put(3, "Fayri", 1);
        toyStore.put(4, "Car", 3);
        toyStore.put(5, "Barbi", 3);
        toyStore.put(6, "Buratino", 3);
        toyStore.put(7, "Volk", 5);
        toyStore.put(8, "Pikachu", 4);
        toyStore.put(9, "Ball", 3);
        toyStore.put(10, "Airplane", 4);

        
        // Запускаем розыгрыш и записываем результаты в файл
         
        toyStore.runWriteToFile("результаты_розыгрыша.txt");
        System.out.println("List of toy giveaways: \n" + "Смотри - результаты_розыгрыша.txt");
        
    }
}