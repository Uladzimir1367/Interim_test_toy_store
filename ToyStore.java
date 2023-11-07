import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyStore {
   private PriorityQueue<Toy> toyQueue = new PriorityQueue<>();
    private Random random = new Random();

    /**
      Метод для добавления новой игрушки в магазин.
     
     * @param id     ID 
     * @param name   Название 
     * @param weight Вес 
     */
    public void put(int id, String name, int weight) {
        Toy toy = new Toy(id, name, weight);
        toyQueue.add(toy);
    }

    /**
       Метод для случайного выбора игрушки на основе их весов.
     
     * @return ID игрушки
     */
    public int get() {
        int totalWeight = toyQueue.stream().mapToInt(Toy::getWeight).sum();
        int randomWeight = random.nextInt(totalWeight);

        int currentWeight = 0;
        for (Toy toy : toyQueue) {
            currentWeight += toy.getWeight();
            if (randomWeight < currentWeight) {
                return toy.getId();
            }
        }

        // Если что-то пошло не так, вернем -1
        return -1;
    }

    
    //  Метод для запуска розыгрыша и записи результатов в файл.
     
    public void runWriteToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 10; i++) {
                int selectedToyId = get();
                writer.write("Toy raffle " + (i + 1) + ": Toy selected ID  " + selectedToyId + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

