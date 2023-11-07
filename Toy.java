class Toy implements Comparable<Toy> {
   private int id;         //  идентификатор 
   private String name;    // Название 
   private int weight;     // Вес 

   /**
      Конструктор для создания экземпляра игрушки.
    
    *  @param id       идентификатор 
    *  @param name     Название 
    *  @param weight   Вес 
    */
   public Toy(int id, String name, int weight) {
       this.id = id;
       this.name = name;
       this.weight = weight;
   }

   /**
      Метод для получения идентификатора игрушки.
    *
    * @return -  идентификатор 
    */
   public int getId() {
       return id;
   }

   /**
     Метод для получения названия игрушки.
    
    * @return Название 
    */
   public String getName() {
       return name;
   }

   /**
    * Метод для получения веса игрушки.
    
    * @return Вес 
    */
   public int getWeight() {
       return weight;
   }

   /**
    * Метод для сравнения по весу.
    
    * @param other Другая игрушка
    * @return Результат сравнения 
    */
   @Override
   public int compareTo(Toy other) {
       return Integer.compare(this.weight, other.weight);
   }
}
   

